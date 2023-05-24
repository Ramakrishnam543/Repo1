package com.qa.pages;

import org.openqa.selenium.By;

public class LoginPage {
    public By usernameloc = By.xpath("//input[@placeholder='Username' and @autocomplete='off']");
    public By passwordloc = By.xpath("//input[@name='password' and @autocomplete='off']");

    public By loginbtnloc = By.xpath("//button[@id='btn-login']");

    public By selecthngkongloc = By.xpath("//select[@id='combo_facility']");

    public By checkboxloc = By.xpath("(//input[@id='chk_hospotal_readmission'])[1]");

    public By checknoneloc = By.xpath("(//label[normalize-space()='None'])[1]");

    public By enterdateloc = By.xpath("//input[@id='txt_visit_date']");

    public By commentloc = By.xpath("//textarea[@id='txt_comment']");

    public By bookappointmrntloc =By.xpath("//button[@id='btn-book-appointment']");

    public By textonwebpageloc = By.tagName("h2");









}
