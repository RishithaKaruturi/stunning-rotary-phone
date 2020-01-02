package com.del.dao;
import java.sql.Date;
import java.util.ArrayList;
import com.del.dao.StudentDAO;
import com.del.entity.Student;
public class DBTest2 
{
  public static void main(String[] args)
  {
	  StudentDAO sdao = new StudentDAO();
	  /*Student s = new Student(1,"Harini",20,new Date(1998,10,12));
	  StudentDAO sdao = new StudentDAO();
	  if(sdao.insertStudent(s))
		  System.out.println("Student record inserted");
	  else 
		  System.out.println("Insertion Failed");
	  Student s = new Student(1,"Rishitha",20,new Date(1998,10,12));
	  if(sdao.modifyStudent(s))
			System.out.println("Student record modified");
		else
			System.out.println("Modification Failed");*/
	  ArrayList<Student> slist = sdao.getStudent();
		for(Student s : slist)
			System.out.println(s.getRno()+"  "+s.getName()+"  "+s.getAge());
	  
  }
}
