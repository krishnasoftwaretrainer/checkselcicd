package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class SwagAllTestCases {

	WebDriver driver=Hooks.driver;
	@Given("user is on Swag Labs Login Page")
	public void user_is_on_swag_labs_login_page() {

		driver.get("https://www.saucedemo.com/");
	}
	@When("user enters  username {string}")
	public void user_enters_username(String string) {
		driver.findElement(By.tagName("input")).sendKeys("username");
		
	}
	@When("user enters  password {string}")
	public void user_enters_password(String string) {
		driver.findElement(By.name("password")).sendKeys("password");
	}
	@When("user clicks on swag login button")
	public void user_clicks_on_swag_login_button() {
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
	}
	@Then("user should be redirect to Swaglabs Products page")
	public void user_should_be_redirect_to_swaglabs_products_page() {
		
		if(driver.getCurrentUrl().contains("inventory.html"))
		{
			Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"));
			System.out.println("Login Success");
		}
		else
		{
			WebElement errormsg=driver.findElement(By.xpath("//h3[@data-test=\"error\"]"));
			Assert.assertTrue(errormsg.isDisplayed());
		}
	}

}
