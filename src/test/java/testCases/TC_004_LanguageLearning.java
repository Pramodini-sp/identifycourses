package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LanguageLearning;
import testBase.BaseClass;

public class TC_004_LanguageLearning extends BaseClass {

	@Test(priority=9)
	public void search_Language()
	{
		try {
		LanguageLearning lobj=new LanguageLearning(driver);
		lobj.search_Language();
		}catch(Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test(priority=10)
	public void show_FirstCourses()
	{
		try {
			LanguageLearning lobj=new LanguageLearning(driver);
			lobj.LanguageOne();
			
			}catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
			}
	}
	
	@Test(priority=11)
	public void show_SecondCourses()
	{
		try {
			LanguageLearning lobj=new LanguageLearning(driver);
			
			lobj.LanguageTwo();
			
			}catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
					
			}
	}
	
	@Test(priority=12)
	public void show_ThirdCourses()
	{
		try {
			LanguageLearning lobj=new LanguageLearning(driver);
			
			lobj.LanguageThird();
			
			}catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
			
			}
	}
	
	@Test(priority=13)
	public void show_FourthCourses()
	{
		try {
			LanguageLearning lobj=new LanguageLearning(driver);
			
			lobj.LanguageFourth();
			
			}catch(Exception e) {
				e.printStackTrace();
				Assert.fail();	
			}
	}
	
	@Test(priority=14)
	public void show_Courses()
	{
		try {
			LanguageLearning lobj=new LanguageLearning(driver);
			
			lobj.LanguageFifth();
			
			}catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
		
			}
	}

	
}
