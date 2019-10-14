package xyz.songhg.tortoise.image.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @Description:
 * @Auther: songhaigang
 * Created in 2019/10/13 23:06
 */
@Slf4j
public class PropertiesUtil {

    private static HashMap<String, String> propertiesMap = new HashMap();

    private static void processProperties(Properties properties) {
        properties.keySet()
                .stream()
                .forEach(key ->
                    {
                        String keyStr = key.toString();
                        try {

                            String value = new String(properties.getProperty(keyStr)
                                    .getBytes("ISO-8859-1"), "utf-8");
                            propertiesMap.put(keyStr, value);
                        } catch (UnsupportedEncodingException e) {
                            log.error("processProperties error. error is {}", e);
                        }

                    });
    }

    public static void loadAllProperties (String fileName) {
        try {
            Properties properties = PropertiesLoaderUtils.loadAllProperties(fileName);
            processProperties(properties);
        } catch (IOException e) {
            log.error("load porperties failed. filename is {}. error is {}", fileName, e);
        }
    }

    public static String getProperty(String name) {
        return propertiesMap.get(name).toString();
    }

    public static Map<String, String> getAllProperties() {
        return propertiesMap;
    }
}
