package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Wisdom {
	public WebDriver ldriver;
	
	public Login_Wisdom(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy (xpath="(//input[@name='userID'])[1]")
	@CacheLookup
	WebElement textUserID;
	
	@FindBy (xpath="//button[@id='validateUser']")
	@CacheLookup
	WebElement ButtonValidation;
	
	@FindBy (xpath="(//input[@type='password'])[1]")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy (xpath="(//input[@type='checkbox'])[1]")
	@CacheLookup
	WebElement clickCheckbox;
	
	@FindBy (xpath="//button[@id='vaalidatePassword']")
	@CacheLookup
	WebElement buttonSubmit;
	
	@FindBy (xpath="//input[@name='efirstPin']")
	@CacheLookup
	WebElement txtPin;
	
	@FindBy (xpath="(//button[@type='submit'])[1]")
	@CacheLookup
	WebElement buttonSubmit2;
	
	@FindBy (xpath="(//button[@type='submit'])[15]")
	@CacheLookup
	WebElement buttonAgree;
	
	@FindBy (xpath="//*[@id=\"userProf\"]/a")
	@CacheLookup
	WebElement linkProfile;
	
	@FindBy (xpath="//span[normalize-space()='Logout']")
	@CacheLookup
	WebElement buttonLogout;
	
	@FindBy (xpath="//button[@id='logouotBtnConfirm']")
	@CacheLookup
	WebElement buttonYes;
	
	
	
	
	
		public void userid(String UI) throws InterruptedException {
			textUserID.clear();
			Thread.sleep(2000);
			textUserID.sendKeys(UI);
		}
		
		public void btnvalidation() throws InterruptedException {
			ButtonValidation.click();
			Thread.sleep(2000);
		}
		
		public void password(String PW) throws InterruptedException {
			txtPassword.clear();
			Thread.sleep(2000);
			txtPassword.sendKeys(PW);
		}
		
		public void clickCheckbox() throws InterruptedException {
			clickCheckbox.click();
			Thread.sleep(2000);
		}
		
		public void buttonSubmit() throws InterruptedException {
			buttonSubmit.click();
			Thread.sleep(2000);
		}
		
		public void txtPin(String PIN) throws InterruptedException {
			txtPin.clear();
			Thread.sleep(2000);
			txtPin.sendKeys(PIN);
		}
		
		public void buttonSubmit2() throws InterruptedException {
			buttonSubmit2.click();
			Thread.sleep(2000);
		}
		
		public void buttonAgree() throws InterruptedException {
			buttonAgree.click();
			Thread.sleep(2000);
		}
		
		public void linkProfile() throws InterruptedException {
			linkProfile.click();
			Thread.sleep(2000);
		}
		
		public void buttonLogout() throws InterruptedException {
			buttonLogout.click();
			Thread.sleep(2000);
		}
		
		public void buttonYes() throws InterruptedException {
			buttonYes.click();
			Thread.sleep(2000);
		}
		
		
		
		
		
		
}
