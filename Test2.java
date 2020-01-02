class Employee
{
  private int empid;
  private String ename;
  private double salary;
  public Employee() {}
  public Employee(int empid, String ename, double salary)
  {
    this.empid = empid;
    this.ename = ename;
    this.salary = salary;
  }
  public void setEmpid(int empid)
  {
    this.empid = empid;
  }
  public void setEname(String ename)
  {
  this.ename = ename;
  }
  public void salary(double salary)
  {
  this.salary = salary;
  }
  public int getEmpid()  {  return empid;  }
  public String getEname()  {  return ename;  }
  public double getSalary() {  return salary; }
}
class Department
{
  private int deptno;
  private String deptname;
  Employee e;
  public Department() {}
  public Department(int deptno, String deptname, Employee e)
  {
    this.deptno = deptno;    
    this.deptname = deptname;
  }
  public void setDeptno(int deptno)
  {
    this.deptno = deptno;
  }
  public void setDeptname(String deptname)
  {
    this.deptname = deptname;
  }
  public void setEmployee(Employee e)
  {
    this.e = e;
  }
  public int getDeptno()       {  return deptno;    }
  public String getDeptname()  {  return deptname;  }
  public Employee getEmployee()  {return e;  }
}
class Test2
{ 
  public static void main(String[] args)
  {
   Department d = new Department(10,"Sales",new Employee(101,"Rishi",25000));
   System.out.println("Department no is " +d.getDeptno());
   System.out.println("Employee Details");
   System.out.println("Department name is " +d.getDeptname());
   System.out.println("Employee id is " +d.getEmployee().getEmpid());
   System.out.println("Employee name is " +d.getEmployee().getEname());
   System.out.println("Salary is " +d.getEmployee().getSalary());
  }
}
   