package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.intropage;
import wrappers.IPProjectWrappers;

public class TC001_intro extends IPProjectWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		//dataSheetName = "TC001";
		testCaseName = "IntroPage";
		testDescription = "Landing of Intro Page";
		category = "Sanity";
		authors = "MPrem";		
	}
	
@Test(priority=0)
   public void intropagelanding(){
		
		new intropage(driver, test)
		.changecitystrip();
	}
}










