package Page;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class PageOne {
    WebDriver driver;


    @FindBy(name="q")
    WebElement search;

    @FindBy (name = "btnK")
    WebElement searchButton;

    @FindBy (css = "cite[role='text']:nth-child(1)")
    WebElement findAutoPage;

    @FindBy(id = "filter-make")
    WebElement findModel;

    @FindBy(id = "v-model")
    WebElement findModel2;

    @FindBy(name= "year[gt]")
    WebElement findYear;

    @FindBy(className= "lever")
    WebElement findRadioButton;

    @FindBy(id= "search-btn")
    WebElement findSearchButton2;


    public PageOne(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

public void findSearch (String typing) {
    search.sendKeys(typing);

}
public void clickSearchButton(){
        searchButton.click();
}
    public void clickAutoPage(){
        findAutoPage.click();
    }


    public void checkTitle (String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "The Title NOT match!!!!");
}

    public void selectFindModel(String itemToSelect) {
        Select select = new Select(findModel);
        select.selectByVisibleText(itemToSelect);
    }

    public void selectFindModel2 (String itemToSelect) {
        Select select = new Select(findModel2);
        select.selectByVisibleText(itemToSelect);
    }
    public void selectFindYear (String itemToSelect) {
        Select select = new Select(findYear);
        select.selectByVisibleText(itemToSelect);
    }
    public void clickRadioButton(){
        findRadioButton.click();
    }
    public void clickSearchButton2 (){
        findSearchButton2.click();
    }

    public void checkIfElementDisplayed (){
        Boolean a = driver.findElement(By.id("ad-2732552")).isDisplayed();
        System.out.println(a);
    }


    public void checkPrice (String expectedTitle) {
        String actualTitle = driver.findElement(By.xpath("//*[@id=\"ad-2732552\"]/div[3]/div/span")).getText();
        Assert.assertEquals(actualTitle, expectedTitle, "The Title NOT match!!!!");
    }


    public void checkName (String expectedTitle) {
        String actualTitle = driver.findElement(By.xpath("//*[@id=\"ad-2732552\"]/div[2]/a/div/span")).getText();
        Assert.assertEquals(actualTitle, expectedTitle, "The Title NOT match!!!!");
    }
}
