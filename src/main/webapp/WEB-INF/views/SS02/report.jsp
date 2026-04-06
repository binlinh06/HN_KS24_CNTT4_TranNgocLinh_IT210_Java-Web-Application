<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 06/04/2026
  Time: 10:59 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>

<h2>Danh sách sinh viên</h2>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Tên</th>
        <th>Điểm</th>
        <th>Xếp loại</th>
    </tr>

    <c:forEach var="student" items="${students}">
        <tr>
            <td><c:out value="${student.id}" /></td>
            <td><c:out value="${student.name}" /></td>
            <td><c:out value="${student.score}" /></td>

            <td>
                <c:choose>
                    <c:when test="${student.score >= 8}">
                        Giỏi
                    </c:when>
                    <c:when test="${student.score >= 5}">
                        Khá
                    </c:when>
                    <c:otherwise>
                        Yếu
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>