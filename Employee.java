package com.del.entity;
import java.sql.Date;
public class Employee 
{
    int empid;
    String name;
    double salary;
    int age;
    Date doj;
    public Employee() {}
	public Employee(int empid, String name, double salary, int age, Date doj) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.doj = doj;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge()  {
		return age;
	}
	public void setAge(int age  ) {
		this.age = age;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
}
