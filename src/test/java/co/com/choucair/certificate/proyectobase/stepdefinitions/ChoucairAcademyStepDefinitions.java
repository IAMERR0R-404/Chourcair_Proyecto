package co.com.choucair.certificate.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.task.Login;
import co.com.choucair.certification.proyectobase.task.Search;
import com.sun.org.apache.xpath.internal.operations.String;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.OpenUp;

public class ChoucairAcademyStepDefinitions {
    private String course;

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Brandon want to learn automation at the academy Choucair$")
    public void than_Brandon_want_to_learn_automation_at_the_academy_Choucair() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thepage(), Login.onThePage());
    }


    @When("^he search for the course (.*) on the choucair academy plataform$")
    public void he_search_for_the_course_Recursos_Automatizacion_Bacolombia_on_the_choucair_academy_plataform() {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^finds the course called resouces (.*)$")
    public void finds_the_course_called_resouces_Recursos_Automatizacion_Bancolombia(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }


}
