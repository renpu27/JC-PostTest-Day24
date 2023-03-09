package juaracoding.pages;

import juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TextBoxPage {
    private WebDriver driver;

    public TextBoxPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='element-list collapse show']//li")
    List<WebElement> listMenu;

    public void printMenuAndClick() {
        for (WebElement menu : listMenu) {
            System.out.println(menu.getText());
        }
        for (int i = 0; i <listMenu.size(); i++) {
            listMenu.get(i).click();
        }
        System.out.println("All menu clicked");

//        Select gender = new Select();
//        for (int i = 0; i < 5; i++) {
//            gender.selectByIndex(i);
//        }
    }
}