<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/28 0028
  Time: 下午 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
请求路径如何磁写，永远以“/"开头
/:代表此时上下文处于容器当中，servlet容器，Tomcat
/项目名称/URL
/s
/s2
/s3
--%>
      <form action="${ctx}/web/m1" method="post">
       <input type="submit" value="提交">
      </form>

      <form action="${ctx}/web/m4" method="get">
         <input type="submit" value="提交">
      </form>

<form action="${ctx}/web/m5" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="提交">
</form>


</body>
</html>
