/**
 * @author justinyiu
 * Assignment 2
 */
package Assignment2;



public class CatHandler {

	public static void main(String[] args) {
		
		/**
		 * Throw exception three and catch it and print the stack trace
		 */
		try {
			throw new ExceptionThree();
		}
		catch (ExceptionTwo eT) {
			eT.printStackTrace();
		}
		finally {
			System.err.println("Exception three was caught successfully");
		}
		
		/**
		 * throw exception two and catch it and print the stack trace
		 */
		try { 
			throw new ExceptionTwo();
		}
		catch (ExceptionOne eO) {
			eO.printStackTrace();
		}
		finally {
			System.err.println("Exception two was caught successully");
		}
		
		/**
		 * throw exception one and catch it, and print the stack trace
		 */
		try {
			throw new ExceptionOne();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.err.println("Exception one was caught successfully");
		}

	}
	
	/**
	 * these are the inner classes of CatHandleer, and each class will inherit from the previous class
	 * 
	 *
	 */
	static class ExceptionOne extends Exception {
		
	}
	
	static class ExceptionTwo extends ExceptionOne {
		
	}
	
	static class ExceptionThree extends ExceptionTwo {
		
	}

}
