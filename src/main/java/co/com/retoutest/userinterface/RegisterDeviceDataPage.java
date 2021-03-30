package co.com.retoutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterDeviceDataPage {
    public static final Target DEPLOYMENT_OPERATIVE = Target.the("Deploy the Operating System").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/i"));
    public static final Target SELECT_OPERATIVE = Target.the("Select the System Operative").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target DEPLOYMENT_VERSION = Target.the("Deploy Version Operating System").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/i"));
    public static final Target SELECT_VERSION = Target.the("Select Version Operating System").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target DEPLOYMENT_LANGUAGE = Target.the("Deploy Language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/i"));
    public static final Target SELECT_LANGUAGE = Target.the("Select Language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target NEXT_LAST_STEP = Target.the("Next Last Step").located(By.xpath("//a[@class = \"btn btn-blue pull-right\"]"));
}
