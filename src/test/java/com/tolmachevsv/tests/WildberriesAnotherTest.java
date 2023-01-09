package com.tolmachevsv.tests;

import com.tolmachevsv.pages.WildberriesMainPage;
import com.tolmachevsv.pages.WildberriesSearchPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WildberriesAnotherTest {

    private WildberriesMainPage wildberriesMainPage = new WildberriesMainPage();
    private WildberriesSearchPage wildberriesSearchPage = new WildberriesSearchPage();

    @DisplayName("test iphone")
    @Test
    void anotherTest() {
        wildberriesMainPage.openPage();
        wildberriesMainPage.enterTheValueToSearchField("iphone");
        wildberriesSearchPage.addToCart("iphone");
    }
}
