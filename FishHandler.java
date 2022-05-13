package Assignment2;

/**
 * defining the two methods in this FishHandler class
 * @author justinyiu
 *
 */

public class FishHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * initiates a call to the easterString method and will catch the rethrown exception
		 */
		try {
			easterStarting();
		}
		/**
		 * The exception superclass catches all exceptions
		 */
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static void easterStarting() throws Exception {
		try {
			easterEnding();
		}
		catch (Exception e) {
			System.err.println("Exception was caught");
			throw e;
		}
		
	}
	
	/**
	 * easterEnding method which just throws an Exception
	 * @throws Exception
	 */
	static void easterEnding() throws Exception {
		throw new Exception();
	}
		/**
		 * easterStarting calls the easterEnding method and catches the exception and rethrows it
		 * @throws Exception
		 */
	
	
	

}

