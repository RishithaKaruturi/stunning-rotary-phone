import java.io.*;
import java.util.Scanner;
class Test
{ 
         public static void main(String[] args)
         {
               Scanner sc = new Scanner(System.in);
               System.out.print("Enter a Number  ");
               int no = sc.nextInt();
               sc.nextLine();
               System.out.print("Enter a String  ");
               String s = sc.nextLine();
               System.out.println(no+"   "+s);
           }
}    

//after entering an integer we must use sc.nextLine() to clear the buffer.