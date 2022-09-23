<%--
  Created by IntelliJ IDEA.
  User: shushi
  Date: 2022/9/23
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <form action="/simple-mvc/upload.do" method="post" enctype="multipart/form-data">
      <input name="file" type="file">
      <input name="comment" type="text">
      <input type="submit" value="upload">
    </form>
  </body>
</html>
