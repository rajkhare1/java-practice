package com.raj.fundamentals.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadHello {
		public static void main(String[] args)  {
			
			try {
				FileInputStream fis = new FileInputStream("src/hello.txt");
				int i =0;
				List<String> list = new ArrayList<String>();
				while ((i=fis.read()) != -1) {
					char s = (char)i;
					String t=Character.toString(s);
					System.out.print(t);
					list.add(t);
				}
				System.out.println(list);
				fis.close();
			} catch (FileNotFoundException e) {	
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}

}
