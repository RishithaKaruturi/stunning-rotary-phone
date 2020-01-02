import java.util.TreeSet;
import java.util.Iterator;
class Test1
{
     public static void main(String[] args)
     {
          TreeSet<Employee1> tset = new TreeSet<>();
          tset.add(new Employee1(102,"Raju",2000));
          tset.add(new Employee1(101,"Arun",2000));
          tset.add(new Employee1(104,"Arjun",700));
          tset.add(new Employee1(103,"Chandhu",3000));
          for(Employee1 e : tset)
               e.display();
      }
}