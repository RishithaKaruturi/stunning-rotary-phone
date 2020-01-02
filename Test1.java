import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class Test1
{   
        public static void main(String args[])
        {
              Student s = new Student(1001,"John",20,100,50,60,70);
              try(FileOutputStream fos = new FileOutputStream("emp.dat");
                  ObjectOutputStream oos = new ObjectOutputStream(fos);)
              {
                      oos.writeObject(s);
               }
                catch (IOException ex)
               {
                         System.out.println(ex);
               }
}
}

