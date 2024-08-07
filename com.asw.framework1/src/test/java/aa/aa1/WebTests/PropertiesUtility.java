package aa.aa1.WebTests;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
    private static Properties properties;

    static {
        try {FileInputStream fis = new FileInputStream("U:\\\\Automation\\\\Selenium\\\\seleniumadvanced\\\\aa.aa2\\\\src\\\\test\\\\resources\\\\config.properties"); 
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static void  setProperty(String key,String value) {
         properties.setProperty(key, value)  ;  }
}

