package q13;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class Main {
	public Main() throws IOException{
		FileReader fileReader= new FileReader("C:\\Users\\Veeresh Lingayat\\OneDrive\\Desktop\\VEERESH_JAVA\\JAVA_SET_B\\src\\q13\\info.txt");
		Properties properties = new Properties();
		properties.load(fileReader);
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
	}

public static void main(String[] args) throws IOException {
	new Main();
}
}
