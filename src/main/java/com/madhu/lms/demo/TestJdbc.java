/**
 * 
 */
package com.madhu.lms.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author 15197
 *
 */
public class TestJdbc {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// https://stackoverflow.com/questions/50379839/connection-java-mysql-public-key-retrieval-is-not-allowed
		String jdbcUrl = "jdbc:mysql://localhost:3306/lib_mgmt_system?useSSL=false&allowPublicKeyRetrieval=true";	// useSSL=false is to get rid of SSL warning
		String user="lmsmadhu";
		String passwd="lmsmadhu";
		
		try	{
			System.out.println("Connecting to database: "+jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, passwd);
			System.out.println("Connection successful!!!");
			System.out.println("Working Directory = " + System.getProperty("user.dir"));
			
			URL res = TestJdbc.class.getClassLoader().getResource("hibernate.cfg.xml");
			File file = Paths.get(res.toURI()).toFile();
			String absolutePath = file.getAbsolutePath();
			System.out.println(absolutePath);
			//URL resource = TestJdbc.class.getResource("hibernate.cfg.xml");
			//System.out.println(Paths.get(resource.toURI()).toFile().getAbsolutePath());
			
			//Paths.get(resource.toURI()).toFile();
			BufferedReader r = new BufferedReader( new FileReader( absolutePath ) );
			String s = "", line = null;
			while ((line = r.readLine()) != null) {
			    s += "\n" + line;
			}
			System.out.print(s);
			
		}	catch (Exception e) {
			e.printStackTrace();
		}
	}
}
