package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	// 1. By Locators: OR
	private By userName = By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[3]/form/div[1]/input");
	private By password = By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[3]/form/div[2]/div[1]/input");
	private By loginBtn = By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[3]/form/button");
	private By signUpLink = By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[3]/form/div[5]/a");
	private By forgotPwdLink = By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[3]/form/div[3]");

	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}

	public void enterUserName(String username) {
		driver.findElement(userName).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLogin() {
		driver.findElement(loginBtn).click();
	}

	public boolean isSignUpLinkExist() {
		return driver.findElement(signUpLink).isDisplayed();
	}
	
	public AccountsPage doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " and " + pwd);
		driver.findElement(userName).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
		return new AccountsPage(driver);
	}

}
