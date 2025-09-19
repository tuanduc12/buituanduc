package tt;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.List;

public class WeatherClientGUIFull extends JFrame {
    private final JTextField txtCity = new JTextField();
    private final JButton btnCurrent = new JButton("🌤 Hiện tại");
    private final JButton btnForecast = new JButton("📊 5 ngày");
    private final JButton btnHistory = new JButton("📜 Lịch sử");
    private final JTextArea txtResult = new JTextArea();
    private final JLabel lblIcon = new JLabel("⛅", SwingConstants.CENTER);
    private DatagramSocket socket;
    private InetAddress serverAddr;
    private static final int SERVER_PORT = 8886;
    private static final int BUFFER_SIZE = 8125;

    public WeatherClientGUIFull() {
        setTitle("🌍 WeatherApp - UDP Client");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initUI();
        initSocket();
    }

    private void initUI() {
        // ========== TOP ==========
        JPanel top = new JPanel(new BorderLayout(10, 10));
        top.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

        JLabel lblCity = new JLabel("🏙 Thành phố:");
        lblCity.setFont(new Font("SansSerif", Font.BOLD, 14));
        top.add(lblCity, BorderLayout.WEST);

        txtCity.setFont(new Font("SansSerif", Font.PLAIN, 14));
        txtCity.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY, 1),
                BorderFactory.createEmptyBorder(4, 6, 4, 6)
        ));
        top.add(txtCity, BorderLayout.CENTER);

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        btnPanel.add(btnCurrent);
        btnPanel.add(btnForecast);
        btnPanel.add(btnHistory);
        top.add(btnPanel, BorderLayout.EAST);

        add(top, BorderLayout.NORTH);

        // ========== CENTER ==========
        txtResult.setEditable(false);
        txtResult.setFont(new Font("Consolas", Font.PLAIN, 14));
        txtResult.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));
        JScrollPane scroll = new JScrollPane(txtResult);

        lblIcon.setFont(new Font("SansSerif", Font.PLAIN, 64));
        lblIcon.setPreferredSize(new Dimension(120, 120));

        JSplitPane splitPane = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT,
                new JScrollPane(lblIcon),
                scroll
        );
        splitPane.setDividerLocation(150);
        add(splitPane, BorderLayout.CENTER);

        // ========== ACTIONS ==========
        btnCurrent.addActionListener(e -> doCurrent());
        btnForecast.addActionListener(e -> doForecast());
        btnHistory.addActionListener(e -> showHistoryDialog());
    }

    private void initSocket() {
        try {
            socket = new DatagramSocket();
            serverAddr = InetAddress.getByName("127.0.0.1");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khởi tạo socket: " + e.getMessage());
        }
    }

    // ================== HÀM GỬI / NHẬN ==================
    private void sendRequest(String req) throws Exception {
        byte[] b = req.getBytes(StandardCharsets.UTF_8);
        DatagramPacket p = new DatagramPacket(b, b.length, serverAddr, SERVER_PORT);
        socket.send(p);
    }

    private String receiveResponse() throws Exception {
        byte[] buf = new byte[BUFFER_SIZE];
        DatagramPacket p = new DatagramPacket(buf, buf.length);
        socket.setSoTimeout(5000);
        socket.receive(p);
        return new String(p.getData(), 0, p.getLength(), StandardCharsets.UTF_8);
    }

    // ================== HÀM CHỨC NĂNG ==================
    private void doCurrent() {
        String city = txtCity.getText().trim();
        if (city.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nhập tên thành phố!");
            return;
        }
        try {
            sendRequest("CURRENT:" + city);
            String resp = receiveResponse();
            if (resp.startsWith("ERROR:")) {
                txtResult.setText(resp);
                lblIcon.setIcon(null);
                return;
            }
            String[] parts = resp.split("\\|");
            if (parts.length >= 5) {
                txtResult.setText("🏙 Thành phố: " + parts[1] +
                        "\n🌡 Nhiệt độ: " + parts[2] + " °C" +
                        "\n☁ Trạng thái: " + parts[3]);
                setIconFromCode(parts[4]);
            } else {
                txtResult.setText("Phản hồi không hợp lệ: " + resp);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        }
    }

    private void doForecast() {
        String city = txtCity.getText().trim();
        if (city.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nhập tên thành phố!");
            return;
        }
        try {
            sendRequest("FORECAST:" + city);
            String resp = receiveResponse();
            if (resp.startsWith("ERROR:")) {
                txtResult.setText(resp);
                return;
            }

            // Parse dữ liệu
            Map<String, Double> map = new LinkedHashMap<>();
            String[] pairs = resp.split(";");
            for (String p : pairs) {
                String[] kv = p.split("=");
                if (kv.length == 2) {
                    map.put(kv[0], Double.parseDouble(kv[1]));
                }
            }

            // Hiển thị text
            StringBuilder sb = new StringBuilder();
            sb.append("📊 Dự báo 5 ngày:\n");
            map.forEach((d, t) -> sb.append(d).append(" : ").append(t).append("°C\n"));
            txtResult.setText(sb.toString());

            // Mở biểu đồ cột
            ChartFrame cf = new ChartFrame("📊 Biểu đồ 5 ngày - " + city, map);
            cf.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        }
    }

    private void showHistoryDialog() {
        File f = new File("history.txt");
        if (f.exists()) {
            try {
                java.util.List<String> lines = java.nio.file.Files.readAllLines(f.toPath(), StandardCharsets.UTF_8);
                JTextArea ta = new JTextArea(String.join("\n", lines));
                ta.setEditable(false);
                JScrollPane sp = new JScrollPane(ta);
                sp.setPreferredSize(new Dimension(600, 400));
                JOptionPane.showMessageDialog(this, sp, "📜 Lịch sử", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Đọc lịch sử lỗi: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Không có file lịch sử.");
        }
    }

    private void setIconFromCode(String code) {
        try {
            String url = "http://openweathermap.org/img/wn/" + code + "@2x.png";
            BufferedImage img = ImageIO.read(new URL(url));
            if (img != null) {
                Image scaled = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                lblIcon.setIcon(new ImageIcon(scaled));
            }
        } catch (Exception e) {
            lblIcon.setIcon(null);
        }
    }

    // ================== BIỂU ĐỒ CỘT ==================
    private static class ChartFrame extends JFrame {
        public ChartFrame(String title, Map<String, Double> data) {
            super(title);
            setSize(700, 400);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            add(new BarChartPanel(data));
        }
    }

    private static class BarChartPanel extends JPanel {
        private final Map<String, Double> data;
        private final List<String> labels;
        private final List<Double> values;

        public BarChartPanel(Map<String, Double> data) {
            this.data = data;
            this.labels = new ArrayList<>(data.keySet());
            this.values = new ArrayList<>(data.values());
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (values.isEmpty()) {
                g.drawString("Không có dữ liệu để vẽ", 10, 20);
                return;
            }

            Graphics2D g2 = (Graphics2D) g;
            int w = getWidth();
            int h = getHeight();
            int padding = 50;
            int left = padding;
            int right = w - padding;
            int top = padding;
            int bottom = h - padding;

            // Trục
            g2.drawLine(left, bottom, right, bottom);
            g2.drawLine(left, bottom, left, top);

            double max = Collections.max(values);
            double min = 0; // luôn từ 0
            double range = (max - min) == 0 ? 1 : (max - min);

            int n = values.size();
            int plotW = right - left;
            int plotH = bottom - top;
            int barW = plotW / (n * 2);

            for (int i = 0; i < n; i++) {
                double v = values.get(i);
                int x = left + i * (2 * barW) + barW / 2;
                int barH = (int) ((v - min) / range * plotH);
                int y = bottom - barH;

                g2.setColor(new Color(100, 149, 237));
                g2.fillRect(x, y, barW, barH);

                g2.setColor(Color.BLACK);
                g2.drawRect(x, y, barW, barH);

                // nhãn
                String lbl = labels.get(i);
                g2.drawString(lbl, x, bottom + 15);

                // giá trị trên cột
                g2.drawString(String.format("%.1f°C", v), x, y - 5);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new WeatherClientGUIFull().setVisible(true));
    }
}
