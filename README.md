<h2 align="center">
    <a href="https://dainam.edu.vn/vi/khoa-cong-nghe-thong-tin">
    🎓 Faculty of Information Technology (DaiNam University)
    </a>
</h2>
<h2 align="center">
   ỨNG DỤNG DỰ BÁO THỜI TIẾT ONLINE 
</h2>
<div align="center">
    <p align="center">
        <img src="https://github.com/tuanduc12/buituanduc/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/aiotlab_logo.png?raw=true" alt="AIoTLab Logo" width="170"/>
     <img src="https://github.com/tuanduc12/buituanduc/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/fitdnu_logo.png?raw=true" alt="AIoTLab Logo" width="170"/>
    <img src="https://github.com/tuanduc12/buituanduc/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/dnu_logo.png?raw=true" alt="DNU Logo" width="170"/>


[![AIoTLab](https://img.shields.io/badge/AIoTLab-green?style=for-the-badge)](https://www.facebook.com/DNUAIoTLab)
[![Faculty of Information Technology](https://img.shields.io/badge/Faculty%20of%20Information%20T…he-badge)](https://dainam.edu.vn/vi/khoa-cong-nghe-thong-tin)
[![DaiNam University](https://img.shields.io/badge/DaiNam%20University-orange?style=for-the-badge)](https://dainam.edu.vn)

</div>

## 📖 1. Giới thiệu hệ thống
Học phần trang bị cho người học những kiến thức nền tảng của lập trình mạng và các kỹ năng cần thiết để thiết kế và cài đặt các ứng dụng mạng và các chuẩn ở mức ứng dụng dựa trên mô hình Client/Server, có sử dụng các giao tiếp chương trình dựa trên Sockets. Kết thúc học phần, sinh viên có thể viết các chương trình ứng dụng mạng với giao thức tầng ứng dụng tự thiết kế.

## 🔧 2. Công nghệ sử dụng
- **Java SE 11+**: Ngôn ngữ lập trình chính.  
- **Java Swing**: Xây dựng giao diện người dùng.  
- **UDP DatagramSocket**: Giao tiếp client ↔ server.  
- **JFreeChart**: Hiển thị biểu đồ cột dự báo 5 ngày.  
- **OpenWeatherMap API** (hoặc dữ liệu mô phỏng): nguồn dữ liệu thời tiết.  

---

## 🚀 3. Hình ảnh các chức năng
<div style="display: flex; flex-wrap: wrap; gap: 10px; justify-content: center;">
  <img src="https://github.com/tuanduc12/dubaothoitiet1601/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/1.png?raw=true" alt="Ảnh 1" width="400"/>
  <img src="https://github.com/tuanduc12/dubaothoitiet1601/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/12.png?raw=true" alt="Ảnh 2" width="400"/>
  <img src="https://github.com/tuanduc12/dubaothoitiet1601/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/13.jpg?raw=true" alt="Ảnh 3" width="400"/>
  <img src="https://github.com/tuanduc12/dubaothoitiet1601/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/3.png?raw=true" alt="Ảnh 4" width="400"/>
  <img src="https://github.com/tuanduc12/dubaothoitiet1601/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/5.png?raw=true" alt="Ảnh 5" width="400"/>
  <img src="https://github.com/tuanduc12/dubaothoitiet1601/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/7.png?raw=true" alt="Ảnh 6" width="400"/>
  <img src="https://github.com/tuanduc12/dubaothoitiet1601/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/8.png?raw=true" alt="Ảnh 7" width="400"/>
   <img src="https://github.com/tuanduc12/dubaothoitiet1601/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/22.jpg?raw=true" alt="Ảnh 22" width="400">

</div>



## 📝 3. Hướng dẫn cài đặt và sử dụng
### ⚙️ Cài đặt
Yêu cầu

Cài đặt Java JDK 8+

Có kết nối mạng Internet

Tài khoản và API key của OpenWeatherMap

Clone project git clone https://github.com/yourusername/WeatherApp.git cd WeatherApp
Chạy Server

Biên dịch:
javac -d out src/tt/*.java

Chạy server:

java -cp out tt.WeatherServerMulti

Mặc định server chạy trên port 9999

Chạy Client GUI

Trong terminal khác:

java -cp out tt.WeatherClientGUIFull

### ▶️ Sử dụng

1. Chạy **WeatherServerMulti.java** (server) → lắng nghe tại `127.0.0.1:8888`.
   Nhập tên thành phố (ví dụ: Hanoi, London, Tokyo).

2. Chạy **WeatherClientGUIFull.java** (client).

3. Nhập tên thành phố → bấm **🌤 Hiện tại** hoặc **📊 5 ngày** để xem dữ liệu.

4. Có thể mở phần **📜 Lịch sử** để xem lại các lần tra cứu trước.


---
Họ tên: Bùi Tuấn Đức
Lớp: CNTT 16-01
Email: tuanduc1282004@gmail.com

## 📝 4. License

© 2025 AIoTLab, Faculty of Information Technology, DaiNam University. All rights reserved.

---
