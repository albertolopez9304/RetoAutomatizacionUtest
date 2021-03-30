package co.com.retoutest.tasks;

import co.com.retoutest.model.DataModel;
import co.com.retoutest.userinterface.JoinTodayPage;
import co.com.retoutest.userinterface.PersonalDataUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task {
    private DataModel dataUser;
    public Register(DataModel dataUser) {
        this.dataUser = dataUser;
    }
    public static Register onThePage(DataModel dataUser) {
        return Tasks.instrumented(Register.class, dataUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(JoinTodayPage.JOIN_TODAY),
                Enter.theValue(dataUser.getFirstName()).into(PersonalDataUserPage.FIRST_NAME),
                Enter.theValue(dataUser.getLastName()).into(PersonalDataUserPage.LAST_NAME),
                Enter.theValue(dataUser.getEmail()).into(PersonalDataUserPage.EMAIL),
                SelectFromOptions.byVisibleText(dataUser.getBirthMonth()).from(PersonalDataUserPage.MONTH),
                SelectFromOptions.byVisibleText(dataUser.getBirthDay()).from(PersonalDataUserPage.BIRTHDAY),
                SelectFromOptions.byVisibleText(dataUser.getBirthYear()).from(PersonalDataUserPage.BIRTH_YEAR),
                Click.on(PersonalDataUserPage.NEXT_LOCATION)
        );

    }
}
