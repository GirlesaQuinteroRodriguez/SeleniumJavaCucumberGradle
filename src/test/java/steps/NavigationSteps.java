package steps;

import io.cucumber.java.en.Given;
import pages.PaginaPrincipal;

public class NavigationSteps {

    PaginaPrincipal landingPaginaPrincipal = new PaginaPrincipal();

    @Given("I navigate to www.freerangetesters.com")
    public void i_navigate_to_www_freerangetesters_com() {

        landingPaginaPrincipal.navigateToFreeRangeTesters();
  
    }

    @Given("login to page")
    public void login_to_page() {
    // Write code here that turns the phrase above into concrete actions
    landingPaginaPrincipal.navigateToFreeRangeTesters();
    throw new io.cucumber.java.PendingException();
}

}