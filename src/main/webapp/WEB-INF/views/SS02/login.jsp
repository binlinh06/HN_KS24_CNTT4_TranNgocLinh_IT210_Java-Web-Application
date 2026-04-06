<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 06/04/2026
  Time: 11:21 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<h2>Đăng nhập</h2>

<form action="${pageContext.request.contextPath}/login" method="post">
    Username: <input type="text" name="username"/><br/>
    Password: <input type="password" name="password"/><br/>
    <button type="submit">Login</button>
</form>

<c:if test="${not empty error}">
    <p style="color:red">${error}</p>
</c:if>
