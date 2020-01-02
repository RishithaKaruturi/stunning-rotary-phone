import java.io.File;             //lookup purpose
class Test2
{
      public static void main(String[] args)
      {
             File f = new File("Person.java");
             System.out.println(f.isFile());
             System.out.println(f.length());
             System.out.println(f.isDirectory());
             System.out.println(f.canRead());
             System.out.println(f.getName());
             System.out.println(f.canExecute());
            // f.delete();      //deletes the file permanently
       }
}
            
//can find the attributes of a file or folder.