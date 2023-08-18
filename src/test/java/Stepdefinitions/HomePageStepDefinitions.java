package Stepdefinitions;

import Com.lao.Objects.HomePage;
import Com.lao.constants.Constants;
import Com.lao.utilities.commonUtils;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.Select;

public class HomePageStepDefinitions {

    private static final Logger LOGGER = LogManager.getLogger(HomePageStepDefinitions.class);


    @When("I click on all link {string}")
    public void iClickOnAllLink(String Product_search) {

        try {
            Select select_product_search = new Select(HomePage.getInstance().getProductSearch());
            select_product_search.selectByValue(Product_search);
            System.out.println("Selected the value");
            HomePage.getInstance().getSubmit().click();
        } catch (Exception e) {
             LOGGER.error(e);
            System.out.println(e.getMessage());
            commonUtils.getInstance().takeScreenshot();
        }
    }

    @When("I click on best sellers")
    public void i_click_on_best_sellers() {
        System.out.println("1");
    }


    @When("I verify the text hot new release")
    public void i_verify_the_text_hot_new_release() {
        System.out.println("2");
    }
    @When("close the browser")
    public void close_the_browser() {
        System.out.println("3");
    }


    @When("I search for product Beauty {string} using {string}")
    public void iSearchForProductBeautyUsing(String Dropdown_value, String select_type) {
        try{
        commonUtils.SelectDropdown_value(HomePage.getInstance().getProductSearch(),Dropdown_value,select_type);
        HomePage.getInstance().getSubmit().click();
    }catch (Exception e){
           e.printStackTrace();
           LOGGER.error(e);
        }
}

}
