package co.com.choucair.certification.proyectobase.task;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Login implements Task {
    public static Performable onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginInterface.LOGIN_BUTTON),
                Enter.theValue("Ingresar Usuario").into(ChoucairLoginInterface.INPUT_USER),
                Enter.theValue("Ingresa tu Contraseña").into(ChoucairLoginInterface.INPUT_PASSWORD),
                Click.on(ChoucairLoginInterface.ENTER_BUTTON)
        );
    }

}
