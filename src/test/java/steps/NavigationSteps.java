package steps;

import java.util.Arrays;
import java.util.List;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import io.cucumber.java.en.*;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.PaginaPrincipal;
import pages.PaginaRegistro;

public class NavigationSteps {

    PaginaPrincipal landingPaginaPrincipal = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosTesting fundamentosPage = new PaginaFundamentosTesting();
    PaginaRegistro registro = new PaginaRegistro();
    SoftAssert soft = new SoftAssert();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPaginaPrincipal.navigateToFreeRangeTesters();
    }
 
    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section) {
        landingPaginaPrincipal.clickOnSectionNavigationBar(section);
    }

    @And("^(?:I|The user|The client) selects? Introducción al Testing$")
    public void navigateToIntro() {
        cursosPage.clickFundamentosTestingLink();
        fundamentosPage.clickFundamentosTestingLink();;
 
    }

    @When("^(?:I|The user|The client) selects? Elegir Plan$")
    public void selectElegirPlan() {
        landingPaginaPrincipal.clickOnElegirPlanButton();
    }

 
    @Then("^(?:I|The user|The client) can validate the options in the checkout page?")
    public void validateCheckoutPlans() {
        List<String> lista = registro.returnPlanDropdownValues();
        List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes • 13 productos",
                "Academia: $176 / año • 13 productos", "Free: Gratis • 3 productos");
 
        Assert.assertEquals(listaEsperada, lista);
    }

    
}