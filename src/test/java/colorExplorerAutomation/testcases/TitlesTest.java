package colorExplorerAutomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import colorExplorerAutomation.pages.BaseClass;
import colorExplorerAutomation.pages.HomePage;

public class TitlesTest extends BaseClass{
	
	String actualTitle=null;
	String expectedTitle=null;
	
	@Test(priority=1)
	public void TestHomePageTitle()
	{
		logger = report.createTest("Checking Home page title");
		logger.info("Starting Color Explorer");
		expectedTitle = "Color | Explorer by RNS";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.print("Page Title: "+driver.getTitle()+"\n");
		//logger.pass("Successful");
	}
	
	@Test(priority=2)
	public void TestValidatorPageTitle()
	{
		logger = report.createTest("Checking Validators page title");
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.ClickValidatorsIcon();
		logger.info("Moving to Validatrors page");
		expectedTitle = "Validators on Color Explorer | Color";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.print("Page Title: "+driver.getTitle()+"\n");
		//logger.pass("Successful");
	}
	
	
	@Test(priority=3)
	public void TestBlocksPageTitle()
	{
		logger = report.createTest("Checking Blocks page title");
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		logger.info("Moving to Blocks page");
		homePage.ClickBlocksIcon();
		expectedTitle = "Latest Blocks on Color Explorer | Color";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.print("Page Title: "+driver.getTitle()+"\n");
		//logger.pass("Successful");
	}
	
	@Test(priority=4)
	public void TestTransactionsPageTitle()
	{
		logger = report.createTest("Checking Transactions page title");
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		logger.info("Moving to Transactions page");
		homePage.ClickTransactionsIcon();
		expectedTitle = "Latest Transactions on Color Explorer | Color";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.print("Page Title: "+driver.getTitle()+"\n");
		//logger.pass("Successful");
	}
	
	@Test(priority=5)
	public void TestProposalsPageTitle()
	{
		logger = report.createTest("Checking Proposals page title");
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		logger.info("Moving to Proposals page");
		homePage.ClickProposalsIcon();
		expectedTitle = "Proposals on Color Explorer | Color";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.print("Page Title: "+driver.getTitle()+"\n");
		//logger.pass("Successful");
	}
	
	@Test(priority=6)
	public void TestVotingPowerPageTitle()
	{
		logger = report.createTest("Checking Voting Power page title");
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		logger.info("Moving to Voting Power page");
		homePage.ClickVotingPowerIcon();
		expectedTitle = "Voting Power Distribution on Color Explorer | Color";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.print("Page Title: "+driver.getTitle()+"\n");
		logger.fail("Successful");
	}
	
}
