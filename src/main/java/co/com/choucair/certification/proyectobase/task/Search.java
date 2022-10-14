package co.com.choucair.certification.proyectobase.task;

import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import com.sun.org.apache.xpath.internal.operations.String;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {
    private final String course;

    public Search(String course) {
        this.course = course;
    }
        public static Search the(String course){
            return Tasks.instrumented(Search.class,course);
        }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_CC),
            Enter.theValue((CharSequence) course).into(SearchCoursePage.INPUT_COURSE),
            Click.on(SearchCoursePage.BUTTON_GO),
            Click.on(SearchCoursePage.SELECT_COURSE)
        );
    }
}
