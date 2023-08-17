package Stepdefinitions;

import Com.lao.Webdriver_Manager.DriverManager;
import Com.lao.constants.Constants;
import Com.lao.utilities.commonUtils;
import io.cucumber.java.Before;
//import org.apache.commons.logging.Log;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common_Step_Definitions {

    //launch_browser()



    private static String ScenarioName = null;


    public static String getScenarioname() {
        return ScenarioName;
    }
    private static final Logger LOGGER = LogManager.getLogger(Common_Step_Definitions.class);


    @Before
    public void BeforeScenario(Scenario Scenario){
        LOGGER.info("Execution started");

        try{

            ScenarioName= Scenario.getName();
            LOGGER.info("Instantiating the commonutils");
           // commonUtils commonUtils = new commonUtils();
            LOGGER.info("Loading the property file");
            commonUtils.getInstance().loadProperties();
            LOGGER.info("Checking the driver is null or not");
            if(DriverManager.getDriver()==null){
                LOGGER.info("Driver is null. instatiating it");
                DriverManager.launchbrowser();
               // commonUtils.initWebElement();
                commonUtils.getInstance().initWebElement();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

  /*  public void launchbrowser() {

        try {
            switch (Constants.BROWSER) {
                case "chrome" -> {
                    System.setProperty(Constants.CHROME_DRIVER, Constants.CHROME_DRIVER_LOCATION);
                    LOGGER.info("Launching"+ Constants.BROWSER);
                    driver = new ChromeDriver();
                }
                case "ie" ->{
                    System.setProperty("webdriver.ie.driver", "C:\\Users\\HARIPRIYA\\IdeaProjects\\chromedriver.exe");
                    driver = new FirefoxDriver();
                }
            }
        }catch(Exception e){
              e.printStackTrace();
        }
    }*/

}
