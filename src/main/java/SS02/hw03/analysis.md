1. Vì sao error login dùng Request Scope?
   Error chỉ cần hiển thị 1 lần sau submit form
   Request scope tự mất sau 1 request

 Nếu dùng Session:

Lỗi sẽ bị lưu lâu
Người dùng login đúng vẫn thấy lỗi cũ 
2. Vì sao totalViewCount dùng Application Scope?
   Đây là biến dùng chung toàn hệ thống
   Application scope chia sẻ cho tất cả user

Nếu dùng Session:

Mỗi user có 1 biến riêng
→ Không còn là “tổng lượt view hệ thống” 
3. Race Condition là gì?
   Là lỗi xảy ra khi nhiều thread cùng sửa 1 biến
   → gây sai dữ liệu
4. Vì sao code bị Race Condition?
   Integer count = (Integer) application.getAttribute("totalViewCount");
   if (count == null) count = 0;
   count++;
   application.setAttribute("totalViewCount", count);
   Nhiều user cùng đọc count → cùng tăng → ghi đè nhau
   → mất lượt đếm 
5. Cách khắc phục
   Dùng synchronized:
   synchronized (application) {
   Integer count = (Integer) application.getAttribute("totalViewCount");
   if (count == null) count = 0;
   application.setAttribute("totalViewCount", count + 1);
   }