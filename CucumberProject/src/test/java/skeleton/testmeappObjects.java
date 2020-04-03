package skeleton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class testmeappObjects {
	
	

	/*@FindBy(how = How.XPATH,using="//li[2]/a/i")
	public static WebElement link;*/
	
	@FindBy(how = How.ID,using="userName")
	public static WebElement username;
	
	@FindBy(how = How.ID,using="firstName")
	public static WebElement firstname;
	
	@FindBy(how = How.ID,using="lastName")
	public static WebElement lastname;
	
	@FindBy(how = How.ID,using="password")
	public static WebElement password;
	
	
	@FindBy(how = How.ID,using="pass_confirmation")
	public static WebElement confirmpassword;
	
	
	@FindBy(how = How.ID,using="gender")
	public static WebElement gender;
	
	@FindBy(how = How.ID,using="emailAddress")
	public static WebElement email;
	
	@FindBy(how = How.ID,using="mobileNumber")
	public static WebElement mobilenumber;
	
	@FindBy(how = How.ID,using="dob")
	public static WebElement dob;
	
	@FindBy(how = How.ID,using="securityQuestion")
	public static WebElement securityquestion;
	
	@FindBy(how = How.ID,using="answer")
	public static WebElement answer;
	
	@FindBy(how = How.NAME,using="Submit")
	public static WebElement submit;
	
	@FindBy(how = How.NAME,using="login button")
	public static WebElement loginbutton;
	
	@FindBy(how = How.NAME,using="log out")
	public static WebElement logout;
	
	@FindBy(how = How.NAME,using="myInput")
	public static WebElement products;
	
	@FindBy(how = How.XPATH,using=".//input[@value='FIND DETAILS']")
	public static WebElement finddetails;
	
	@FindBy(how = How.CLASS_NAME,using="btn")
	public static WebElement Addtocart;

}
