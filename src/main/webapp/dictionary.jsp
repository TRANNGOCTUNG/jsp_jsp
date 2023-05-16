<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: ngoct
  Date: 5/16/2023
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%
  Map<String,String> dic = new HashMap<String,String>();
%>
<%
  dic.put("hello", "Xin chào");
  dic.put("how", "Thế nào");
  dic.put("book", "Quyển vở");
  dic.put("computer", "Máy tính");

  String search = request.getParameter("search");

  String result = dic.get(search);

  if(result != null){
    out.println("word: " + search );
    out.println("result: " + result);
  }else {
    out.println("Not Found");
  }
%>
</body>
</html>
