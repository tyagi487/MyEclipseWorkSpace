package com.Java.Sel;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "./exefiles/IEDriverServer.exe");
		System.out.println("de");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		
		
	

	}

}
