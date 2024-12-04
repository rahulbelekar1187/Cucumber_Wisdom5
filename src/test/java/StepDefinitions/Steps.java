package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Login_Wisdom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Steps {
	
	public WebDriver driver;
	public Login_Wisdom LW;

	@Given("user opens a chrome browser")
	public void user_opens_a_chrome_browser() {
	    System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	    LW = new Login_Wisdom(driver);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user enters valid url as {string}")
	public void user_enters_valid_url_as(String url) throws InterruptedException {
	    driver.get(url);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	}

	@When("user enters valid {string}")
	public void user_enters_valid(String userid) throws InterruptedException {
	    LW.userid(userid);
	    Thread.sleep(2000);
	}

	@When("click on Validate button")
	public void click_on_Validate_button() throws InterruptedException {
	    LW.btnvalidation();
	    Thread.sleep(2000);
	}

	@When("user enters valid password as {string}")
	public void user_enters_valid_password_as(String password) throws InterruptedException {
	    LW.password(password);
	    Thread.sleep(2000);
	}

	@When("check into the Checkbox")
	public void check_into_the_Checkbox() throws InterruptedException {
	    LW.clickCheckbox();
	    Thread.sleep(2000);
	}

	@When("click on Submit button")
	public void click_on_Submit_button() throws InterruptedException {
	    LW.buttonSubmit();
	    Thread.sleep(2000);
	}

	@When("user enters valid pin as{string}")
	public void user_enters_valid_pin_as(String pin) throws InterruptedException {
	    LW.txtPin(pin);
	    Thread.sleep(2000);
	}

	@When("click on Submit\\(second)button")
	public void click_on_Submit_second_button() throws InterruptedException {
		LW.buttonSubmit2();
	    Thread.sleep(2000);
	}

	@When("click on agree button")
	public void click_on_agree_button() throws InterruptedException {
	    LW.buttonAgree();
	    Thread.sleep(2000);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String tit) throws InterruptedException {
	   String title = driver.getTitle();
	   System.out.println(title);
	   
	   Assert.assertEquals(tit, title);
	   Thread.sleep(2000);
	}

	@When("user click on profile dropdown button")
	public void user_click_on_profile_dropdown_button() throws InterruptedException {
	    LW.linkProfile();
	    Thread.sleep(2000);
	}

	@When("user click on Logout link")
	public void user_click_on_Logout_link() throws InterruptedException {
	    LW.buttonLogout();
	    Thread.sleep(2000);
	}

	@When("user click on Yes button")
	public void user_click_on_Yes_button() throws InterruptedException {
	    LW.buttonYes();
	    Thread.sleep(2000);
	}

	@Then("page title should be display as {string}")
	public void page_title_should_be_display_as(String tit2) throws InterruptedException {
		String title2 = driver.getTitle();
		   System.out.println(title2);
		   
		   Assert.assertEquals(tit2, title2);
		   Thread.sleep(2000);
	}

	@Then("user close the browser")
	public void user_close_the_browser() throws InterruptedException {
	   driver.close();
	   Thread.sleep(2000);
	}
}
