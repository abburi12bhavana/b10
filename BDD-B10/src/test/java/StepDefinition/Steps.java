package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;
	@Given("I am able to naviagte onto the login page")
	public void i_am_able_to_naviagte_onto_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver 89\\chromedriver_win32 (4)\\chromedriver.exe");
		   //this is to open the new instance of browser
		   driver = new ChromeDriver();
		   //This is basically to opent the application
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		   //if i want to maximize the screen
		   driver.manage().window().maximize();
		   //if i want to wait for sometime
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}
	
	@When("I Enter the username as {string}")
	public void i_enter_the_username_as(String string) {
		driver.findElement(By.id("txtUsername")).sendKeys(string);
	  
	}
	
	
	@When("I Enter the Password as {string}")
	public void i_enter_the_password_as(String string) {
		 driver.findElement(By.id("txtPassword")).sendKeys(string);
	    
	}
	
	
	@When("I Click on the Login button")
	public void i_click_on_the_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	    
	}
	
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) throws InterruptedException {
		String name = driver.findElement(By.id("welcome")).getText();
	    String Actualdata = string;
	    Assert.assertEquals(name, Actualdata);
	    System.out.println("login successfull");
	    driver.close();
	   
	}
	
	@Then("I should see a Error Message as {string}")
	public void i_should_see_a_error_message_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   String actualerr = driver.findElement(By.id("spanMessage")).getText();
	   
	   String Expectederr = "Invalid credentials";
	   Assert.assertEquals(Expectederr, actualerr);
	   driver.close();
	}

}
