<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  if (session == null || session.getAttribute("user") == null) {
    response.sendRedirect("login.jsp");
    return;
  }
%>
<html>
<head>
  <title>Chào mừng</title>
</head>
<body>
<h2>Chào mừng, <%= session.getAttribute("user") %>!</h2>
<a href="index.jsp">Đăng xuất</a>
</body>
</html>
