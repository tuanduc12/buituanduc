<h2 align="center">
    <a href="https://dainam.edu.vn/vi/khoa-cong-nghe-thong-tin">
    🎓 Faculty of Information Technology (DaiNam University)
    </a>
</h2>
<h2 align="center">
   Ứng dụng dự báo thời tiết Online
</h2>
<div align="center">
    <p align="center">
        <img src="docs/aiotlab_logo.png" alt="AIoTLab Logo" width="170"/>
        <img src="docs/fitdnu_logo.png" alt="AIoTLab Logo" width="180"/>
        <img src="docs/dnu_logo.png" alt="DaiNam University Logo" width="200"/>
    </p>

[![AIoTLab](https://img.shields.io/badge/AIoTLab-green?style=for-the-badge)](https://www.facebook.com/DNUAIoTLab)
[![Faculty of Information Technology](https://img.shields.io/badge/Faculty%20of%20Information%20Technology-blue?style=for-the-badge)](https://dainam.edu.vn/vi/khoa-cong-nghe-thong-tin)
[![DaiNam University](https://img.shields.io/badge/DaiNam%20University-orange?style=for-the-badge)](https://dainam.edu.vn)

</div>
#ỨNG DỤNG DỰ BÁO THỜI TIẾT ONLINE





## 🌐 Giới thiệu
Đây là đồ án môn học lập trình mạng với yêu cầu **xây dựng ứng dụng dự báo thời tiết trực tuyến sử dụng giao thức UDP**.  
Ứng dụng cho phép **nhiều client cùng lúc** gửi yêu cầu tới server để lấy thông tin thời tiết từ API **OpenWeatherMap** và hiển thị trong giao diện **Java Swing**.

## 🏗 Kiến trúc hệ thống
- **Server (WeatherServerMulti.java)**  
  - Nhận request từ nhiều client thông qua UDP.  
  - Gọi OpenWeatherMap API để lấy dữ liệu thời tiết hiện tại và dự báo 5 ngày.  
  - Tính toán trung bình nhiệt độ mỗi ngày từ dữ liệu forecast (3h/điểm).  
  - Ghi lại lịch sử yêu cầu vào file `history.txt`.  

- **Client (WeatherClientGUIFull.java)**  
  - Gửi yêu cầu `CURRENT:city` hoặc `FORECAST:city` tới server.  
  - Hiển thị dữ liệu thời tiết hiện tại (nhiệt độ, mô tả, icon).  
  - Vẽ **biểu đồ nhiệt độ 5 ngày** từ dữ liệu dự báo.  
  - Cho phép người dùng xem lại lịch sử yêu cầu.  

- **HistoryManager.java**  
  - Quản lý đọc/ghi file lịch sử (thread-safe).  

## ⚙️ Chức năng chính
- [x] Dự báo thời tiết hiện tại (nhiệt độ, mô tả, icon).  
- [x] Biểu đồ dự báo trung bình nhiệt độ 5 ngày.  
- [x] Lưu lịch sử truy vấn (ngày giờ, thành phố, loại yêu cầu).  
- [x] Hỗ trợ nhiều client đồng thời.  
- [x] Giao diện đồ họa (GUI) thân thiện bằng **Java Swing**.  

## 🚀 Cách cài đặt & chạy

### Yêu cầu
- Java JDK 11+ (có hỗ trợ module `java.desktop`).  
- Kết nối Internet để gọi OpenWeather API.  
- API key hợp lệ từ [OpenWeatherMap](https://openweathermap.org/api).  

### Các bước
1. Clone hoặc tải source code về máy.  
2. Đặt API key của bạn vào file **WeatherServerMulti.java**:
   ```java
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


<img width="586" height="410" alt="image" src="https://github.com/user-attachments/assets/0cbab42c-452f-40f1-bd10-14773d4d8346" />
<img width="586" height="410" alt="image" src="https://github.com/user-attachments/assets/e2e9b26c-7cef-445d-966f-b232577c8f20" />



💡 Ý tưởng phát triển thêm

Thêm lựa chọn ngôn ngữ (đa ngữ: tiếng Việt, tiếng Anh).

Hỗ trợ hiển thị nhiều loại thông tin hơn (độ ẩm, tốc độ gió, áp suất).

Lưu lịch sử vào cơ sở dữ liệu thay vì file.

Thêm chức năng cảnh báo thời tiết (mưa, bão).

Phát triển ứng dụng mobile (Android/iOS) kết nối tới server UDP.
