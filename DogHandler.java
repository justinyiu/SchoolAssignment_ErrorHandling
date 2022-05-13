package Assignment2;

import java.io.IOException;




public class DogHandler {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * the main method calls the following methods to catch the exceptions
		 * 
		 */
		firstMethod();
		secondMethod();
		thirdMethod();
		fourthMethod();
		
		
		
	}
	/**
	 * the first method will throw the exception dog and it the superclass exception will catch everything
	 * and it will print the stacktrace
	 */
	static void firstMethod() {
		try {
			throw new ExceptionDog();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	/**
	 * the second method will throw the exception puppy and the superclass exception will catch anything
	 * and it will also print the stacktrace
	 */
	static void secondMethod() {
		try {
			throw new ExceptionPuppy();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * the third method will throw the nullpointer exception and catch any exceptions with the superclass
	 * and it will print the stacktrace
	 */
	static void thirdMethod() {
		try {
			throw new NullPointerException();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * the fourth method will throw an IOException and the superclass exception will catch everything
	 * and it will print the stack trace
	 */
	static void fourthMethod() {
		try {
			throw new IOException();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * the inner classes exceptionDog that extends exception
	 * and inner class ExceptionPuppy that extends ExceptionDog
	 *
	 */
	static class ExceptionDog extends Exception {
		
	}
	
	static class ExceptionPuppy extends ExceptionDog {
		
	}

}
