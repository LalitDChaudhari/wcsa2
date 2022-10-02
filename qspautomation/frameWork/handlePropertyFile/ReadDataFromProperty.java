package handlePropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {
	
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty("browser");
		System.out.println(value);
		String value1 = prop.getProperty("url");
		System.out.println(value1);
		String value2 = prop.getProperty("username");
		System.out.println(value2);
		String value3 = prop.getProperty("password");
		System.out.println(value3);
	}
}