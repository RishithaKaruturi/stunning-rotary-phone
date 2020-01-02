import java.util.HashSet;
import java.util.Iterator;
class Test1
{
   public static void main(String[] args)
   {
      HashSet<String> hs = new HashSet<String>();
      hs.add("Welcome");
      hs.add("Hello");
      hs.add("Bye Bye");
      hs.add("Farewell");
      System.out.println(hs.add("Welcome"));
      System.out.println(hs.size());
      for(String s : hs)
           System.out.println(s);
       Iterator<String> itr = hs.iterator();
       while(itr.hasNext())
       System.out.println(itr.next());
   }
}