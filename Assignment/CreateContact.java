package week2.Day1.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*Open the browser
Load the URL
Maximize the browser
Enter UserName
Enter Password
Click Login
Click CRM/SFA
Click Contacts Tab
Click Create Contact
Type First Name
Type Last Name
Click Create Contact Button
Print the first name and browser title 
Close the browser*/

public class CreateContact 
{

	public static void main(String[] args) 
	{
		//1. Open the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//2. Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//3. Maximize the browser
		driver.manage().window().maximize();
		
		//4. Enter UserName
		WebElement userNameTextBox = driver.findElement(By.id("username"));
		userNameTextBox.sendKeys("demosalesManager");
		
		//5. Enter Password
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		passwordTextBox.sendKeys("crmsfa");
		
		//6. Click Login
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		
		//7. Click CRM/SFA
		WebElement linkText = driver.findElement(By.linkText("CRM/SFA"));
		linkText.click();
		
		//8. Click Contacts Tab
		WebElement clickContactTab = driver.findElement(By.linkText("Contacts"));
		clickContactTab.click();
		
		//9. Click Create Contact
		WebElement clickCreateContactLink =driver.findElement(By.linkText("Create Contact"));
		clickCreateContactLink.click();
		
		//10. Type First Name
		WebElement firstNameField = driver.findElement(By.id("firstNameField"));
		firstNameField.sendKeys("Priyadharshini");
		
		//11. Type Last Name
		WebElement lastNameField = driver.findElement(By.id("lastNameField"));
		lastNameField.sendKeys("S");
		
		//12. Click Create Contact Button
		WebElement clickCreateContactButton = driver.findElement(By.name("submitButton"));
		clickCreateContactButton.click();
		
		//13. Print the first name and browser title 
		WebElement printFirstNameField = driver.findElement(By.id("viewContact_firstName_sp"));
		String firstName = printFirstNameField.getText();
		System.out.println("First Name is "+firstName);
		
		String titleOfThePage = driver.getTitle();
		System.out.println("Title of the page is "+titleOfThePage);
		
		//14. Close the browser
		driver.close();
		
		
		
	}

}
