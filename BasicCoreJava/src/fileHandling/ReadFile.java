package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFile {

	public static void main(String[] args) throws IOException {
	
		Properties p=new Properties();  //cnt+shift+o do directly import file
		FileInputStream file= new FileInputStream("C:\\seleniumclass\\BasicCoreJava\\src\\fileHandling\\or.properties");
		p.load(file);
		System.out.println(p.get("name"));
	

	}

}
