package mytest;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test(priority = 1)
    public void loginTest() {
        driver.findElement(By.id("input-email")).sendKeys("raghuveermh30@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys(" R@ghumh3017");
        driver.findElement(By.xpath("//input[@type= 'submit']")).click();
        Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
    }

    @Test(priority = 2)
    public void homePageTitleTest() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "My Account");
    }

    @Test(priority = 3)
    public void searchIconDisplayed() {
        Assert.assertTrue(driver.findElement(By.xpath("//input[@name='search']")).isDisplayed());
    }
}
