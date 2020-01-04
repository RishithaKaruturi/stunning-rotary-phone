package com.del.third.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.del.third.dao.CourseDAO;
import com.del.third.entity.Courses;
@WebServlet("/CoursesCrudServlet")
public class CoursesCrudServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			                                 throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String submit = request.getParameter("sub");
		CourseDAO cdao = new CourseDAO();
		Courses c = new Courses();
		String message = "Successfully";
		c.setCourse_id(Integer.parseInt(request.getParameter("cid")));
		RequestDispatcher rd = request.getRequestDispatcher("CoursesCrud.jsp");
        if(submit.equals("Add_Courses") || submit.equals("Modify_Courses"))
        {
        	c.setCourse_name(request.getParameter("cname"));
        	c.setCourse_duration(Integer.parseInt(request.getParameter("cduration")));
        	c.setCourse_fee(Double.parseDouble(request.getParameter("cfee")));
        	if(submit.contentEquals("Add_Courses"))
        	{
        		cdao.insertCourses(c);
        		message = message+"Course Inserted";
        	}
        	else
        	{
        		cdao.modifyCourses(c);
        		message = message+"Course Modified";
        	}
        }
        else if(submit.equals("Delete_Courses"))
        {
        	if(cdao.removeCourses(c.getCourse_id()))
        		message = message+"Courses Deleted";
        	else
        		message = "Deletion Failed";
        }
        else if(submit.equals("Show_Courses"))
        {
        	c = cdao.getCourses(c.getCourse_id());
        	request.setAttribute("crs",c);
        }
        out.print("<h1><center>"+message+"</center></h1>");
        rd.include(request,response);
}
}

		