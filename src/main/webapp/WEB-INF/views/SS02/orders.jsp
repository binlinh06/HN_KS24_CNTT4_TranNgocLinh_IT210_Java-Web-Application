<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 06/04/2026
  Time: 11:21 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<h2>
    Xin chào, ${sessionScope.loggedUser}!
    Vai trò: ${sessionScope.role}
</h2>

<table border="1">
    <tr>
        <th>Mã</th>
        <th>Sản phẩm</th>
        <th>Tổng tiền</th>
        <th>Ngày đặt</th>
    </tr>

    <c:forEach var="o" items="${orders}">
        <tr>
            <td>${o.id}</td>
            <td>${o.productName}</td>
            <td>
                <fmt:formatNumber value="${o.total}" type="currency" currencySymbol="₫"/>
            </td>
            <td>
                <fmt:formatDate value="${o.orderDate}" pattern="dd/MM/yyyy"/>
            </td>
        </tr>
    </c:forEach>
</table>

<p>
    Tổng lượt xem đơn hàng toàn hệ thống:
    ${applicationScope.totalViewCount}
</p>

<a href="${pageContext.request.contextPath}/logout">Đăng xuất</a>
