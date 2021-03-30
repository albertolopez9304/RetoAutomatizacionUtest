package co.com.retoutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalDataUserPage {
    public static final Target FIRST_NAME = Target.the("Enter First Name").
            located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Enter Last Name").
            located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Enter Email User").
            located(By.id("email"));
    public static final Target MONTH = Target.the("Select Month Of Birth").
            located(By.id("birthMonth"));
    public static final Target BIRTHDAY = Target.the("Select Birthday").
            located(By.id("birthDay"));
    public static final Target BIRTH_YEAR = Target.the("Select Birth Year").
            located(By.id("birthYear"));
    public static final Target NEXT_LOCATION = Target.the("Click Button Next Location").
            located(By.xpath("//a[@class='btn btn-blue']"));
}
