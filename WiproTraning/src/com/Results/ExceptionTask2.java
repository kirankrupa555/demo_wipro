package com.Results;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTask2 {
	public void fileException() {
		try {
		System.out.println("reading the data from the file");
		FileReader read = new FileReader("C:\\Users\\krupa kiran\\Do\\Demo.java");
		int x ;
		while((x=read.read())!=1) {
			System.out.println((char)x);
		}
		read.close();
		}
		
		catch(Exception e){
			if( e instanceof FileNotFoundException) {
				System.out.println("you entered wrong file path");
			}
			else if(e instanceof  IOException ){
				System.out.println("input/output related errors)");
			}
		}
	}
	public static void main(String[] args) {
	new ExceptionTask2().fileException();

	}

}
