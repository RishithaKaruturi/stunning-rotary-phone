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
class Pgstudent extends Student
{ 
   private String elective;
   private String optional;
   public Pgstudent() {}
   public Pgstudent(int ssn, String name, int age, int sid, double marks, String elective, String optional)
   {
      super(ssn,name,age,sid,marks);
      this.elective = elective;
      this.optional = optional;
   }
   public void setElective(String elective) {  this.elective = elective;  }
   public void setOptional(String optional) {  this.optional = optional;  }
   public String getElective()  {  return elective;  }
   public String getOptional()  {  return optional;  }
}
class Test
{
  public static void main(String[] args)
  {
     Pgstudent e = new Pgstudent(101,"Ajay",25,1001,250,"electiveo","electivet");
     System.out.println(e.getSsn());
     System.out.println(e.getName());
     System.out.println(e.getAge());
     System.out.println(e.getSid());
     System.out.println(e.getMarks());
     System.out.println(e.getElective());
     System.out.println(e.getOptional());
  }
}
   
   
    