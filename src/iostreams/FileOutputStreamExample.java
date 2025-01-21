package iostreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception {
		File outFIle = new File("C:\\Users\\RAJU CHELLE\\Desktop\\OutputFile.txt");
		
		FileOutputStream fos = new FileOutputStream(outFIle);		
		String str = "Hello this is Selenium";		
		fos.write(str.getBytes());
		fos.flush();
		
		
	}

}
