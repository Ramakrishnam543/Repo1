package com.qa.stepdefenition;

import com.qa.common.base;
import com.qa.pages.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class LoginStepDef extends base {
    LoginPage lp = new LoginPage();



    @Given("user is on login page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(op);
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
//    @When("enter user name asJohn Doe and password as ThisIsNotAPassword {string}  {string}")
//    public void enter_user_name_as_john_doe_and_password_as_this_is_not_a_password(String username, String password) {
//
//        driver.findElement(lp.usernameloc).sendKeys(username);
//        driver.findElement(lp.passwordloc).sendKeys(password);
//        driver.findElement(lp.loginbtnloc).click();
//    }
@When("enter user name asJohn Doe and password as ThisIsNotAPassword {string}  {string}")
public void enter_user_name_as_john_doe_and_password_as_this_is_not_a_password(String username, String password) {
    driver.findElement(lp.usernameloc).sendKeys(username);
        driver.findElement(lp.passwordloc).sendKeys(password);
        driver.findElement(lp.loginbtnloc).click();
}

    @And("select the Hong kong center")
    public void select_the_hong_kong_center() {
       //driver.findElement(lp.selecthngkongloc).click();
        Select s = new Select(driver.findElement(lp.selecthngkongloc));
        s.selectByIndex(1);

        //driver.findElement(By.id("combo_facility")).click();
        //driver.findElement(By.xpath("//option[@value='Hongkong CURA Healthcare Center']")).click();
        //s.selectByVisibleText("Hongkong CURA Healthcare Center");

    }
    @And("Apply for readmission option and select none of health care product")
    public void apply_for_readmission_option_and_select_none_of_health_care_product() {
        driver.findElement(lp.checkboxloc).click();
        driver.findElement(lp.checknoneloc).click();

    }
    @Then("enter date and mention comment")
    public void enter_date_and_mention_comment() {
        driver.findElement(lp.enterdateloc).sendKeys("20/04/2023");
        driver.findElement(lp.commentloc).sendKeys("Please book an appointment ");


    }
//    @And("Click on book appointment")
//    public void click_on_book_appointment() {
//        driver.findElement(lp.bookappointmrntloc).click();
//
//    }
    @And("Click on book appointment")
    public void click_on_book_appointment() {
        driver.findElement(lp.bookappointmrntloc).click();


    }
    @Then("validate text on a webpage")
    public void validate_text_on_a_webpage() {
        String actualText = driver.findElement(lp.textonwebpageloc).getText();
        String expectedText = "Appointment Confirmation";
        Assert.assertEquals(actualText, expectedText);
        System.out.println("Text on the webpage: " + actualText);


    }



}
