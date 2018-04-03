package diana.foxminded;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesFile {
    private Properties prop;

    public PropertiesFile() {

        prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream("resources/config.properties");

            // load a properties file
            prop.load(input);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public void printProperties() {
        Enumeration<?> e = prop.propertyNames();
        while (e.hasMoreElements()) {
            String key = (String) e.nextElement();
            String value = prop.getProperty(key);
            System.out.println("Key : " + key + ", Value : " + value);
        }
    }

    public String getValue(String key) {
        return prop.getProperty(key);
    }

    public static void main(String[] args) {
        PropertiesFile p = new PropertiesFile();
        p.printProperties();
    }
}
