<%@page import = "java.util.Date, java.sql.*, java.io.IOException" %>
<!DOCTYPE html>
<html>
<body>
   <h1 style = "color : red; text-align : center">
    <%="Welcome to Jsp" %>
    <%=new java.util.Date() %>
   </h1>
    <%
       for(int i = 1; i <= 10; i++)
       {
    	   out.print(i);
    %>
    <br>
    <%
       }   
    %>
</body>
</html>