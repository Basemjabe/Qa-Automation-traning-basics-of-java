import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameters {
	public WebDriver driver;
	String myURL="https://www.demoblaze.com/";
	SoftAssert mysoftassert =new SoftAssert();
	String Expectedtitle ="STORE";
	
@BeforeTest
public void pre_my_test () {

	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(myURL);
	
	
	
	
}
}
