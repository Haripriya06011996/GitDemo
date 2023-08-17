package Com.lao.utilities;

import Com.lao.Objects.HomePage;
import Com.lao.Objects.LoginPage;
import Com.lao.Webdriver_Manager.DriverManager;
import Com.lao.constants.Constants;
import Stepdefinitions.Common_Step_Definitions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class commonUtils {


    private static commonUtils commonUtils_getInstance ;

    private commonUtils(){

    }

    public static commonUtils getInstance(){
        if (commonUtils_getInstance== null){
            commonUtils_getInstance = new commonUtils();
        }
        return commonUtils_getInstance;
    }

    public void loadProperties() {
       /* FileReader reader = null;
        try {
            reader = new FileReader("Config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Properties properties = new Properties();
        try {
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        Properties properties = new Properties();

        try{
            properties.load(getClass().getResourceAsStream("/Config.properties"));
        }catch (Exception e){
            e.printStackTrace();
        }


        Constants.APP_URL=properties.getProperty("APP_URL");
        Constants.BROWSER=properties.getProperty("BROWSER");
        Constants.CHROME_DRIVER_LOCATION= properties.getProperty("CHROME_DRIVER_LOCATION");
        Constants.USERNAME = properties.getProperty("USERNAME");
        Constants.PASSWORD =properties.getProperty("PASSWORD");


    }

    public  void initWebElement() {

        PageFactory.initElements(DriverManager.getDriver(), LoginPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), HomePage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), commonUtils.getInstance());
    }

    public void takeScreenshot(){

        try{
            //Convert web driver object to TakeScreenshot

            TakesScreenshot scrShot =((TakesScreenshot)DriverManager.getDriver());
            //Call getScreenshotAs method to create image file
            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
            //Move image file to new destination
            File DestFile=new File(Common_Step_Definitions.getScenarioname() +".png");

            FileUtils.copyFile(SrcFile, DestFile);

        }catch (IOException e){
             System.out.println(e.getMessage());
        }

    }


    public static void SelectDropdown_value(WebElement ele, String Dropdown_value, String select_type){

        switch(select_type){
        case "text" ->{
            Select select = new Select(ele);
            select.selectByValue(Dropdown_value);
        }
        case "visible_text"->{
            Select select = new Select(ele);
            select.selectByVisibleText(Dropdown_value);

        }
        default -> {
            Select select = new Select(ele);
            select.selectByIndex(Integer.parseInt(Dropdown_value));
        }

        }
    }
}
