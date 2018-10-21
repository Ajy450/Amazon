package Action;

import org.openqa.selenium.WebElement;
import com.test.demo.BaseTemplate;
import com.utilities.java.ReadJson;
import com.utilities.java.StartUpInitilize;

import Locator.LoginLocatorAmazon;

public class LoginScriptAmz extends BaseTemplate{
	LoginLocatorAmazon locator= new LoginLocatorAmazon();
	StartUpInitilize initilize = new StartUpInitilize();
	public void login(){
	
	
	locator.loginBtn.click();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	enterText(locator.username,ReadJson.getJsonValue("$.AdminCredentials.username"));
	//locator.username.sendKeys(ReadJson.getJsonValue("$.AdminCredentials.username"));
	locator.submit.click();
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	enterText(locator.password,ReadJson.getJsonValue("$.AdminCredentials.password"));
	//locator.password.sendKeys(ReadJson.getJsonValue("$.AdminCredentials.password"));
	locator.login.click();
	}
	
	public void logout(){
		mouseOver(locator.loginBtn);
	
	}

}

			
		
	
	


