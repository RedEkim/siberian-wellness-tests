package pages.web;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class UserOrdersPage {
    private final SelenideElement
        countOfPoints = $("[data-qa='VPOINT']"),
        btnPay = $("[data-qa='ORDER_CARD_PAY_ORDER']"),
        btnRepeat = $("[data-qa='SW_BUTTON']"),
        periodForPay = $(".order-card__payment-period"),
        areaForMoreDetails = $("[class='order-card profile-orders__order']"),
        btnSummarySubmit = $("[data-qa='summarySubmit']");
}
