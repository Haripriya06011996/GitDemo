package Stepdefinitions;

import Com.lao.Objects.LoginPage;
import Com.lao.Webdriver_Manager.DriverManager;
import Com.lao.constants.Constants;
import Com.lao.utilities.commonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginPage_StepDefinitions {
    //launch browser
    //

   //  WebDriver driver = WebDriverManager.chromedriver().create();
   private static final Logger LOGGER = LogManager.getLogger(LoginPage_StepDefinitions.class);

    @Given("I have landed to the amazon home page")
    public void i_have_landed_to_the_amazon_home_page() {

      try {
          //LoginPage loginpage = new LoginPage();
          DriverManager.getDriver().get(Constants.APP_URL);
          //getter // loginpage.getUSERNAME().sendKeys(Constants.USERNAME);
          //signleton // LoginPage.getInstance().getUSERNAME().sendKeys(Constants.USERNAME);
          LoginPage.getInstance().EnterUsername(Constants.USERNAME);
          LoginPage.getInstance().Click_continue_button();
          LoginPage.getInstance().EnterPassword(Constants.PASSWORD);
          LoginPage.getInstance().Click_sign_button();
      }catch (Exception e){
          LOGGER.error(e);
          commonUtils.getInstance().takeScreenshot();
          // works for static methods if its private and used getter method then use above code
      }
        //LoginPage.SING_IN.click();

        String CurrentURL= DriverManager.getDriver().getCurrentUrl();

        if(CurrentURL.contains("signin")){
            LOGGER.info("Signed in successfully");
        }
        System.out.println("Signed in successfully");
    }



}
