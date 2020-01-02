interface Calculator
{
   int sum(int x, int y);
   int product(int x, int y);
}
class Abccalc implements Calculator
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
class Xyzcalc implements Calculator
{
   public int sum(int x, int y)
   {
       return x-(-y);
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
      Calculator x = new Xyzcalc();
      System.out.println("Sum of Abccalc is" +c.sum(10,20));
      System.out.println("Product Abccalc is" +c.product(2,3));
      System.out.println("Sum of Xyzcalc is" +x.sum(30,20));
      System.out.println("Product of Xyzcalc is" +x.product(10,20));
   }
}
 