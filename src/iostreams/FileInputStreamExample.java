package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamExample {

	public static void main(String[] args) throws Exception {
		String currentDirPath = System.getProperty("user.dir");				
		File file1 = new File(currentDirPath+"\\TestDataFiles\\InputFile.txt");
		
		FileInputStream fis =  new FileInputStream(file1);
		
		System.out.println(fis.available());
		
		byte[] byte1 = new byte[fis.available()];
		
		fis.read(byte1);
		
		String fileData = new String(byte1);
		
		System.out.println(fileData);
	}

}
