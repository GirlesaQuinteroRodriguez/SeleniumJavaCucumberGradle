package pages;

public class PaginaPrincipal extends BasePage{
    
    public PaginaPrincipal(){
        super(driver);
    }


//Navegar a página web

public void navigateToFreeRangeTesters(){
    navigateTo("https://freerangetester.com");
}

}
