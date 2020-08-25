package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.INPUT_BUSCAR_OBJETO;
import static userinterfaces.HomePage.INPUT_OBJETO_ENCONTRADO;

// en esta clase task en donde se hacen las acciones
public class BuscarProducto implements Task {

    private String descripcion;
    public BuscarProducto(String descripcion){
        this.descripcion = descripcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Hit.the(Keys.ENTER).into(INPUT_BUSCAR_OBJETO), //Presionar tecla Enter para lanzar busqueda
                Click.on(INPUT_OBJETO_ENCONTRADO.of(descripcion))
        );


    }

    public static BuscarProducto conDescipcion(String descripcion) {
        return instrumented(BuscarProducto.class, descripcion); //este metodo nos ayuda a instacion el objeto de la clase
    }
}
