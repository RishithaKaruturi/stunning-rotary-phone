import java.util.LinkedList;
class Test
{ 
       public static void main(String[] args)
       {
        Training t = new Training((1001,"Java"),new training(1002,"SQL"));
        LinkedList<Student> list = new LinkedList<Student>();
        list.add(new Student(101,"John",23));
        list.add(new Student(102,"Adam",25));
        for(Student s : list)
              System.out.println(s.getSid()+"  "+s.getSname()+"  "+s.getAge());
       }
}