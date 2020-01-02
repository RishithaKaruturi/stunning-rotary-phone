class Employee3 implements java.io.Serializable   //no abstract methods
{
   int empid;
   String ename;
   double salary;
   public Employee3()  {}
   public Employee3(int empid, String ename, int salary)
   {
      this.empid = empid;  this.ename = ename;  this.salary = salary;
   }
   public void setEmpid(int empid)  {this.empid = empid;  }
    public void setEname(String ename)  { this.ename = ename;  }
    public void setSalary(double salary)  {  this.salary = salary;  }
   public int getEmpid() {  return empid;  }
   public String getEname() {  return ename;  }
   public double getSalary() {  return salary;  }
  }

//must have a public default constructor
//must have a public setter and public getter