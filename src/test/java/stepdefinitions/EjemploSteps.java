package stepdefinitions;

import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import task.AgregarProducto;
import task.BuscarProducto;
import userinterfaces.HomePage;

import java.sql.Time;
import java.util.concurrent.TimeUnit;


public class EjemploSteps {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor= Actor.named("Sebastian");
    private HomePage homePage=new HomePage();



    @Given("^that a new customer accesses the purchasing website$")
    public void thatANewCustomerAccessesThePurchasingWebsite() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
        navegador.manage().window().maximize();
        JavascriptExecutor Scrool = ((JavascriptExecutor)navegador);
        Scrool.executeScript("scroll(0, 400)");

    }

    @When("^he adds a unir of (.*) to the cart$")
    public void heAddsAUnirOfFadedShortSleeveTShirtsToTheCart(String descripcion) {
         actor.wasAbleTo(
                 BuscarProducto.conDescipcion(descripcion),
                 AgregarProducto.agregarAlCarro(descripcion)
         );


    }

    @Then("^he sees the products listed in the shopping cart$")
    public void heSeesTheProductsListedInTheShoppingCart() {

    }
}
