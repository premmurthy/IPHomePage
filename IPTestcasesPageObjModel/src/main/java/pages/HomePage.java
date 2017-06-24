package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import objectproperties.Intropage;
import wrappers.IPProjectWrappers;

public class HomePage extends IPProjectWrappers {

	public HomePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
		if(!verifyTitle("Search Properties in Chennai, Search New Project Launches in Chennai City | IndiaProperty.com")){
			
			reportStep("This is not Intro Page", "Fail");
		}
		
		
	}

	
	/*public HomePage changecitystrip(){
		
		//clickByLink("×");
		
		clickByXpath("//*[@id='modalcity-close']");
		
		return new HomePage(driver, test);*/
		
		
	}
	
//}
