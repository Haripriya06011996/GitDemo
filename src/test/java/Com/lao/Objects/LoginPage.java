package Com.lao.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

   /* @FindBy(id="ap_email")
    public static WebElement USERNAME;*/
    private static LoginPage LoginInstance;

    private LoginPage(){
    }

    public static LoginPage getInstance(){
        if (LoginInstance ==null){
          LoginInstance = new LoginPage();
        }
        return LoginInstance;
    }

    @FindBy(id="ap_email")
    private WebElement USERNAME;

    @FindBy(id="continue")
    private WebElement CONTINUE;

    @FindBy(id="ap_password")
    private WebElement PASSWORD;

    @FindBy(id="signInSubmit")
    private WebElement SING_IN;
/*
    public WebElement getUSERNAME() {
        return USERNAME;
    }

    public WebElement getCONTINUE() {
        return CONTINUE;
    }

    public WebElement getPASSWORD() {
        return PASSWORD;
    }

    public WebElement getSING_IN() {
        return SING_IN;
    }*/


  // public static WebElement LOGIN_BUTTON;

  public void EnterUsername(String Username){
      USERNAME.sendKeys(Username);
  }

  public void EnterPassword(String Password){
      PASSWORD.sendKeys(Password);
  }

    public void Click_continue_button(){
        CONTINUE.click();
    }

    public void Click_sign_button(){
        SING_IN.click();
    }



}
