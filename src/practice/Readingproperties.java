package practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Properties;

public class Readingproperties {
	

	public static void main(String[] args) throws Exception {

		
		// TODO Auto-generated method stub
		//System.getProperty("user.dir") +
String filepath =System.getProperty("user.dir") + "/src/HWDay11/object.properties";
	Properties pr = new Properties();
	FileInputStream fi = new FileInputStream(filepath);
	pr.load(fi);
	System.getProperties().putAll(pr);
	System.out.println("Property value of Username   "+ System.getProperty("username"));
	String empty ="";	
	
	
//	FileOutputStream fo =new FileOutputStream(filepath);
//	pr.setProperty("password", "1234");
//	pr.store(fo, null);
//	System.out.println(pr.getProperty("password"));
//	
	
	
	
	
	FileReader fr = new FileReader(filepath);
	BufferedReader br = new BufferedReader(fr);
	while ((empty = br.readLine()) != null) {
		System.out.println(" file elements are:" + empty);
	}





	}
}