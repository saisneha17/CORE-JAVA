package com.dl.one;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Eg9 {

	public static void main(String[] args) throws IOException {
		
//		File f = new File("one.txt");
//		f.createNewFile();
//		System.out.println("File Created");
		
		FileReader ff = null;
		
		try {
			ff = new FileReader("One.txt");
			
		}catch (FileNotFoundException e) {
			System.out.println("Exceptions" + e);
			
		}finally {
			ff.close();
		}
		

	}

}
