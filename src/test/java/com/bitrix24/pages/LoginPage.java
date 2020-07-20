package com.bitrix24.pages;

import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@type='text']")
    private WebElement usernameElement;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordElement;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement loginButton;

    /**
     * Method to login, version #1
     * Login as a specific user
     *
     * @param username
     * @param password
     */
    public void login(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa_env"));
        wait.until(ExpectedConditions.visibilityOf(usernameElement)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(passwordElement)).sendKeys(password, Keys.ENTER);

    }

    /**
     * Method to login, version #2
     * Login as a default user
     * Credentials will be retrieved from configuration.properties file
     */
    public void login() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa_env"));
        String username = ConfigurationReader.getProperty("helpdesk7");
        String password = ConfigurationReader.getProperty("password");
        wait.until(ExpectedConditions.visibilityOf(usernameElement)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(passwordElement)).sendKeys(password, Keys.ENTER);
    }

}
