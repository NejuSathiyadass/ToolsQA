package Utilities;

import PageObjects.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;

public class CommonUtils {

    private static final Logger LOGGER = LogManager.getLogger(CommonUtils.class);

    private static CommonUtils utiles = null;

    private CommonUtils() {
    }

    public static CommonUtils getInstance() {
        if (utiles == null) {
            utiles = new CommonUtils();
        }
        return utiles;
    }

    public void loadProperties() {
        Properties properties = new Properties();
        try {
            properties.load(getClass().getResourceAsStream("/config.properties"));
        } catch (Exception e) {
            LOGGER.error(e);
        }

        ConstantsUtils.BROWSER = properties.getProperty("Browser");
        ConstantsUtils.APP_URL = properties.getProperty("Application_URL");
        ConstantsUtils.CHROME_DRIVER_PATH = properties.getProperty("Chrome_Driver_Path");
        ConstantsUtils.IE_DRIVER_PATH = properties.getProperty("Ie_Driver_Path");
        ConstantsUtils.EDGE_DRIVER_PATH = properties.getProperty("Edge_Driver_Path");
        ConstantsUtils.FIREFOX_DRIVER_PATH = properties.getProperty("Firefox_Driver_Path");
        ConstantsUtils.EXCEL_DATA_PATH = properties.getProperty("Excel_Data_Path");
    }

    public void initWebElements() {
        PageFactory.initElements(ReusableMethods.getDriver(), HomePage.getInstance());
        PageFactory.initElements(ReusableMethods.getDriver(), AlertsFrameWindowsPage.getInstance());
        PageFactory.initElements(ReusableMethods.getDriver(), ElementsPage.getInstance());
        PageFactory.initElements(ReusableMethods.getDriver(), InteractionsPage.getInstance());
        PageFactory.initElements(ReusableMethods.getDriver(), WidgetsPage.getInstance());
    }

}
