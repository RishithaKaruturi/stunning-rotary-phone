import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
class Test
{  
      public static void main(String[] args)
      {
              try(FileReader fos = new FileReader("abc.dat"))
              {
                     int ch;
                     while((ch = fos.read())!=-1)
                           System.out.println((char)(ch)+" ");
              }
              catch(IOException ex)
              {
                      System.out.println(ex);
              }
       }
}



