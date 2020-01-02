//Linked hashset is the subclass of hashset
//Combination of linkedlist and hash table
//It retains the order of insertion

import java.util.LinkedHashSet;
import java.util.Iterator;
class Test1
{ 
      public static void main(String args[])
      {
             LinkedHashSet<Employee> hs = new LinkedHashSet<Employee>();
             hs.add(new Employee(101,"Ajay",1000.00));
             hs.add(new Employee(103,"Chandhu",3000.00));
             hs.add(new Employee(102,"Babu",2000.00));
             hs.add(new Employee(101,"Ajay",1000.00));
             for(Employee e : hs)
                   e.display();
             Iterator<Employee> itr = hs.iterator();
             while(itr.hasNext());
             itr.next().display();
       }
}