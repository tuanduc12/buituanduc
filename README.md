<h2 align="center">
    <a href="https://dainam.edu.vn/vi/khoa-cong-nghe-thong-tin">
    🎓 Faculty of Information Technology (DaiNam University)
    </a>
</h2>
<h2 align="center">
   XÂY DỰNG ỨNG DỤNG CHAT CLIENT-SERVER SỬ DỤNG GIAO THỨC TCP
</h2>
<div align="center">
    <p align="center">
      <img src="https://github.com/Tank97king/LapTrinhMang/blob/main/X%C3%8…O%20TH%E1%BB%A8C%20TCP/%E1%BA%A2nh/aiotlab_logo.png?raw=true" alt="AIoTLab Logo" width="170"/>
      <img src="https://github.com/Tank97king/LapTrinhMang/blob/main/X%C3%8…AO%20TH%E1%BB%A8C%20TCP/%E1%BA%A2nh/fitdnu_logo.png?raw=true" alt="FITDNU Logo" width="180"/>
      <img src="https://github.com/Tank97king/LapTrinhMang/blob/main/X%C3%8…0GIAO%20TH%E1%BB%A8C%20TCP/%E1%BA%A2nh/dnu_logo.png?raw=true" alt="DaiNam University Logo" width="200"/>
    </p>

[![AIoTLab](https://img.shields.io/badge/AIoTLab-green?style=for-the-badge)](https://www.facebook.com/DNUAIoTLab)
[![Faculty of Information Technology](https://img.shields.io/badge/Faculty%20of%20Information%20T…he-badge)](https://dainam.edu.vn/vi/khoa-cong-nghe-thong-tin)
[![DaiNam University](https://img.shields.io/badge/DaiNam%20University-orange?style=for-the-badge)](https://dainam.edu.vn)

</div>


🏗 Kiến trúc hệ thống
Server (WeatherServerMulti.java)

Nhận request từ nhiều client thông qua UDP.
Gọi OpenWeatherMap API để lấy dữ liệu thời tiết hiện tại và dự báo 5 ngày.
Tính toán trung bình nhiệt độ mỗi ngày từ dữ liệu forecast (3h/điểm).
Ghi lại lịch sử yêu cầu vào file history.txt.
Client (WeatherClientGUIFull.java)

Gửi yêu cầu CURRENT:city hoặc FORECAST:city tới server.
Hiển thị dữ liệu thời tiết hiện tại (nhiệt độ, mô tả, icon).
Vẽ biểu đồ nhiệt độ 5 ngày từ dữ liệu dự báo.
🌐 Giới thiệu
Đây là đồ án môn học lập trình mạng với yêu cầu xây dựng ứng dụng dự báo thời tiết trực tuyến sử dụng giao thức UDP.
Ứng dụng cho phép nhiều client cùng lúc gửi yêu cầu tới server để lấy thông tin thời tiết từ API OpenWeatherMap và hiển thị trong giao diện Java Swing.

🏗 Kiến trúc hệ thống
Server (WeatherServerMulti.java)

Nhận request từ nhiều client thông qua UDP.
Gọi OpenWeatherMap API để lấy dữ liệu thời tiết hiện tại và dự báo 5 ngày.
Tính toán trung bình nhiệt độ mỗi ngày từ dữ liệu forecast (3h/điểm).
Ghi lại lịch sử yêu cầu vào file history.txt.
Client (WeatherClientGUIFull.java)

Gửi yêu cầu CURRENT:city hoặc FORECAST:city tới server.
Hiển thị dữ liệu thời tiết hiện tại (nhiệt độ, mô tả, icon).
Vẽ biểu đồ nhiệt độ 5 ngày từ dữ liệu dự báo.
Cho phép người dùng xem lại lịch sử yêu cầu.
HistoryManager.java

Quản lý đọc/ghi file lịch sử (thread-safe).
⚙️ Chức năng chính
 Dự báo thời tiết hiện tại (nhiệt độ, mô tả, icon).
 Biểu đồ dự báo trung bình nhiệt độ 5 ngày.
 Lưu lịch sử truy vấn (ngày giờ, thành phố, loại yêu cầu).
 Hỗ trợ nhiều client đồng thời.
 Giao diện đồ họa (GUI) thân thiện bằng Java Swing.
🚀 Cách cài đặt & chạy
Yêu cầu
Java JDK 11+ (có hỗ trợ module java.desktop).
Kết nối Internet để gọi OpenWeather API.
API key hợp lệ từ OpenWeatherMap.
Các bước
Clone hoặc tải source code về máy.
Đặt API key của bạn vào file WeatherServerMulti.java:
private static final String API_KEY = "YOUR_API_KEY";
3.Biên dịch:

javac --add-modules java.desktop *.java

4.Chạy server:

java --add-modules java.desktop WeatherServerMulti

5.Chạy client (mở nhiều cửa sổ client nếu muốn):

java --add-modules java.desktop WeatherClientGUIFull

📊 Minh họa giao diện

Ô nhập thành phố + nút thao tác.

TextArea hiển thị kết quả.

Icon thời tiết (lấy từ OpenWeather).

Biểu đồ dự báo 5 ngày (vẽ trong GUI).



### [Khoá 16](./docs/projects/K16/README.md)

## 📝 4. License

© 2025 AIoTLab, Faculty of Information Technology, DaiNam University. All rights reserved.

---
