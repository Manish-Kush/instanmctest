package sd.infra;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import sd.base.CommonActions;
import sd.base.ConfigReader;

/*
 * setUP
 * Screen shot
 * close driver(tear down)
 */
public class HisTestContext {
	private ConfigReader readConfig = new ConfigReader();
	private String baseURL = readConfig.getApplicationURL();
	private WebDriver driver;
	private Logger logger;
	private CommonActions commonActions;

	public String getBaseURL() {
		return baseURL;
	}

	public void setBaseURL(String baseURL) {
		this.baseURL = baseURL;
	}

	public CommonActions getCommonActions() {
		return commonActions;
	}

	@BeforeMethod
	public void setUp(String browser) // all the prerequsite include in this.( br = bowser)
	{
		// configuration we have to do for the base class
		logger = Logger.getLogger("Instanmc.Automation"); // name of the project
		PropertyConfigurator.configure("./configuration/log4j.properties");
		// Initialize Chrome browser
		if (browser.equalsIgnoreCase("chrome")) {
//            // Create Object of ChromeOption Class
//            ChromeOptions option=new ChromeOptions();
//
//            //add the –headless argument in option class which will run test in Headless mode
//            option.addArguments(“–headless”);
//
//            // pass the option object in ChromeDriver constructor
//            WebDriver driver=new ChromeDriver(option);

			System.setProperty("webdriver.chrome.driver", "src/test/lib/chromedriver");
			driver = new ChromeDriver(); // Instantiation(i.e create chrome driver object)
		}
		// Initialize FireFox browser
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/test/lib/geckodriver");

			// HeadLess Mode
			FirefoxOptions option = new FirefoxOptions();
			option.setHeadless(false); // Set the setHeadless is equal to true which will run test in Headless mode
			driver = new FirefoxDriver(option); // Instantiation(i.e create firefox driver object)
		} else if (browser.equalsIgnoreCase("phantomjs")) {
			System.setProperty("phantomjs.binary.path", readConfig.getPhantomjsPath());
			driver = new PhantomJSDriver(); // Instantiation(i.e create firefox driver object)
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", readConfig.getIEPath());
			driver = new InternetExplorerDriver();
		}

		driver.get(baseURL);
		logger.info("URL is opened where page title is : " + driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		commonActions = new CommonActions(driver);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public Logger getLogger() {
		return logger;
	}

}