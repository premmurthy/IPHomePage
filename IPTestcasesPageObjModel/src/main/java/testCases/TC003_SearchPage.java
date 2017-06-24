package testCases;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import pages.HomePage;
import pages.SearchPage;
import pages.intropage;
import wrappers.IPProjectWrappers;

public class TC003_SearchPage extends IPProjectWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		///dataSheetName = "TC001";
		testCaseName = "Search Page";
		testDescription = "Check for Landing Of Search Page";
		category = "Sanity";
		authors = "MPrem";		
	}
	
	@Test
	
   public void intropagelanding() throws InterruptedException{
		
		new intropage(driver, test)
		.changecitystrip();
	
		
	
	//public void HomepageLand() throws InterruptedException{
		
		new HomePage(driver, test)
		
		
		.clickById("home-searchbtn");
		
		
		System.out.println("User clicked the search button");
		
		Thread.sleep(5000);
		
	
	
	//public void SearchPage() throws InterruptedException{
		
		new SearchPage(driver, test);
		
		Thread.sleep(3000);
		
	}
	
//}

}



//}




