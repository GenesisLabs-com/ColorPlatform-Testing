package colorExplorerAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;

	// Constructor
	public HomePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath = "//i[@class='fa fa-fw fa-spinner']") WebElement validatorsIcon;
	@FindBy(xpath = "//i[@class='fa fa-fw fa-cube']") WebElement blocksIcon;
	@FindBy(xpath = "//i[@class='fa fa-fw fa-th']") WebElement dashboardIcon;
	@FindBy(xpath = "//i[@class='fa fa-fw fa-random']") WebElement transactionsIcon;
	@FindBy(xpath = "//i[@class='fa fa-fw fa-edit']") WebElement proposalsIcon;
	@FindBy(xpath = "//i[@class='fa fa-fw fa-chart-bar']") WebElement votingPowerIcon;
	
	public void ClickValidatorsIcon()
	{
		ThreadSleep();
		validatorsIcon.click();
	}
	public void ClickBlocksIcon()
	{
		ThreadSleep();
		blocksIcon.click();
	}
	public void ClickDashboardIcon()
	{
		ThreadSleep();
		dashboardIcon.click();
	}
	public void ClickTransactionsIcon()
	{
		ThreadSleep();
		transactionsIcon.click();
	}
	public void ClickProposalsIcon()
	{
		ThreadSleep();
		proposalsIcon.click();
	}
	public void ClickVotingPowerIcon()
	{
		ThreadSleep();
		votingPowerIcon.click();
	}
	public void ThreadSleep()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.print(e);
		}
	}
	
	
}
