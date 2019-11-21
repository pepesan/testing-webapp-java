package com.cursosdedesarrollo.app;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class StepWikipedias {
    private WebDriver driver;
    private WebDriverWait wait;

    @Given("^Abro la web principal de la wikipedia$")
    public void entro_a_la_web_principal_de_wikipedia_ingles() throws Throwable {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        driver.get("https://en.wikipedia.org/wiki/Main_Page");

    }
    @When("^Relleno el formulario de busqueda con \"([^\"]*)\"$")
    public void relleno_formulario_busqueda_con_parametro(String searchString) throws Throwable {
        By searchInput = By.id("searchInput");
        wait.until(presenceOfElementLocated(searchInput));
        driver.findElement(searchInput).sendKeys(searchString);
    }
    @And("^Pulso el botón de buscar$")
    public void pulsar_boton_buscar() throws Throwable {
        By searchButton = By.id("searchButton");
        wait.until(elementToBeClickable(searchButton));
        driver.findElement(searchButton).click();

    }


    @Then("^Encuentro el texto \"([^\"]*)\"$")
    public void buscar_texto_con_parametro(String textoABuscar) {
        wait.until(textToBePresentInElementLocated(By.tagName("body"),
                textoABuscar));
    }

}
