package mytest;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void loginPageTitleTest() {
        Assert.assertEquals(driver.getTitle(), "Account Login");
    }

    @Test
    public void loginPageLogoTest() {
        Assert.assertTrue(driver.findElement(By.xpath("//img[@title= 'naveenopencart']")).isDisplayed());
    }

}
