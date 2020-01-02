class Employee1 implements Comparable<Employee1>
{
   int empid;
   String ename;
   double salary;
   public Employee1()  {}
   public Employee1(int empid, String ename, double salary)
   {
      this.empid = empid;  this.ename = ename;  this.salary = salary;
   }
   public void display()
   {
      System.out.println(empid+"  "+ename+"   "+salary);
   }
   public int hashCode()
   {
       return empid;
   }
   public boolean equals(Object obj)
   { 
        Employee1 e = (Employee1)obj;
        return empid == e.empid && ename.equals(e.ename) && salary == e.salary;
    }
    public int compareTo(Employee1 e)
    {
        return empid- e.empid;
    }
}
