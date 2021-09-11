package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title= driver.getTitle();
		System.out.println("Title: "+title );
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vijayabaskaran");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vijay");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/8/11");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("B.Tech");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("200000");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("5713");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Work well with Team");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Workaholic");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("15");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("MSFT");
		
		WebElement couCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		couCode.clear();
		couCode.sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9487679696");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("002");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("May i speak to Vijay");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("svijayabaskaranit@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
		
		
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Vijayabaskaran");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Vijay");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("121 annamalai street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("London");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600102");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("01");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TAMILNADU");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		
		
		
		driver.findElement(By.name("submitButton")).click();
		String fname= driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("first name: "+fname);
		
		
		String title2= driver.getTitle();
		System.out.println("Title: "+title2);
		//driver.close();
		
		
		
	}

}
