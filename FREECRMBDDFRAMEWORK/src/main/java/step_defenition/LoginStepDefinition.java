package step_defenition;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {


WebDriver driver;
	
     @Given("^user is already on Login Page$")
	 public void user_already_on_login_page(){
	 System.setProperty("webdriver.chrome.driver","D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
     driver.get("https://classic.crmpro.com/login.cfm");
 }
	
	
	 @When("^title of login page is CRMPRO Log In Screen$")
      public void title_of_login_page_is_free_CRM(){
      String title = driver.getTitle();
      System.out.println(title);
      Assert.assertEquals("CRMPRO Log In Screen", title);
	 }
	
	
	 @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
      public void user_enters_username_and_password(String username, String password){
	  driver.findElement(By.name("username")).sendKeys("saurav3242");
	  driver.findElement(By.name("password")).sendKeys("sokr_3820");
	 }
	
	 @Then("^user clicks on login button$")
	  public void user_clicks_on_login_button() {
      WebElement loginBtn =
	  driver.findElement(By.xpath("//input[@type='submit']"));
      JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click();", loginBtn);
      //driver.findElement(By.xpath("//input[@type='submit']")).click();
	 }


	  @Then("^user is on home page$")
	  public void user_is_on_home_page(){
	  String title = driver.getTitle();
      System.out.println("Home Page title ::"+ title);
	  Assert.assertEquals("CRMPRO", title);
 }
}