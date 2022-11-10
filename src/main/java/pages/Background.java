package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Background {
	WebDriver driver;

	public void Background(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Set SkyBlue Background']")
	WebElement SetBlue;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]")
	WebElement SignInButton1;
	@FindBy(how = How.XPATH, using ="//button[normalize-space()='Set White Background']" )
	WebElement SetWhite;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]")
	WebElement SignInButton2;

	// Methods to interact with the elements
	

	public void clickSignInButton1() {
		SignInButton1.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void clickSignInButton2() {
			SignInButton2.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	

	public String getPageTitle() {
		return driver.getTitle();
	}

}
