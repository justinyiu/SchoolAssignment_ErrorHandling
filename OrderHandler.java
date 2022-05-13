package Assignment2;

import java.io.IOException;

public class OrderHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/**
		 * make the superclass exception at the bottom
		 * and more specific exception at the top
		 * This shows no compilation issue
		 */
		
		
		try {
			throw new IOException();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		/**
		 * this exception catching will have an error 
		 * because it tries to catch the superclass exception before the subclass exception
		 */
		
		/**
		try {
			throw new Exception();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		*/
	}

}
