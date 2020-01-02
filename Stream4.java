import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
class Test
{  
      public static void main(String[] args)
      {
              try(FileInputStream fis = new FileInputStream("abc.dat"))
              {
                     int ch;
                     while((ch = fis.read())!=-1)
                           System.out.print((ch)+"  ");  //Integers
                           System.out.println((char)(ch)+"  ");   //Characters ...type casting
              }
              catch(IOException ex)
              {
                      System.out.println(ex);
              }
       }
}