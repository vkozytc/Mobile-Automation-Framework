package utils;

//import org.apache.log4j.Logger;

import org.apache.logging.log4j.core.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FileUtils {

//    private static final Logger log = Logger.getLogger(FileUtils.class);

    public static Properties readPropertiesFile(String fileName){
        FileInputStream fis;
        Properties property = new Properties();
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            File file = new File(classLoader.getResource(fileName).getFile());
            fis = new FileInputStream(file);
            property.load(fis);
        } catch (Exception e) {
            System.out.println(fileName + "not found");
//            log.error(fileName + " not found");
        }
        return property;
    }

}
