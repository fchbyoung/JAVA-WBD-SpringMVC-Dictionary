<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 19/07/2019
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary Vietnamese</title>
  </head>
  <body>
  <form action="/dictionary" method="post">
    <fieldset>
      <legend>Dictionary Vietnamese</legend>
      <input type="text" name="englishWord" placeholder="Enter your word">
      <input type="submit" id="submit" value="Search">
    </fieldset>
  </form>
  </body>
</html>
