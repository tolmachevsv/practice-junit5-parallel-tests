package com.tolmachevsv.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class WildberriesSearchPage {

    /*
     Честно не понял, у меня второй тест по добавлению в корзину айфона не падает из-за статика.
     По теории я понял, что для статичного поля, если кнопка меняется для одного потока, то и для другого
     потока она будет такой же, и тест упадет.
     Я добавляю в корзину айфон в двух тестах, кнопка должна меняться с "В корзину" на "В корзине", но тесты проходят.
     Вообще у меня тесты рандомно проходят, то passed, то failed (из-за компа и инета плохого)
    */
    public static ElementsCollection productCards = $$(".product-card__wrapper");
    public void addToCart(String query) {
        Configuration.timeout = 10000;
        productCards.shouldBe(sizeGreaterThan(0))
                .get(1)
                .shouldHave(text(query)).hover().
                $(".btn-main-sm").
                shouldHave(exactText("В корзину")).click();
    }
}
