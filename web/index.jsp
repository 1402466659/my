<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
<h2>欢迎你：
  <%--<%=request.getAttribute("username")%>--%>
  <%=session.getAttribute("username")%>
</h2>
  </body>
</html>
