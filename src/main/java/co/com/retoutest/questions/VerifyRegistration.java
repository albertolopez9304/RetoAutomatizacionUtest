package co.com.retoutest.questions;

import co.com.retoutest.userinterface.RegisterLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class VerifyRegistration implements Question<Boolean> {
    public VerifyRegistration(String expectedMessage) {
        this.expectedMessage = expectedMessage;
    }

    private String expectedMessage;
    public static VerifyRegistration WithThe(String expectedMessage) {
           return new VerifyRegistration(expectedMessage);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String message = Text.of(RegisterLastStepPage.MESSAGE_ON_SCREEN).viewedBy(actor).asString();
        if (message.equals(expectedMessage)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
