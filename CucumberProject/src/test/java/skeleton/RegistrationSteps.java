package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
	WebDriver driver;
	public RegistrationSteps() {
	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	PageFactory.initElements(driver, testmeappObjects.class);
	}
	
	
	
	@Given("Test Me registration url {string}")
	public void test_Me_registration_url(String url) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(url);
	}

	
	@When("Test Me user enters username {string}")
	public void test_Me_user_enters_username(String username) {
	    // Write code here that turns the phrase above into concrete actions
		testmeappObjects.username.sendKeys(username);
	}

	@When("Test Me user enters firstname {string}")
	public void test_Me_user_enters_firstname(String firstname) {
	    // Write code here that turns the phrase above into concrete actions
		testmeappObjects.firstname.sendKeys(firstname);
	}

	@When("Test Me user enters lastname {string}")
	public void test_Me_user_enters_lastname(String lastname) {
	    // Write code here that turns the phrase above into concrete actions
		testmeappObjects.lastname.sendKeys(lastname);
	}

	@When("Test Me user enters password {string}")
	public void test_Me_user_enters_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
		testmeappObjects.password.sendKeys(password);
	}

	@When("Test Me user enters confirm password {string}")
	public void test_Me_user_enters_confirm_password(String confirmpassword) {
	    // Write code here that turns the phrase above into concrete actions
		testmeappObjects.confirmpassword.sendKeys(confirmpassword);
	}

	@When("Test Me user enters gender {string}")
	public void test_Me_user_enters_gender(String gender) {
	    // Write code here that turns the phrase above into concrete actions
		testmeappObjects.gender.click();
	}

	@When("Test Me user enters email {string}")
	public void test_Me_user_enters_email(String email) {
	    // Write code here that turns the phrase above into concrete actions
		testmeappObjects.email.sendKeys("drraksha17@gmail.com");
	}

	@When("Test Me user enters mobileno {string}")
	public void test_Me_user_enters_mobileno(String mobilenumber) {
	    // Write code here that turns the phrase above into concrete actions
		testmeappObjects.mobilenumber.sendKeys("8951086999");
	}

	@When("Test Me user enters dob {string}")
	public void test_Me_user_enters_dob(String dob) {
	    // Write code here that turns the phrase above into concrete actions
		testmeappObjects.dob.sendKeys("12/05/1997");
	}

	@When("Test Me user enters security question {string}")
	public void test_Me_user_enters_security_question(String securityquestion ) {
	    // Write code here that turns the phrase above into concrete actions
		testmeappObjects.securityquestion.sendKeys("What is your favour color");
	}

	@When("Test Me user enters answer {string}")
	public void test_Me_user_enters_answer(String answer) {
	    // Write code here that turns the phrase above into concrete actions
		testmeappObjects.answer.sendKeys("Green");}
		
	
	@When("Test Me user clicks register")
	public void test_Me_user_clicks_register(String submit) {
	    // Write code here that turns the phrase above into concrete actions
		testmeappObjects.submit.click();
	}
	
	@Then("Test Me user registered successfully")
	public void test_Me_user_registered_successfully(String submit) {
	    // Write code here that turns the phrase above into concrete actions
		String title=driver.getTitle();
		Assert.assertEquals(title,  "Login");
	}
	
	@Given("Test Me login url {string}")
	public void test_Me_login_url(String url) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.get(url);
	}

	@When("Test Me user enters {string} as username")
	public void test_Me_user_enters_as_username(String username) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		testmeappObjects.username.sendKeys(username);
	}

	@When("Test Me user enters {string} as password")
	public void test_Me_user_enters_as_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		testmeappObjects.password.sendKeys(password);
	}

	@When("Test Me user enters clicks on login button")
	public void test_Me_user_enters_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		testmeappObjects.loginbutton.click();
	}

	@Then("TestMe user is in shopping page")
	public void testme_user_is_in_shopping_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Assert.assertTrue(testmeappObjects.logout.isDisplayed());
	}
	@When("Test Me user search for product {string}")
	public void test_Me_user_search_for_product(String products) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		testmeappObjects.products.sendKeys(products);
	}

	@Then("Test Me user clicks on find details")
	public void test_Me_user_clicks_on_find_details() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		testmeappObjects.finddetails.click();
	}

	@Then("Add the product to cart")
	public void add_the_product_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		testmeappObjects.Addtocart.click();
	}




}
