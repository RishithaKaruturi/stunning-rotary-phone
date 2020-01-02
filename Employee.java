
class Employee
{
  private int empid;
  private String ename;
  double salary;
  public Employee(){}
  public Employee(int empid,String ename,double salary)
  {
    this.empid = empid;
    this.ename = ename;
    this.salary = salary;
  }
   public void setEmpid(int Empid)
  {
    this.empid=empid;
  }
  public void setEname(String ename)
  {
    this.ename=ename;
  }
  public void setSalary(double salary) 
  {
  this.salary=salary;
  }
  
  public int getEmpid {  return empid;  }
  public String getEname  {  return ename;  }
  public double getSalary  {  return salary;  }
}
class Test
{
  public static void main(String args[])
  {
   Employee e = new Employee(101,"Ajay",25000);
   System.out.println("Empid is" +e.getEmpid());
   System.out.println("Ename is" +e.getEname());
   System.out.println("Salary is" +e.getSalary());
  }
}
