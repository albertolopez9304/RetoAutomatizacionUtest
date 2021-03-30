package co.com.retoutest.stepdefinitions;

import co.com.retoutest.model.DataModel;
import co.com.retoutest.questions.VerifyRegistration;
import co.com.retoutest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RetoUtestStepDefinitions {

    @Before
    public void setStage () {
       OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Luis wants to register on the utest page$")
    public void thatLuisWantsToRegisterOnTheUtestPage() {
     OnStage.theActorCalled("Luis").wasAbleTo(OpenUp.thepage());

    }

    @When("^he filled out the form on the page$")
    public void heFilledOutTheFormOnThePage(List<DataModel> dataUser){
      OnStage.theActorInTheSpotlight().attemptsTo(Register.onThePage(dataUser.get(0)),
              AddAddress.with(dataUser.get(0)), RegisterDeviceData.withThe(dataUser.get(0)),
              RegisterLastStep.the(dataUser.get(0))
      );

    }

    @Then("^he verifies (.*)$")
    public void heVerificationTheSuccessfulRegistration(String expectedMessage) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyRegistration.WithThe(expectedMessage)));


    }
}
