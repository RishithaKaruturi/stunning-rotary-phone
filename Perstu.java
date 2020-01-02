class Person
{
  public int ssn,age;
  public String name;
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
class Student extends Person
{
  int sid;
  double marks;
  public Student() {}
  public Student(int ssn, String name, int age, int sid, double marks)
  {
    super(ssn,name,age);
    this.sid = sid;
    this.marks = marks;;
  }
  public void setSid(int sid)
  {
     this.sid = sid;
  }
  public void setMarks(double marks)
  {
     this.marks = marks;
  }
  public int getSid()  {  return sid;  }
  public double getMarks()  {  return marks;  }
}
class Test
{
  public static void main(String[] args)
  {
     Student e = new Student(101,"Ajay",25,1001,250);
     System.out.println(e.getSsn());
     System.out.println(e.getName());
     System.out.println(e.getAge());
     System.out.println(e.getSid());
     System.out.println(e.getMarks());
  }
}
   
   
    