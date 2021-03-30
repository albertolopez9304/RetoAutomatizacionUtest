package co.com.retoutest.tasks;

import co.com.retoutest.model.DataModel;
import co.com.retoutest.userinterface.DataAddressPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;


public class AddAddress implements Task {
    private DataModel dataUser;

    public AddAddress(DataModel dataUser) {
        this.dataUser = dataUser;
    }

    public static AddAddress with(DataModel dataUser) {
        return Tasks.instrumented(AddAddress.class, dataUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("").into(DataAddressPage.INPUT_CITY),
                Enter.theValue(dataUser.getCity()).into(DataAddressPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(DataAddressPage.INPUT_CITY),
                Hit.the(Keys.ENTER).into(DataAddressPage.INPUT_CITY),
                Enter.theValue(dataUser.getCodePostal()).into(DataAddressPage.INPUT_CODEPOSTAL),
                Click.on(DataAddressPage.SELECT_COUNTRY),
                Type.theValue(dataUser.getCountry()).into(DataAddressPage.ENTER_COUNTRY).thenHit(Keys.ENTER),
                Click.on(DataAddressPage.SELECT_NEXT_DEVICE)

        );

    }
}
