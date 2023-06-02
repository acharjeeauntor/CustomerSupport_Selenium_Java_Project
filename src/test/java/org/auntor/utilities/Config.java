package org.auntor.utilities;

import java.io.*;
import java.util.Properties;

public class Config {

	Properties pro;
	File src = new File("./Configuration/config.properties");
	
	public Config() {
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}
	

	public String getBaseUrl() {
		String url  = pro.getProperty("baseUrl");
		return url;
	}
	
	public String getUserEmail() {
		String id  = pro.getProperty("userEmail");
		return id;
	}
	
	public String getUserPassword() {
		String pass  = pro.getProperty("password");
		return pass;
	}

}
