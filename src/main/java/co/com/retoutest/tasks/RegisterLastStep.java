package co.com.retoutest.tasks;

import co.com.retoutest.model.DataModel;
import co.com.retoutest.userinterface.RegisterLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterLastStep implements Task {
    private DataModel dataUser;

    public RegisterLastStep(DataModel dataUser) {
        this.dataUser = dataUser;
    }

    public static RegisterLastStep the(DataModel dataUser) {
        return Tasks.instrumented(RegisterLastStep.class, dataUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(dataUser.getPassword()).into(RegisterLastStepPage.PASSWORD),
            Enter.theValue(dataUser.getPassword()).into(RegisterLastStepPage.CONFIRM_PASSWORD),
            Click.on(RegisterLastStepPage.POLITICS_ONE),
            Click.on(RegisterLastStepPage.POLITICS_TWO),
            Click.on(RegisterLastStepPage.COMPLETE_SETUP)
        );

    }
}
