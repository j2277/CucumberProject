package skeleton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DemoWebShopObjects {
	
	@FindBy(how=How.ID,using="Email")
	public static WebElement email;
	@FindBy(how=How.ID,using="Password")
	public static WebElement password;
	@FindBy(how=How.ID,using="input[value'Log in']")
	public static WebElement login;
	@FindBy(how=How.LINK_TEXT,using="Log out")
	public static WebElement logout;

}
