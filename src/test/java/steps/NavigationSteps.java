package steps;

import io.cucumber.java.en.Given;
import pages.PaginaPrincipal;

public class NavigationSteps {

    PaginaPrincipal landingPaginaPrincipal = new PaginaPrincipal();
    
    @Given("I navigate to www.freerangetesters.com ")
    public void iNavigateToURL(){

        landingPaginaPrincipal.navigateToFreeRangeTesters();

    }
    
}