package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Title : " + title);

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");

		WebElement loginbtn = driver.findElement(By.className("decorativeSubmit"));
		loginbtn.click();
		String title1 = driver.getTitle();
		System.out.println("Title : " + title1);

		WebElement crmlink = driver.findElement(By.linkText("CRM/SFA"));
		crmlink.click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Rose");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bosco M");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Rose");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Bosco");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("MyTitle");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("28/3/1995");

		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("MyProfile");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("2000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("7756432");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("RB");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Filling profile details");
		driver.findElement(By.id("createLeadForm_importantNote"))
				.sendKeys("Company name, FirstName and Last name are madatory fields please fill properly");

		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("680505");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("08592");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("12345689");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+43");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("ToRose");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl"))
				.sendKeys("http://leaftaps.com/crmsfa/control/createLeadForm");

		String valueOfFirstName = firstName.getAttribute("value");
		System.out.println("First Name : " + valueOfFirstName);
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys(valueOfFirstName);
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Rose");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("6a");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("TCS,Ramanujan IT Park");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("602005");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("1");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());

		if (driver.getTitle().contentEquals("View Lead")) {
			System.out.println("Create Lead form filled successfully");
		} else {
			System.out.println("Create Lead form filled successfully");
		}

		driver.close();

	}

}
