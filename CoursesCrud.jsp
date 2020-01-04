<%@ page import = "com.del.third.entity.Courses,com.del.third.dao.CourseDAO"%>
<%
   Courses c = (Courses)request.getAttribute("crs");
   if(c == null)  c = new Courses();
%>
<html>
<body>
   <form action = CoursesCrudServlet>
     <table align = center width = 50% bgcolor = grey>
       <tr>
         <th>Course_id</th>
         <td><input type=text name=cid value =<%=c.getCourse_id()%>></td>
       </tr>
       <tr>
         <th>Course_name</th>
         <td><input type=text name=cname value =<%=c.getCourse_name()%>></td>
       </tr>
       <tr>
         <th>Course_duration</th>
         <td><input type=text name=cduration value =<%=c.getCourse_duration()%>></td>
       </tr>
       <tr>
         <th>Course_fee</th>
         <td><input type=text name=cfee value =<%=c.getCourse_fee()%>></td>
       </tr>
       <tr>
         <td><input type = submit value = Add_Courses name = "sub"></td>
         <td><input type = submit value = Show_Courses name = "sub"></td>
       </tr>
       <tr>
         <td><input type = submit value = Delete_Courses name = "sub"></td>
         <td><input type = submit value = Modify_Courses name = "sub"></td>
       </tr>
     </table>
</form>
</html>