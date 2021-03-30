package co.com.retoutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinTodayPage {
    public static final Target JOIN_TODAY = Target.the("Button to start registration").
            located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
