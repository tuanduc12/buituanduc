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

## 🖥️ 2. Công nghệ sử dụng
## 2.1. Ngôn ngữ lập trình

Java: được sử dụng để xây dựng toàn bộ ứng dụng.

Server: xử lý yêu cầu từ client, gọi API thời tiết và trả kết quả về.

Client: giao diện đồ họa (Swing UI) để người dùng nhập tên thành phố và xem dữ liệu.

## 2.2. Giao thức mạng

UDP (User Datagram Protocol)

Dùng để truyền dữ liệu nhanh giữa Client và Server.

Ưu điểm: tốc độ cao, không cần thiết lập kết nối.

Ứng dụng phù hợp vì dữ liệu thời tiết không yêu cầu toàn vẹn tuyệt đối từng gói tin.

## 2.3. API dữ liệu

OpenWeatherMap API

Cung cấp dữ liệu thời tiết theo thành phố, bao gồm: nhiệt độ, độ ẩm, tình trạng thời tiết, dự báo theo giờ/ngày.

Kết quả trả về dưới dạng JSON, dễ dàng phân tích bằng thư viện Java.

## 2.4. Thư viện và công cụ hỗ trợ

Gson (Google Gson): để parse chuỗi JSON thành đối tượng Java.

org.json: thao tác với đối tượng JSON (JSONArray, JSONObject).

JFreeChart + JCommon: vẽ biểu đồ trực quan (nếu project có hiển thị chart).

Java Swing: xây dựng giao diện người dùng (UI).

ExecutorService: hỗ trợ xử lý đa luồng trong Server để phục vụ nhiều Client cùng lúc.

## 2.5. Môi trường phát triển

Eclipse IDE: môi trường phát triển chính, hỗ trợ quản lý project Java, import thư viện và chạy trực tiếp Client/Server.

JDK 8+: bộ công cụ Java Development Kit để biên dịch và chạy ứng dụng.

WinRAR/7-Zip: giải nén project từ file .rar trước khi import.

---

## 🚀 3. Hình ảnh các chức năng
<div style="display: flex; flex-direction: column; align-items: center; gap: 20px;">

  <div>
    <h3>1. Đăng ký</h3>
      <img src="https://github.com/tuanduc12/dubaothoitiet1601/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/3.png?raw=true" alt="Chức năng tìm kiếm" width="500"/>
  </div>

  <div>
    <h3>2. Đăng nhập</h3>
       <img src="https://github.com/tuanduc12/dubaothoitiet1601/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/1.png?raw=true" alt="Đăng ký" width="500"/>
  </div>

  <div>
    <h3>3. Giao diện chính</h3>
      <img src="https://github.com/tuanduc12/dubaothoitiet1601/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/22.jpg?raw=true" alt="Biểu đồ nhiệt độ 5 ngày" width="700"/>
  </div>

  <div>
    <h3>4. Chức năng tìm kiếm</h3>
   <img src="https://github.com/tuanduc12/dubaothoitiet1601/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/5.png?raw=true" alt="Chức năng lịch sử tìm kiếm" width="700"/>
  </div>

  <div>
    <h3>5. Chức năng lịch sử tìm kiếm</h3>
      <img src="https://github.com/tuanduc12/dubaothoitiet1601/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/12.png?raw=true" alt="Đăng nhập" width="700"/>
  </div>

  <div>
    <h3>6. Thời tiết hiện tại</h3>
    <img src="https://github.com/tuanduc12/dubaothoitiet1601/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/7.png?raw=true" alt="Thời tiết hiện tại" width="700"/>
  </div>

  <div>
    <h3>7. Dự báo 5 ngày tới</h3>
    <img src="https://github.com/tuanduc12/dubaothoitiet1601/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/8.png?raw=true" alt="Dự báo 5 ngày tới" width="700"/>
  </div>

  <div>
    <h3>8. Biểu đồ nhiệt độ 5 ngày</h3>
    <img src="https://github.com/tuanduc12/dubaothoitiet1601/blob/main/LTM-Du-Bao-Thoi-Tiet-Online-main/anh/13.jpg?raw=true" alt="Giao diện chính" width="700"/>
  </div>

</div>



## 📝 3. Hướng dẫn cài đặt và sử dụng
## 3.1. Yêu cầu hệ thống

Máy tính cài đặt Java JDK 8 trở lên

IDE Eclipse (khuyến nghị 2023-xx hoặc mới hơn)

Thư viện ngoài cần thiết:

gson-2.x.jar (xử lý JSON)

json-20240303.jar (nếu code dùng org.json)

jfreechart.jar, jcommon.jar (nếu có hiển thị biểu đồ)

## 3.2. Cài đặt

Giải nén project

Giải nén file thoitiet.rar vào một thư mục (ví dụ: D:\WeatherApp).

Import vào Eclipse

Mở Eclipse → File → Import…

Chọn General → Existing Projects into Workspace → Next

Ở mục Select root directory, bấm Browse… chọn thư mục vừa giải nén

Chọn project hiển thị → Finish

Thêm thư viện ngoài

Chuột phải vào project → Properties

Chọn Java Build Path → Libraries → Add External JARs…

Thêm các file .jar (gson, json, jfreechart, jcommon) trong thư mục lib/ nếu có.

## 3.3. Sử dụng chương trình
1. Chạy Server

Trong Eclipse, mở file WeatherServerUDP.java (hoặc WeatherServerMulti.java).

Nhấn chuột phải → Run As → Java Application.

Cửa sổ Console hiển thị:

=== UDP Weather Server ===
Đang lắng nghe trên cổng: 5555


→ nghĩa là server đã sẵn sàng.

2. Chạy Client

Mở file WeatherClientUDP.java

Run As → Java Application

Giao diện đồ họa (Swing UI) hiện ra.

3. Nhập thông tin và xem kết quả

Nhập tên thành phố (ví dụ: Hà Nội, Đà Nẵng, Hồ Chí Minh).

Nhấn nút Lấy Thời Tiết (Hiện tại) để xem dữ liệu hiện tại.

Nhấn nút Lấy Dự Báo để xem dự báo nhiều khung giờ.

Kết quả trả về hiển thị ở màn hình chính và/hoặc biểu đồ (nếu code có tích hợp JFreeChart).

---
Họ tên: Bùi Tuấn Đức
Lớp: CNTT 16-01
Email: tuanduc1282004@gmail.com

## 📝 4. License

© 2025 AIoTLab, Faculty of Information Technology, DaiNam University. All rights reserved.

---
