package com.raj.fundamentals.processbuilder;

import java.io.IOException;

public class MyInvokeOtherApps {
	public static void main(String[] args) {
		
		ProcessBuilder pb = new ProcessBuilder("java","MyTest");
		try {
			pb.start();
			System.out.println("Process has been started.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
