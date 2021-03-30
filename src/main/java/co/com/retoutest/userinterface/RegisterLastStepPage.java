package co.com.retoutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterLastStepPage {
    public static final Target PASSWORD = Target.the("Enter Password").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Enter Confirm Password").located(By.id("confirmPassword"));
    public static final Target POLITICS_ONE = Target.the("Confirm Politics One").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target POLITICS_TWO = Target.the("Confirm Politics Two").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_SETUP = Target.the("Complete Setup").located(By.id("laddaBtn"));
    public static final Target MESSAGE_ON_SCREEN = Target.the("Complete Setup").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
