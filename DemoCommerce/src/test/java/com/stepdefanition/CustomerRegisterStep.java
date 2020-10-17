package com.stepdefanition;

import com.common.Base;
import com.pageobjectmodel.RegisterPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerRegisterStep extends Base {
	RegisterPage rp;


	@Given("^user on homepage$")
	public void user_on_homepage() throws Throwable {
		getDriver();

	}

	@When("^user enter email in the box$")
	public void user_enter_email_in_the_box() throws Throwable {
		rp = new RegisterPage(driver);
		rp.enterEmail();

	}

	@When("^user enter pass$")
	public void user_enter_pass() throws Throwable {

		rp.enterPass();

	}

	@When("^user click login$")
	public void user_click_login() throws Throwable {
		rp.clickLogin();
	}

	@When("^user click on customers$")
	public void user_click_on_customers() throws Throwable {
		rp.clickcustomer();

	}

	@When("^user click on customers redio button$")
	public void user_click_on_customers_redio_button() throws Throwable {
		rp.clickRcus();

	}

	@When("^user click new user button$")
	public void user_click_new_user_button() throws Throwable {
		rp.clickAddnew();

	}

	@When("^user enter email$")
	public void user_enter_email() throws Throwable {
		rp.enterUseremail();

	}

	@When("^user enter password$")
	public void user_enter_password() throws Throwable {
		rp.enterUserpass();

	}

	@When("^user enter first name$")
	public void user_enter_first_name() throws Throwable {
		rp.enterFirstname();

	}

	@When("^user enter last name$")
	public void user_enter_last_name() throws Throwable {
		rp.enterLastname();

	}

	@When("^user click gender male redio button$")
	public void user_click_gender_male_redio_button() throws Throwable {
		rp.clickmale();

	}

	@When("^user choose date of birth$")
	public void user_choose_date_of_birth() throws Throwable {
		rp.birthDate();

	}

	@When("^user enter company name$")
	public void user_enter_company_name() throws Throwable {

	}

	@When("^user click is tax exempt$")
	public void user_click_is_tax_exempt() throws Throwable {

	}

	@When("^user choose newsletter$")
	public void user_choose_newsletter() throws Throwable {

	}

	@When("^user choose customers roles$")
	public void user_choose_customers_roles() throws Throwable {

	}

	@When("^user choose manage of vandor$")
	public void user_choose_manage_of_vandor() throws Throwable {

	}

	@When("^user click active chack box$")
	public void user_click_active_chack_box() throws Throwable {

	}

	@When("^user add comments on admin comment box$")
	public void user_add_comments_on_admin_comment_box() throws Throwable {

	}

	@When("^user click on save button$")
	public void user_click_on_save_button() throws Throwable {

	}

	@Then("^user add new customer successfully$")
	public void user_add_new_customer_successfully() throws Throwable {

	}

}
