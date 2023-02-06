package propertyFiles;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFiles {
  public static void main(String[] args) throws IOException {
	FileInputStream file=new FileInputStream(".\\PropertyFiles\\MyData.properties");
	Properties prop=new Properties();
	prop.load(file);
	System.out.println("FirstName\t:"+prop.getProperty("FirstName"));
	System.out.println("MiddleName\t:"+prop.getProperty("MiddleName"));
	System.out.println("LastName\t:"+prop.getProperty("LastName"));
	System.out.println("Mobile No.\t:"+prop.getProperty("Mobile"));
	System.out.println("Email ID\t:"+prop.getProperty("Email"));
	String EmailId=prop.getProperty("Email");
	System.out.println(EmailId);
}
}
