package co.com.retoutest.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataAddressPage {
    public static final Target INPUT_CITY = Target.the("Enter City").located(By.id("city"));
    public static final Target INPUT_CODEPOSTAL = Target.the("Enter Code Postal").located(By.id("zip"));
    public static final Target ENTER_COUNTRY = Target.the("Select Country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target SELECT_COUNTRY = Target.the("Select Country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/i"));
    public static final Target SELECT_NEXT_DEVICE = Target.the("Select Next Device").located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}