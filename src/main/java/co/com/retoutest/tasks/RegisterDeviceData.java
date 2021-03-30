package co.com.retoutest.tasks;

import co.com.retoutest.model.DataModel;
import co.com.retoutest.userinterface.RegisterDeviceDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.actions.type.TypeValue;
import org.openqa.selenium.Keys;

public class RegisterDeviceData implements Task {
    public RegisterDeviceData(DataModel dataUser) {
        this.dataUser = dataUser;
    }

    private DataModel dataUser;
    public static RegisterDeviceData withThe(DataModel dataUser) {
        return Tasks.instrumented(RegisterDeviceData.class, dataUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterDeviceDataPage.DEPLOYMENT_OPERATIVE),
                Type.theValue(dataUser.getSystemOperative()).into(RegisterDeviceDataPage.SELECT_OPERATIVE).thenHit(Keys.ENTER),
                Click.on(RegisterDeviceDataPage.DEPLOYMENT_VERSION),
                Type.theValue(dataUser.getVersion()).into(RegisterDeviceDataPage.SELECT_VERSION).thenHit(Keys.ENTER),
                Click.on(RegisterDeviceDataPage.DEPLOYMENT_LANGUAGE),
                Type.theValue(dataUser.getLanguage()).into(RegisterDeviceDataPage.SELECT_LANGUAGE).thenHit(Keys.ENTER),
                Click.on(RegisterDeviceDataPage.NEXT_LAST_STEP)
        );

    }
}
