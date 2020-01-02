import java.util.HashSet;
import java.util.Iterator;
class Test1
{
    public static void main(String args[])
    {
         HashSet<Integer> hs = new HashSet<Integer>();
         hs.add(10);
         hs.add(100);
         hs.add(new Integer(786));
         hs.add(999);
         for(Integer i : hs)
         System.out.println(i);
     }
}