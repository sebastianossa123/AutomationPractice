package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProducto implements Task {

    String descripcion;


    public AgregarProducto(String descripcion){
        this.descripcion = descripcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Click.on(INPUT_AGREGAR_CARRO)
       );
    }


    public static AgregarProducto agregarAlCarro(String descripcion) {
        return instrumented(AgregarProducto.class, descripcion);
    }

}
