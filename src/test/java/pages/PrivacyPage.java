package pages;

import org.openqa.selenium.By;
import utilities.MobileActions;

public class PrivacyPage {

    By gotItButton = By.xpath("//android.widget.TextView[@text=\"GOT IT\"]");

    public void clickGotItButton(){
        MobileActions.click(gotItButton);
    }
}
