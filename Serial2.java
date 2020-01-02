import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class Test
{   
        public static void main(String args[])
        {
              Employee3 e = new Employee3(786,"John Miller",25000.00);
              try(FileOutputStream fos = new FileOutputStream("emp.dat");
                  ObjectOutputStream oos = new ObjectOutputStream(fos);)
              {
                      oos.writeObject(e);
               }
                catch (IOException ex)
               {
                         System.out.println(ex);
               }
}
}