package com.example.demo.CustomException;

public class BookNotFoundException extends RuntimeException{
	
	public BookNotFoundException(String message,Throwable cause) {
		super(message,cause);
	}

}
