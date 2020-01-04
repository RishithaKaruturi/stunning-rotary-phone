package com.del.third.dao;
import java.sql.*;
import com.del.third.entity.Courses;
public class CourseDAO 
{
   public boolean insertCourses(Courses crs)
   {
	   int count = 0;
	   Connection con = null;
	   PreparedStatement pst = null;
	   String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	   try
	   {
	      Class.forName("oracle.jdbc.driver.OracleDriver");
		  con = DriverManager.getConnection(url,"scott","tiger");
		  pst = con.prepareStatement("insert into courses values(?,?,?,?)");
		  pst.setInt(1, crs.getCourse_id());
		  pst.setString(2, crs.getCourse_name());
		  pst.setInt(3, crs.getCourse_duration());
		  pst.setDouble(4, crs.getCourse_fee());
		  count = pst.executeUpdate();
	   }
		  catch(Exception ex)
		  {
			  ex.printStackTrace();
		  }
		  finally
		  {
			  try
			  {
				  if(pst != null) pst.close();
				  if(con != null) con.close();
			  }
			  catch(Exception ex)
			  {
				  ex.printStackTrace();
			  }
		  }
	   return count == 1;
   }
   public boolean modifyCourses(Courses crs)
   {
	   int count = 0;
	   Connection con = null;
	   PreparedStatement pst = null;
	   String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	   try
	   {
	      Class.forName("oracle.jdbc.driver.OracleDriver");
		  con = DriverManager.getConnection(url,"scott","tiger");
		  pst = con.prepareStatement("update courses set course_name=?,course_duration=?,course_fee=? where course_id = ?");
		  pst.setString(1, crs.getCourse_name());
		  pst.setInt(2, crs.getCourse_duration());
		  pst.setDouble(3, crs.getCourse_fee());
		  pst.setInt(4, crs.getCourse_id());
		  count = pst.executeUpdate();
	   }
		  catch(Exception ex)
		  {
			  ex.printStackTrace();
		  }
		  finally
		  {
			  try
			  {
				  if(pst != null) pst.close();
				  if(con != null) con.close();
			  }
			  catch(Exception ex)
			  {
				  ex.printStackTrace();
			  }
		  }
	   return count == 1;
   }
   public boolean removeCourses(int course_id)
   {
	   int count = 0;
	   Connection con = null;
	   PreparedStatement pst = null;
	   String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	   try
	   {
	      Class.forName("oracle.jdbc.driver.OracleDriver");
		  con = DriverManager.getConnection(url,"scott","tiger");
		  pst = con.prepareStatement("delete from courses where course_id = ?");
		  pst.setInt(1, course_id);
		  count = pst.executeUpdate();
	   }
		  catch(Exception ex)
		  {
			  ex.printStackTrace();
		  }
		  finally
		  {
			  try
			  {
				  if(pst != null) pst.close();
				  if(con != null) con.close();
			  }
			  catch(Exception ex)
			  {
				  ex.printStackTrace();
			  }
		  }
	   return count == 1;
   }
   public Courses getCourses(int course_id)
   {
	   Courses crs = null;
	   Connection con = null;
	   PreparedStatement pst = null;
	   ResultSet rs = null;
	   String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	   try
	   {
	      Class.forName("oracle.jdbc.driver.OracleDriver");
		  con = DriverManager.getConnection(url,"scott","tiger");
		  pst = con.prepareStatement("select * from courses where course_id = ?");
		  pst.setInt(1, course_id);
		  rs = pst.executeQuery();
		  if(rs.next())
			  crs = new Courses(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4));	  
	   }
		  catch(Exception ex)
		  {
			  ex.printStackTrace();
		  }
		  finally
		  {
			  try
			  {
				  if(rs != null)  rs.close();
				  if(pst != null) pst.close();
				  if(con != null) con.close();
			  }
			  catch(Exception ex)
			  {
				  ex.printStackTrace();
			  }
		  }
	   return crs;
   }
}
