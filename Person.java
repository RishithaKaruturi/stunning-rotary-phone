class Person
{
  public int ssn;
  public String name;
  public int age;
  public Person() {}
  public Person(int ssn, String name, int age)
  {
     this.ssn = ssn;
     this.name = name;
     this.age = age;
  }
  public void setSsn(int ssn)
  {
     this.ssn = ssn;
  }
  public void setName(String name)
  {
     this.name = name;
  }
  public void setAge(int age)
  {
     this.age = age;
  }
  public int getSsn()  {  return ssn;  }
  public String getName()  {  return name;  }
  public int getAge()  {  return age; }
}
class Employee extends Person
{
  int empid;
  double salary;
  public Employee() {}
  public Employee(int ssn, String name, int age, int empid, double salary)
  {
    super(ssn,name,age);
    this.empid = empid;
    this.salary = salary;
  }
  public void setEmpid(int empid)
  {
     this.empid = empid;
  }
  public void setSalary(double salary)
  {
     this.salary = salary;
  }
  public int getEmpid()  {  return empid;  }
  public double getSalary()  {  return salary;  }
}
class Test
{
  public static void main(String[] args)
  {
   Employee e = new Employee(101,"Ajay",25,10001,25000);
   System.out.println(e.getSsn());
   System.out.println(e.getName());
   System.out.println(e.getAge());
   System.out.println(e.getEmpid());
   System.out.println(e.getSalary());
  }
}
   
   
    