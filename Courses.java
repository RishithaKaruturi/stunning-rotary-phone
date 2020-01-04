package com.del.third.entity;
import java.sql.Date;
public class Courses 
{
     int course_id;
     String course_name;
     int course_duration;
     Double course_fee;
     public Courses() {}
	 public Courses(int course_id, String course_name, int course_duration, Double course_fee) 
	 {
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_duration = course_duration;
		this.course_fee = course_fee;
	 }
	 public int getCourse_id() {
		return course_id;
	 }
	 public void setCourse_id(int course_id) {
		this.course_id = course_id;
	 }
	 public String getCourse_name() {
		return course_name;
	 }
	 public void setCourse_name(String course_name) {
		this.course_name = course_name;
	 }
	 public int getCourse_duration() {
		return course_duration;
	 }
	 public void setCourse_duration(int d) {
		this.course_duration = d;
	 }
	 public Double getCourse_fee() {
		return course_fee;
	 }
	 public void setCourse_fee(Double course_fee) {
		this.course_fee = course_fee;
	 } 
}
