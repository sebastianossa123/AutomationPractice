package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class HomePage extends PageObject {

    public static final Target INPUT_BUSCAR_OBJETO = Target.the("Input donde realizo la busqueda").located(By.id("search_query_top"));
    public static final Target INPUT_OBJETO_ENCONTRADO = Target.the("Input donde realizo la busqueda").locatedBy("//img[starts-with(@alt,'{0}')]");
    public static final Target INPUT_AGREGAR_CARRO = Target.the("Input donde realizo la busqueda").located(By.className("exclusive"));
}
