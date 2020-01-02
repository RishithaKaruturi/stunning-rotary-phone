import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
class Test
{   
        public static void main(String args[])
        {
              Employee3 e = null;
              try(FileInputStream fis = new FileInputStream("emp.dat");
                  ObjectInputStream ois = new ObjectInputStream(fis);)
              {
                      e = (Employee3)ois.readObject();
                      System.out.println(e.getEmpid()+"  "+e.getEname()+"  "+e.getSalary());
               }
                catch (IOException | ClassNotFoundException ex)
               {
                         System.out.println(ex);
               }
}
}