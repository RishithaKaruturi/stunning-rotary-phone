import java.util.HashSet;
import java.util.Iterator;
class Test1
{
    public static void main(String[] args)
    {
         HashSet<Employee> hs = new HashSet<Employee>();
         hs.add(new Employee(101,"Ajay",250.00));
         hs.add(new Employee(102,"Ashish",200.00));
         hs.add(new Employee(103,"Anirudh",150.00));
         for(Employee e : hs)
         e.display();
    }
}