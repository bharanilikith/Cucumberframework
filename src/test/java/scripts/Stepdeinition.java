package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Stepdeinition {
	public  WebDriver driver;
	
	@Given("Open the browser and enter the valid URL")
	public void open_the_browser_and_enter_the_valid_url() {
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	}

	@When("user eneters valid username")
	public void user_eneters_valid_username() {
	   driver.findElement(By.id("email")).sendKeys("admin");
	}

	@When("user eneters valid password")
	public void user_eneters_valid_password() {
	driver.findElement(By.id("pass")).sendKeys("manager");   
	}

	@When("click on login button")
	public void click_on_login_button() {
	 driver.findElement(By.name("login")).click();   
	}

	@Then("user should in homepage of the application")
	public void user_should_in_homepage_of_the_application() {
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals(title,"Facebook – log in or sign up");
	}

}
