package com.bitrix24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ActivityStreamPage extends BasePage {

    @FindBy(xpath = "//input[@id='LIVEFEED_search']")
    public WebElement activityStreamSearchBox;

    @FindBy(xpath = "//span[.='Favorites']")
    public WebElement favoritesFilterOption;

    @FindBy(xpath = "//span[@class='feed-add-post-form-link feed-add-post-form-link-active']")
    public WebElement sendMessageButton;

    @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
    public WebElement sendMessageBox;

    @FindBy(xpath = "//@bx-tooltip-user-id/..")
    public List<WebElement> listOfReviewerNames;


}
