package pages.web;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AddressPage {
    private final SelenideElement
        btnAddAddressStandart = $("[data-qa='SW_BUTTON']"),
        btnToolTip = $("[data-qa='SW_TOOLTIP_BUBBLE']"),
        btnMakeMain = $("[data-qa='SW_MENU_ITEMS_TEXT']").find("Сделать основным"),
        btnDeleteAddress = $("[data-qa='SW_MENU_ITEMS_TEXT']").find("Удалить"),
        snackBarAboutDeleting = $("[data-qa='SW_SNACKBAR_HEADER']"),
        noAddressTitle = $(".profile-delivery-address__no-addresses-title"),
        noAddressDescription = $(".profile-delivery-address__no-address-description"),
        btnAddAddressWithoutAddress = $("[data-qa='PROFILE_DELIVERY_ADDRESS_ADD_ADDRESS_BUTTON']"),
        postIndex = $("input[class='sw-input__value sw-input__value_placeholder address-form-kz__index']"),
        streetName = $("input[class='sw-input__value sw-input__value_placeholder address-form-kz__street']"),
        house = $("input[class='sw-input__value sw-input__value_placeholder address-form-kz__house']"),
        addAddress = $("SW_BUTTON").find("Добавить адрес");
}
