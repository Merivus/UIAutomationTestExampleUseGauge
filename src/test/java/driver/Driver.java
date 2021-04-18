package driver;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import videoRecorder.Recorder;

public class Driver {

    // Holds the WebDriver instance
    public static WebDriver webDriver;

    // Initialize a webDriver instance of required browser
    // Since this does not have a significance in the application's business domain, the BeforeSuite hook is used to instantiate the webDriver
    @BeforeSuite
    public void initializeDriver() throws Exception{
        Recorder.startRecord("UITestAutomationRecorder");
        webDriver = DriverFactory.getDriver();
        webDriver.manage().window().maximize();
    }

    // Close the webDriver instance
    @AfterSuite
    public void closeDriver() throws Exception{
        Recorder.stopRecord();
        webDriver.quit();
    }

}
