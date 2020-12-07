package TestngListenerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenShotTest extends Base {
	@BeforeMethod
	public void setUp() {
		initializaion();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void loginPageTest() {
		Assert.assertEquals(false, true);
		
	}
	@Test
	public void homePageTest() {
		Assert.assertEquals(true, true);
		
	}
	@Test
	public void searchPageTest() {
		Assert.assertEquals(false, true);		
	}
	@Test
	public void adminPageTest() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void contactPageTest() {
		Assert.assertEquals(true, true);
	}

}
