import java.sql.Date;
import java.util.ArrayList;
import com.del.dao.EmployeeDAO;
import com.del.entity.Employee;
public class DBTest1 
{
	public static void main(String[] args) 
	{
		/*Employee e = new Employee(102,"Raja",2000,20,new Date(1990,10,12));...Insertion
		Employee e = new Employee(102,"Babu Raja",2000,25,new Date(1990,10,12));...Modification
		EmployeeDAO edao = new EmployeeDAO();
		if(edao.insertEmployee(e))
			System.out.println("Employee record inserted");
		else
			System.out.println("Insertion Failed");
		if(edao.modifyEmployee(e))
			System.out.println("Employee record modified");
		else
			System.out.println("Modification Failed");
		EmployeeDAO edao = new EmployeeDAO();
		ArrayList<Employee> elist = edao.getEmployee();
		for(Employee e : elist)
			System.out.println(e.getEmpid()+"  "+e.getName()+"  "+e.getSalary());*/
		/*EmployeeDAO edao = new EmployeeDAO();
		Employee e = edao.getEmployee(786);
		if(e!= null)
			System.out.println(e.getEmpid()+"  "+e.getName()+" "+e.getSalary()+" "+e.getAge()+" "+e.getDoj());
		else
			System.out.println("Employee does not exist");*/
		EmployeeDAO edao = new EmployeeDAO();
		if(edao.removeEmployee(102))
			System.out.println("employee deleted successfully");
		else
			System.out.println("Employee with id 102 does not exist");
		}
}
