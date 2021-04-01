package sProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		WebDriver driver = testsomething.getDriver();
		//navigating website
		driver.get("http://automationpractice.com");
		
		//Click Signin button/link
			//find Signin element
				WebElement element = driver.findElement(By.className("login"));
			
			//click on found
				element.click();
				
				
		//Enter "example@gmail.com" email address in text field
			//find mail
				element = driver.findElement(By.id("email"));
				
			//Enter text : ibrahim.omi9706@gmail.com
				element.sendKeys("ibrhim.omi9706@gmail.com");
				
			//Enter password
				driver.findElement(By.id("passwd")).sendKeys("Jhonabrahum12@@");
				
			//Click sign In Button
				driver.findElement(By.id("SubmitLogin")).click();
				
				//WebElement signout_button = driver.findElement(By.className("logout"));
				
				WebElement page_header= driver.findElement(By.className("page-heading"));
				
				//String signout_button_text = signout_button.getText();
				String header_text = page_header.getText();
				
				//System.out.println(signout_button_text);
				//System.out.println(header_text);
				
				if(header_text.equals("MY ACCOUNT")) {
					
					System.out.println("Login Test is Passed");
					
				}else
				{
					System.out.println("Login Test is Failed");

				}
				
	}

}
