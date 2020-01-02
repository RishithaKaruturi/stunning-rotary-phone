import java.util.LinkedList;
import java.util.ListIterator;
class Test1
{
     public static void main(String[] args)
     {
          LinkedList<String> list = new LinkedList<>();
          list.add("Welcome");     list.add("Hello");
          list.add("apple");           list.add("Welcome");
          list.add("Farewell");      list.add("Bye Bye");
          list.add(1,"Banana");
          ListIterator<String> itr = list.listIterator();
          while(itr.hasNext())
             System.out.println(itr.next());
          System.out.println();
          while(itr.hasPrevious())
             System.out.println(itr.previous());
         
     }
}


//linked list is preferred over arraylist while performing frequent insertions and deletions
