package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom1 {
	
	// identify
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement txt_email;
	
	// password 
	// login 
	
	public WebElement gettxt_email() {
		return txt_email;
	}
	

}
