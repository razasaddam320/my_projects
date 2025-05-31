package commondata_Properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class StoreData_Inproperties_file {

	public static void main(String[] args) throws IOException {
		
		// 1st give filenotfoundException  
		FileOutputStream fos = new FileOutputStream("D:\\PracticeWorkspace\\Selenium\\store.properties");
		Properties prob =new Properties();
		prob.setProperty("phoneno.", "123456789");
		prob.setProperty("flipkart", "https://www.flipkart.com");
		//2nd will give ioExcepton
		prob.store(fos, null);
		
		//print what have i store
		System.out.println(prob.getProperty("phoneno."));
		System.out.println(prob.getProperty("flipkart"));

	}

}
