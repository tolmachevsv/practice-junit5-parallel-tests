package com.tolmachevsv.tests;

import com.tolmachevsv.pages.WildberriesMainPage;
import com.tolmachevsv.pages.WildberriesSearchPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class WildberriesTest {

    private WildberriesMainPage wildberriesMainPage = new WildberriesMainPage();
    private WildberriesSearchPage wildberriesSearchPage = new WildberriesSearchPage();

    @ValueSource(strings = {
            "iphone",
            "playstation"
    })
    @ParameterizedTest(name = "{0} test")
    void searchWildberriesTest(String query) {
        wildberriesMainPage.openPage();
        wildberriesMainPage.enterTheValueToSearchField(query);
        wildberriesSearchPage.addToCart(query);
    }

    @DisplayName("test iphone")
    @Test
    void anotherTest() {
        wildberriesMainPage.openPage();
        wildberriesMainPage.enterTheValueToSearchField("iphone");
        wildberriesSearchPage.addToCart("iphone");
    }
}
