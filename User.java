import java.util.Scanner;
public class User
{
	public static void main(String[] args)
	{
		String username, password;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username:");
		username = sc.nextLine();
		System.out.println("Enter password:");
		password = sc.nextLine();
		System.out.println("Yes or no?");
		String input = sc.nextLine();
		if(input.equalsIgnoreCase("yes")) 
		{
			System.out.println("Login Successful");
		}
		else
		{
		    System.exit(0);
		}
	}
}
