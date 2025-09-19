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
        <img src="https://github.com/tuanduc12/buituanduc/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/aiotlab_logo.png?raw=true" alt="AIoTLab Logo" width="170"/>
     <img src="https://github.com/tuanduc12/buituanduc/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/fitdnu_logo.png?raw=true" alt="AIoTLab Logo" width="170"/>
    <img src="https://github.com/tuanduc12/buituanduc/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/dnu_logo.png?raw=true" alt="DNU Logo" width="170"/>


[![AIoTLab](https://img.shields.io/badge/AIoTLab-green?style=for-the-badge)](https://www.facebook.com/DNUAIoTLab)
[![Faculty of Information Technology](https://img.shields.io/badge/Faculty%20of%20Information%20T…he-badge)](https://dainam.edu.vn/vi/khoa-cong-nghe-thong-tin)
[![DaiNam University](https://img.shields.io/badge/DaiNam%20University-orange?style=for-the-badge)](https://dainam.edu.vn)

</div>

📖 1. Giới thiệu hệ thống
## 📖 1. Giới thiệu hệ thống
WeatherApp là ứng dụng **Client - Server sử dụng giao thức UDP** để cung cấp thông tin thời tiết cho người dùng:
- Xem **thời tiết hiện tại** của thành phố.
- Xem **dự báo 5 ngày** (dạng văn bản + biểu đồ cột).
- Xem lại **lịch sử tra cứu**.

Ứng dụng gồm 2 thành phần:
- **WeatherServerMulti**: Server UDP trả lời yêu cầu thời tiết từ client.
- **WeatherClientGUIFull**: Client GUI (Java Swing) cho phép người dùng nhập tên thành phố và hiển thị dữ liệu.

---

## 🔧 2. Công nghệ sử dụng
- **Java SE 11+**: Ngôn ngữ lập trình chính.  
- **Java Swing**: Xây dựng giao diện người dùng.  
- **UDP DatagramSocket**: Giao tiếp client ↔ server.  
- **JFreeChart**: Hiển thị biểu đồ cột dự báo 5 ngày.  
- **OpenWeatherMap API** (hoặc dữ liệu mô phỏng): nguồn dữ liệu thời tiết.  

---

🚀 3. Hình ảnh các chức năng
    <div style="display: flex; justify-content: center; gap: 10px;">
  <img src="https://github.com/tuanduc12/buituanduc/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/z7026962704990_b8904a54d1c430f098ab743bf21438a7.jpg?raw=true" alt="Ảnh 1" width="570"/>
  <img src="https://github.com/tuanduc12/buituanduc/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/z7026963764760_3f4944e734b62cb0939ede1a7610539c.jpg?raw=true" alt="Ảnh 2" width="570"/>
  <img src="https://github.com/tuanduc12/buituanduc/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/z7027149607276_b15c295077bd3698d5936161615a2b91.jpg?raw=true" alt="Ảnh 3" width="570"/>
</div>



## 📝 3. Hướng dẫn cài đặt và sử dụng
### ⚙️ Cài đặt
1. Clone hoặc tải source code về máy.  
2. Mở project trong IDE (IntelliJ / Eclipse / NetBeans).  
3. Thêm thư viện **JFreeChart** vào project:  
   - Nếu dùng Maven:  
     ```xml
     <dependency>
         <groupId>org.jfree</groupId>
         <artifactId>jfreechart</artifactId>
         <version>1.5.4</version>
     </dependency>
     ```
   - Nếu không dùng Maven: tải file `.jar` JFreeChart và add vào `classpath`.

### ▶️ Sử dụng
1. Chạy **WeatherServerMulti.java** (server) → lắng nghe tại `127.0.0.1:8888`.  
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
