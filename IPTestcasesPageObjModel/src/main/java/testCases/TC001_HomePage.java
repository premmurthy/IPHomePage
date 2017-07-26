package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.intropage;
import wrappers.IPProjectWrappers;

public class TC001_HomePage extends IPProjectWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		///dataSheetName = "TC001";
		testCaseName = "HomePage";
		testDescription = "Click of Change City";
		category = "Sanity";
		authors = "MPrem";		
	}
	
	@Test(priority=1)
	
   public void HomePagelanding(){
		
		new intropage(driver, test)
		.changecitystrip();
	
	
	//public void HomepageLand(){
		
		new HomePage(driver, test);
	}
}










