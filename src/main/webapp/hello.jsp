<%@ page language="java" pageEncoding="UTF-8"%> <!-- ① -->
<%@ page import="java.util.Date"%> <!-- ② -->
<%
	Date nowDate = new Date(); // ③
%>
<html>
<head></head>
<body>
<p>Hello, World!</p>
<p>Now data : <%=nowDate%></p> <!-- ④ -->
</body>
</html>