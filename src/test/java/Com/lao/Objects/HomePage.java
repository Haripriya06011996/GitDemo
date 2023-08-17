package Com.lao.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

private static HomePage Homepage_Instance;

private HomePage(){

}
public static HomePage getInstance(){
    if (Homepage_Instance==null){
        Homepage_Instance = new HomePage();
    }
    return Homepage_Instance;
}


@FindBy(id="nav-hamburger-menu")
private WebElement All_link;


@FindBy(xpath = "//select[@id='searchDropdownBox']")
private WebElement ProductSearch;

    public WebElement getSubmit() {
        return Submit;
    }

    @FindBy(id="nav-search-submit-button")
    private WebElement Submit;


    public WebElement getAll_link() {
        return All_link;
    }

    public WebElement getProductSearch() {
        return ProductSearch;
    }


}
