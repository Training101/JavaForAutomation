package com.fileread;

import com.utils.PropertyFileReader;


public class ReadPropertyFiles {

	public static void main(String[] args) {

		PropertyFileReader reader = new PropertyFileReader("config.properties");
		String browser = reader.getPropertyValue("BROWSER");
		String url = reader.getPropertyValue("URL");
		
		System.out.println("Browser is : "+browser);
		System.out.println("URL is : "+url);
		
	}

	
}
