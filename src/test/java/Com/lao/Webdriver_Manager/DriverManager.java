package Com.lao.Webdriver_Manager;

import Com.lao.constants.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import static Stepdefinitions.Common_Step_Definitions.LOGGER;

public class DriverManager {

    private static WebDriver driver =null;
    private static final Logger LOGGER= LogManager.getLogger(DriverManager.class);
    public static void launchbrowser() {

        try {
            switch (Constants.BROWSER) {
                case "chrome" -> {
                    WebDriverManager.chromedriver().setup();
                    LOGGER.info("Launching"+ Constants.BROWSER);
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                }
                case "ie" ->{
                    WebDriverManager.iedriver().setup();
                    driver = new FirefoxDriver();
                }
                case "edge" ->{
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
