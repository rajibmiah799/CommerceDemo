package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='Email']")
	WebElement email;

	public void enterEmail() {
		email.clear();
		email.sendKeys("admin@yourstore.com");

	}

	@FindBy(xpath = "//input[@id='Password']")
	WebElement pass;

	public void enterPass() {
		pass.clear();
		pass.sendKeys("admin");
	}

	@FindBy(xpath = "//input[@class='button-1 login-button']")
	WebElement login;

	public void clickLogin() {
		login.click();
	}

	@FindBy(xpath = "(//span[contains(text(),'Customers')])[1]")

	WebElement Customer;

	public void clickcustomer() {
		Customer.click();
	}

	@FindBy(xpath = "(//span[contains(text(),'Customers')])[2]")
	WebElement Rcustomer;

	public void clickRcus() {
		Rcustomer.click();
	}

	@FindBy(xpath = "//a[@class='btn bg-blue']")
	WebElement addNew;

	public void clickAddnew() {
		addNew.click();
	}

	@FindBy(xpath = "//input[@id='Email']")
	WebElement Useremail;

	public void enterUseremail() {
		Useremail.sendKeys("rajib@yahoo.com");
	}

	@FindBy(xpath = "//input[@id='Password']")
	WebElement userPass;

	public void enterUserpass() {
		userPass.sendKeys("12345");
	}

	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement firstName;

	public void enterFirstname() {
		firstName.sendKeys("md");

	}

	@FindBy(xpath = "//input[@id='LastName']")
	WebElement lastName;

	public void enterLastname() {
		lastName.sendKeys("ahmed");
	}

	@FindBy(xpath = "//input[@id='Gender_Male']")
	WebElement malebutton;

	public void clickmale() {
		malebutton.click();
	}

	public void birthDate() throws InterruptedException {
		driver.findElement(By.xpath("(//span[@class='k-select'])[1]")).click();

		while (true) {
			String month = "June 2020";
			String mon = driver.findElement(By.xpath("//a[@class='k-link k-nav-fast']")).getText();
			if (mon.contentEquals(month)) {
				break;
			} else {
				driver.findElement(By.xpath("//a[@class='k-link k-nav-prev']")).click();
				Thread.sleep(3000);
			} // end if

			driver.findElement(
					By.xpath("//div[@id='DateOfBirth_dateview']//div[1]//div[2]//table//tbody//tr[4]//td[3]//a"))
					.click();
		} // end while
	}// end birthdate

}
