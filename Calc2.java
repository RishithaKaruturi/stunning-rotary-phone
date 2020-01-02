interface Calculator
{
   int sum(int x, int y);
}
interface Calendar
{
   int product(int x, int y);
}
class Abccalc implements Calculator,Calendar
{
   public int sum(int x, int y)
   {
       return x+y;
   }
   public int product(int x, int y)
   {
       return x*y;
   }
}
class Test
{ 
   public static void main(String[] args)
   {
      Calculator c = new Abccalc();
      Calendar r = new Abccalc();
      System.out.println("Sum of Abccalc is" +c.sum(10,20));
      System.out.println("Product of Abccalc is" +r.product(10,20));
   }
}
 