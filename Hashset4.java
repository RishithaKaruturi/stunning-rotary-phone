import java.util.HashSet;
import java.util.Iterator;
class Test1
{
   public static void main(String[] args)
   {
      HashSet<String> hs1 = new HashSet<String>();
      hs1.add("Welcome");
      hs1.add("Hello");
      hs1.add("Bye Bye");
      hs1.add("Farewell");
      HashSet<String> hs2 = new HashSet<String>();
      hs2.add("Bye Bye");
      hs2.add("Welcome");
      hs1.retainAll(hs2);
      for(String s : hs1)
      System.out.println(s);
      }
}