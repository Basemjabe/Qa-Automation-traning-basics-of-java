
import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class myTestCases extends  parameters {
//	
//	@Test()
//public void mytestone() {
//
//	String myActualtitle = driver.getTitle();
//	mysoftassert.assertEquals(myActualtitle, Expectedtitle);
//	mysoftassert.assertAll();
//		
//	
//	}
//	
//	
//	@Test()
//	public void check_the_image_drawer() {
//		
//		List <WebElement> myimages =driver.findElements(By.className("img-fluid"));
//		
//boolean myimagecheck1 =	myimages.get(0).getAttribute("src")==myimages.get(1).getAttribute("src");
//boolean myimagecheck2 =	myimages.get(1).getAttribute("src")==myimages.get(2).getAttribute("src");
//boolean myimagecheck3 =	myimages.get(2).getAttribute("src")==myimages.get(0).getAttribute("src");
//mysoftassert.assertEquals(myimagecheck1, false, "image one with image tow");
//mysoftassert.assertEquals(myimagecheck2,false, "image tow with image three");
//mysoftassert.assertEquals(myimagecheck3, false, "image three with image one");
//mysoftassert.assertAll();
//			}
//
//	
//	

	@Test()
public void Validate_the_contact_form_information() throws InterruptedException{
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String name_of_emails [] = {"a1@gmailnet.jo", "a9gmail.edu","uu887@gmail.com","@gmail.com"};
		
Random Email_index = new Random();
int index = Email_index.nextInt(4);


	driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys(name_of_emails[index]);
	Thread.sleep(1000);
String myvalue = 	driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).getAttribute("value");
String regex ="^[A-Za-z0-9+_.-]+@(.+)+.(.+)$";
Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(name_of_emails[index]);
	System.out.println("#############");
	System.out.println(name_of_emails[index] +" is valid email :"+ matcher.matches());
	System.out.println("#############");
boolean mycheckprocessfortheemail = matcher.matches(); 
mysoftassert.assertEquals(mycheckprocessfortheemail, true ,"the email structuren is not matching the correct one");
	mysoftassert.assertAll();
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
