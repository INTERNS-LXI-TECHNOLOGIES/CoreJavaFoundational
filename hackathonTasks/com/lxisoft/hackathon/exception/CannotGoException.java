package com.lxisoft.hackathon.exception;

	public class CannotGoException extends RuntimeException {
		public CannotGoException(String message) {
			super(message);
			System.out.println("Error") ;
		}
	}