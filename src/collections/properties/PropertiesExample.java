package collections.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {

		Properties testProperties = new Properties();
		
		String currentDirPath = System.getProperty("user.dir");
		File testFile = new File(currentDirPath+"\\TestDataFiles\\TestData.properties");
		
		FileInputStream testFileIs = new FileInputStream(testFile);
		testProperties.load(testFileIs);

		System.out.println(testProperties.getProperty("name"));
		System.out.println(testProperties.getProperty("id"));
		System.out.println(testProperties.getProperty("qualification"));

		testProperties.setProperty("id", "54321");
		testProperties.setProperty("location", "Hyderabad");
		
		FileOutputStream testFileOs = new FileOutputStream(testFile);
		testProperties.store(testFileOs, "Updated By Raju Chelle");
//		testFileOs.flush();

	}

}
