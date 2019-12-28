import java.util.LinkedList;
class Student
{
    int sid;
    String sname;
    int age;
    public Student() {}
    public Student(int sid, String sname, int age)
    {
          this.sid = sid;
          this.sname = sname;
          this.age = age;
     }
     public void setSid(int sid) {   this.sid = sid;  }
     public void setSname(String sname)  {    this.sname = sname;  }
     public void setAge(int age)  {      this.age = age;   }
     public int getSid() {   return sid;   }
     public String getSname()  {   return sname;   }
     public int getAge() {    return age;    }
}
class Training
{
   int tid;
   String tname;
   LinkedList<Student> list = new LinkedList<Student>();
   public Training() {}
   public Training(int tid, String tname,Student[] s)
   {
         this.tid = tid;
         this.tname = tname;
         this.s = s;
   }
   public void setTid(int tid)  {  this.tid = tid;  }
   public void setTname(String tname)   {     this.tname = tname;  }
   public void setStudent(Student s)   {   this.s = s;  }
   public int getTid()  {  return tid;  }
   public String getTname()  {   return tname;  }
   public Student getStudent()    {   return s;    }
}
class Test
{ 
       public static void main(String[] args)
       {
            Training t = new Training(1001,"Java",list.add(101,"John",23)),  new Training(1002,"Sql",list.add(102,"Adam",25));
            System.out.println(t.getTid());
            System.out.println(t.getTname());   
            for(Student s : list)            
            System.out.println(s.getSid()+"  "+s.getSname()+"  "+s.getAge());
       }
}
        

