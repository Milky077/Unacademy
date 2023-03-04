package BDD.sprint2;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Sprint2Stepdefinition {
	WebDriver driver;
	private Sprint2PageFactory ref;
	
  @Test
  @Given("User launch the chrome browser")
  public void user_launch_the_chrome_browser() {
	  System.setProperty("Webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  ref = new Sprint2PageFactory(driver);
  }
  
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @When("User opens URL {string}")
  public void user_opens_url(String string) throws InterruptedException {
	  driver.get("https://unacademy.com/goal/jee-main-and-advanced-preparation/TMUVD");
		driver.manage().window().maximize(); 
		Thread.sleep(4000);
		ref.gotit_popup();
  }
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @When("User choose the login button")
  public void user_choose_the_login_button() throws InterruptedException {
	  Thread.sleep(4000);
	  ref.login_logo();
  }
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
  
   */
 
  @When("User enters the mobile number")
  public void user_enters_the_mobile_number() throws InterruptedException {
	  Thread.sleep(4000);
	  ref.phnum();
	  Thread.sleep(2000);
	  ref.login();
	  Thread.sleep(20000);
	  ref.verify_otp();
	  Thread.sleep(20000);
  }
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @Then("the page should be opened successfully")
  public void the_page_should_be_opened_successfully() throws InterruptedException {
      Thread.sleep(2000);
      //String title = driver.getTitle();
     // Assert.assertEquals(title, "Unacademy");
      
      assert(ref.ispagedisplayed());
      
  }
  
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @Given("user clicks on search button")
  public void user_clicks_on_search_button() throws InterruptedException {
	  ref.search_btn();
	  Thread.sleep(2000);  
  }
  
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @When("user fill in the field {string}")
  public void user_fill_in_the_field(String string) throws InterruptedException {
	  WebElement searchInput = driver.findElement(By.xpath("//input[@class='seachInput aquilla-input input css-1i3foa3']"));
      searchInput.sendKeys(string);
      Thread.sleep(2000);
     
      Actions actions = new Actions(driver);
	  actions.sendKeys(Keys.ENTER).build().perform();
	  Thread.sleep(2000);

  }
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @When("^user search for the following criteria$")
  public void user_search_for_the_following_criteria(DataTable dataTable) {
	  Sprint2PageFactory searchPage = new Sprint2PageFactory(driver);
      List<List<String>> data = dataTable.asLists(String.class);

      for (List<String> row : data) {
          String educatorName = row.get(0);
          String courseName = row.get(1);
          searchPage.searchForEducator(educatorName, courseName);
      }
  }
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @Then("I should see search results for each educators")
  public void i_should_see_search_results_for_each_educator() {
  }
  
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @Given("User select the View Subscription plans option")
  public void user_select_the_view_subscription_plans_option() throws InterruptedException {
	  ref.accept_popup();
	  JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(0, 500)");
      Thread.sleep(3000);
      
      WebElement subscriptionPlansSection = ref.sub_plan();
      if (subscriptionPlansSection.isDisplayed()) {
          System.out.println("User has been redirected to the subscription plans page");
      } else {
          Assert.fail("User has not been redirected to the subscription plans page");
      }
      Thread.sleep(15000);
  }

  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @When("User choose the get lite option")
  public void user_choose_the_get_lite_option() throws InterruptedException {
	  JavascriptExecutor jss = (JavascriptExecutor)driver;
      jss.executeScript("window.scrollBy(0, 1100)");
      Thread.sleep(2000);
     
      
      WebElement getliteoption = ref.getlite_btn();
      if (getliteoption.isDisplayed()) {
          System.out.println("User has been redirected to the get lite page");
      } else {
          Assert.fail("User has not been redirected to the get lite page");
      }
      Thread.sleep(5000);
  }
  
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @When("User choose the proceed to pay option")
  public void user_choose_the_proceed_to_pay_option() throws InterruptedException {
	  ref.ptopay_btn();
      Thread.sleep(7000);
  }
  
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @When("User select the UPI option")
  public void user_select_the_upi_option() throws InterruptedException {
	  ref.upi_btn();
      Thread.sleep(2000);
  }

  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @When("User enter UPI details")
  public void user_enter_upi_details() throws InterruptedException {
	  ref.upi_details();
	  Thread.sleep(3000);
  }
  
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @When("User click the pay button")
  public void user_click_the_pay_button() throws InterruptedException {
	  ref.pay();
      Thread.sleep(2000);
  }
  
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @Then("User should see the popup message.")
  public void user_should_see_the_popup_message() throws InterruptedException {
	  //Thread.sleep(3000);
	  WebElement popupMessage = driver.findElement(By.xpath("//div[@class='MuiAlert-message']"));
	  Assert.assertTrue(popupMessage.isDisplayed());
  }
  
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @When("User choose the get plus option")
  public void user_choose_the_get_plus_option() throws InterruptedException {
	  JavascriptExecutor jss = (JavascriptExecutor)driver;
      jss.executeScript("window.scrollBy(0, 1100)");
      Thread.sleep(2000);
     
      
      WebElement getplusoption = ref.getplus_btn();
      if (getplusoption.isDisplayed()) {
          System.out.println("User has been redirected to the get plus page");
      } else {
          Assert.fail("User has not been redirected to the get plus page");
      }
      Thread.sleep(5000);
      ref.ptopay_btn();
    
      Thread.sleep(5000);
  }
  
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @When("User select the credit card payment option")
  public void user_select_the_credit_card_payment_option() throws InterruptedException {
	  JavascriptExecutor jss = (JavascriptExecutor)driver;
      jss.executeScript("window.scrollBy(0, 300)");
      
      driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div/div[1]/div[5]/p")).click();
      Thread.sleep(2000);
  }
  
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @Then("User should see the payment section")
  public void user_should_see_the_payment_section() throws InterruptedException {
	  Thread.sleep(1000);
	  WebElement paymentSection = driver.findElement(By.xpath("//button[@aria-label='Pay']"));
	  Assert.assertTrue(paymentSection.isDisplayed());
  }
  
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @When("User choose the get iconic option")
  public void user_choose_the_get_iconic_option() throws InterruptedException {
	  JavascriptExecutor jss = (JavascriptExecutor)driver;
      jss.executeScript("window.scrollBy(0, 1100)");
      Thread.sleep(2000);
      
      
      WebElement geticonicoption = ref.geticonic_btn();
      if (geticonicoption.isDisplayed()) {
          System.out.println("User has been redirected to the get iconic page");
      } else {
          Assert.fail("User has not been redirected to the get iconic page");
      }
      Thread.sleep(5000);
      ref.ptopay_btn();
      Thread.sleep(2000);
  }
  
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @When("User choose the EMI pay option")
  public void user_choose_the_emi_pay_option() throws InterruptedException {
	  ref.emi_btn();
	  Thread.sleep(2000);
  }

  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @When("User choose a plan option")
  public void user_choose_a_plan_option() throws InterruptedException {
	  ref.c_plan();
	  Thread.sleep(2000);
  }
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @Then("User should see the EMI details")
  public void user_should_see_the_emi_details() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement emiDetails = driver.findElement(By.xpath("//h6[@class='css-19q2qjd-H6-Heading eyq630510']"));
	  Assert.assertTrue(emiDetails.isDisplayed());
  }
  
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @When("User choose the choose center option")
  public void user_choose_the_choose_center_option() throws InterruptedException {
	  JavascriptExecutor jss = (JavascriptExecutor)driver;
      jss.executeScript("window.scrollBy(0, 1100)");
      Thread.sleep(2000);
     
      
      WebElement choosecenteroption = ref.c_center();
      if (choosecenteroption.isDisplayed()) {
          System.out.println("User has been redirected to the choose center page");
      } else {
          Assert.fail("User has not been redirected to the choose center page");
      }
      Thread.sleep(5000);
  }
  
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @When("User choose the view batches option")
  public void user_choose_the_view_batches_option() throws InterruptedException {
	  JavascriptExecutor jss = (JavascriptExecutor)driver;
      jss.executeScript("window.scrollBy(0, 400)");
      Thread.sleep(2000);
      ref.v_batches();
  }
  
  /* Created by : Harish S
   * Modified by:
   * Reviewed by : Roopanand Kommi Naidu
   */
  @Then("User should see the batches details")
  public void user_should_see_the_batches_details() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement batchDetails = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div[12]/div/div[2]/div[1]/h5"));
	  Assert.assertTrue(batchDetails.isDisplayed());
  }
}
