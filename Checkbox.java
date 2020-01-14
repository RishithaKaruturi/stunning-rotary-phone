import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				   "C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
		   WebDriver ObjDriver = new ChromeDriver();
		   ObjDriver.get("http://demo.automationtesting.in/Register.html");
		   WebElement checkbox = ObjDriver.findElement(By.xpath("//*[@id='checkbox1']"));
		   checkbox.click();
	       boolean status = checkbox.isSelected();
    	   System.out.println("checkbox is Selected>>"+status);
    	   WebElement checkbox1 = ObjDriver.findElement(By.xpath("//*[@id='checkbox2']"));
		   checkbox1.click();
	       boolean sel_status = checkbox1.isSelected();
    	   System.out.println("checkbox is Selected>>"+sel_status);
    	   WebElement checkbox2 = ObjDriver.findElement(By.xpath("//*[@id='checkbox3']"));
		   checkbox2.click();
	       boolean select_status = checkbox2.isSelected();
    	   System.out.println("checkbox is Selected>>"+select_status);
	}

}
