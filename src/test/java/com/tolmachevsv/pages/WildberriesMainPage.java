package com.tolmachevsv.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class WildberriesMainPage {

    private SelenideElement searchField = $("#searchInput");

    public void openPage() {
        Configuration.browserSize = "1920x1080";
        open("https://www.wildberries.ru/");
        sleep(15000);
    }

    public void enterTheValueToSearchField(String query) {
        searchField.setValue(query);
        sleep(6000);
        searchField.sendKeys(Keys.ENTER);
    }
}
