package com.cybertek.PageObjectModel;

import com.cybertek.PageObjectModel.HomePage;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMessageValidationTest extends TestBase {
    HomePage homePage = new HomePage();


    /*
    Wrong username:
    1. go to website  http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
    2. try to login with wrong username
    3. verify error message "Invalid Login or Password."
     */

    @Test
    public void WrongEmailTest(){



        driver.get("  http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        homePage.username.sendKeys("admin");
        homePage.password.sendKeys("test");
        homePage.loginButton.click();

        // driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("admin");
        // driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        // driver.findElement(By.id("ctl00_MainContent_login_button")).click();

       String error = "Invalid Login or Password.";
       String actualError = homePage.errorMessage.getText();
        Assert.assertEquals(actualError, error);
 }

 /*
  Wrong password:
    1. go to website  http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
    2. try to login with wrong password
    3. verify error message "Invalid Login or Password."
  */

 @Test
    public void WrongPasswordTest(){

     driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

     homePage.username.sendKeys("Tester");
     homePage.password.sendKeys("wrong password");
     homePage.loginButton.click();

//     driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
//     driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("good");
//     driver.findElement(By.id("ctl00_MainContent_login_button")).click();

     String expectedError = "Invalid Login or Password.";
     String actualError = homePage.errorMessage.getText();
     Assert.assertEquals(actualError, expectedError);

 }


@Test
    public void blankUsername(){

    homePage.open();
    homePage.login("", "test");

    String expectedError = "Invalid Login or Password.";
    String actualError = homePage.errorMessage.getText();
    Assert.assertEquals(actualError, expectedError);

}
//this is just a method which does not do anything
   @Test
    public void test(){

     ListingPage nilesLane = new ListingPage();

     ListingPage palmetLane = new ListingPage();

     PresToShopHomePage presToShopHomePage = new PresToShopHomePage();

       WebElement tshirt = presToShopHomePage.product("tshirt");

       WebElement dress = presToShopHomePage.product("dress");


   }


}





















