package OrderProduct;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.RegistrationDataPage;
import pages.RegistrationPage;

@Test
public class OrderProductTests extends BaseTest {
    public void testOrderProductSuccessfully(){
    RegistrationPage registrationPage =landingPage.clickSignInButton();
    registrationPage.setEmailField();
    registrationPage.clickCreateAccountButton();
    // Assert.assertEquals("Your personal information","Your personal information");
      RegistrationDataPage registrationDataPage =registrationPage.clickCreateAccountButton();
      registrationDataPage.setTitleField();
      registrationDataPage.setFirstNameField();
      registrationDataPage.setLastNameField();
      registrationDataPage.setPasswordField();
      registrationDataPage.setAddressFirstNameField();
      registrationDataPage.setAddressLastNameField();
      registrationDataPage.setAddressField();
      registrationDataPage.setAddressCityField();
      registrationDataPage.setAddressStateDropdown();
      registrationDataPage.setAddressPostalCode();
      registrationDataPage.setAddressMobileNumber();
      registrationDataPage.setRegisterButton();

    }


}
