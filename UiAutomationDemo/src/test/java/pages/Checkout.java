package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Checkout {
		
		WebDriver driver;
		
		public Checkout(WebDriver driver) 
		{
			 this.driver = driver;
		}
	
		 By checkoutBtn       = By.xpath("//button[@id='checkout']");
		 By firstName       = By.xpath("//input[@id='first-name']");
		 By lastName       = By.xpath("//input[@id='last-name']");
		 By zipCode       = By.xpath("//input[@id='postal-code']");
		 By continueBtn      = By.xpath("//input[@id='continue']");
		 By finishBtn      = By.xpath("//button[@id='finish']");
		
		 
		 public void clickCheckoutBtn() throws Exception {
				
				driver.findElement(checkoutBtn).click();
				Thread.sleep(4000);
	    }
		 
		 public void enterFirstName() throws Exception {
				driver.findElement(firstName).sendKeys("Simamkele");
				Thread.sleep(2000);
				
			}
		 public void enterLastName() throws Exception {
				driver.findElement(lastName).sendKeys("Nkonyeni");
				Thread.sleep(2000);
				
			}
		 public void enterZipCode() throws Exception{
				driver.findElement(zipCode).sendKeys("1234");
				Thread.sleep(2000);
				
			}
		 
		 public void clickContinueBtn() throws Exception {
				
				driver.findElement(continueBtn).click();
				Thread.sleep(4000);
			}
		 public void validateCheckoutStepTwoPage() {
				String strUrl = driver.getCurrentUrl();
				String expected = "https://www.saucedemo.com/checkout-step-two.html";
				Assert.assertEquals(expected, strUrl);
			}
		 public void clickFinishBtn() throws Exception {
				
				driver.findElement(finishBtn).click();
				Thread.sleep(5000);
			}
		 public void validateCheckoutCompletePage() {
				String strUrl = driver.getCurrentUrl();
				String expected = "https://www.saucedemo.com/checkout-complete.html";
				Assert.assertEquals(expected, strUrl);
				
			}
}
