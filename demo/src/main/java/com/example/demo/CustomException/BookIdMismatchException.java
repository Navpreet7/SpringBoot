package com.example.demo.CustomException;

public class BookIdMismatchException extends RuntimeException{
	public BookIdMismatchException(String message,Throwable cause){
		super(message,cause);
	}
}
