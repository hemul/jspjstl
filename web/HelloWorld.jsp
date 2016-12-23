<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World JSP</title>
</head>
<body>
Hello World JSP!
<br/>

<%="Hello World JSP from Java String"%>
<br/>

<%=new Date()%>
<br/>

<%
    out.println("Hi from scriptlet");
    out.println("<br/>");
    Date today = new java.util.Date();
    String text = "Today's date is: " + today.toString();

    out.println(text);
%>
<br/>

<%=text%>

</body>
</html>
