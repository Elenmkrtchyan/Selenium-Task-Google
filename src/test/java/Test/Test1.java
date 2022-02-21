package Test;

import Base.SeleniumBase;
import Page.PageOne;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test1 extends SeleniumBase {
        PageOne pageOne;
       @Test(priority = 1)
        public void check () {
            pageOne = new PageOne(driver);
            pageOne.findSearch("auto.am");
            pageOne.clickSearchButton();
            pageOne.clickAutoPage();
            pageOne.checkTitle("Ավտոմեքենաների վաճառք Հայաստանում - Auto.am");
            pageOne.selectFindModel("Tesla");
            pageOne.selectFindModel2("Model Y");
            pageOne.selectFindYear("2018");
            pageOne.clickRadioButton();
            pageOne.clickSearchButton2();
            pageOne.checkIfElementDisplayed();
            pageOne.checkPrice("$ 67 000");
            pageOne.checkName("2021  Tesla Model Y");



        }
    }

