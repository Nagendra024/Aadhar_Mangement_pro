<%@page import="com.Digit.Aahar_pro.bean.AadharDetails"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
session = request.getSession();
List l=(List) session.getAttribute("lists");
Iterator ite=l.iterator();

while(ite.hasNext()) {
	AadharDetails p=(AadharDetails) ite.next();
	out.println(p.getA_id()+" "+p.getU_name());
}
%>
<a href="Home.html">GO BACK</a>

</body>
</html>