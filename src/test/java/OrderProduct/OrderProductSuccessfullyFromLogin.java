package OrderProduct;

import base.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.*;

@Test
public class OrderProductSuccessfullyFromLogin extends BaseTest {

    public void testOrderProductSuccessfullyFromLogin(){
        RegistrationPage registrationPage =landingPage.clickSignInButton();
        registrationPage.setLoginEmailField();
        registrationPage.setLoginPasswordField();
        MyAccountPage myAccountPage =registrationPage.clickLoginSubmitButton();
        myAccountPage.hoverOverWomen();
        BlousesPage blousesPage=myAccountPage.clickBlousesLink();
        blousesPage.hoverOverSelectedBlouse();
        blousesPage.clickAddToCartButton();
        ShoppingCartSummaryPage shoppingCartSummaryPage =blousesPage.clickProceedCheckOut();shoppingCartSummaryPage.assertONCartSummary();
        AddressPage addressPage =shoppingCartSummaryPage.clickProceedCheckOutButton();
        ShippingPage shippingPage =addressPage.clickProceedToCheckOutButton();
        shippingPage.setCheckBoxTrue();
        PaymentPage paymentPage=shippingPage.clickShippingProceedCheckout();
        paymentPage.clickPayBankWire();
        paymentPage.clickIConfirmMyOrderButton();
        paymentPage.clickMyAccount();
        OrderHistoryPage orderHistoryPage=myAccountPage.clickOrderHistoryAndDetails();
        orderHistoryPage.checkOrderPlacementInOrderHistory();

        String referenceNumber = orderHistoryPage.validateOrderPlacementInOrderHistory();
        String orderReferenceNumber = orderHistoryPage.orderNumberCode();

        Assertion assertion=new Assertion();
        assertion.assertTrue(referenceNumber.contains(orderReferenceNumber));

        System.out.println("This is the text Order: " + referenceNumber);
        System.out.println("This is the orderNumber: " + orderReferenceNumber);
    }
}
