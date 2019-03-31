package mjy.rt2;

public class Main {
	
	//This is the main method
	/**
	 * Main method for the root 2 program
	 * @param args *No arguments for this program
	 */
	public static void main(String[] args) {
		
		//Creating variables to store a0 and number of iterations
		double a0 = 1;
		int n = 4;
		
		//Calls the aN method using a0 and n
		double root2 = aN(a0, n);
		
		//Prints the result to the console
		System.out.println("After " + n + " iterations, the value we get for root 2 is: " + root2);
	}
	
	//
	/**
	 * This method calculates root 2 for a given a(0) using n iterations
	 * @param aN The value of a(0) to use
	 * @param n The number of iterations to run
	 * @return Returns a(n)
	 */
	public static double aN(double a0, int n) {
		
		//Takes 1 away from the number of iterations to do
		n--;
		
		double aN;
		
		if(n == 0) {
			//If there are no iterations left to do, calculate aN using a0
			aN = (a0/2) + (1/a0);
		}else {
			//If there are iterations left to do, calculate aN using recursive calls to the aN method
			aN = (aN(a0, n)/2) + (1/aN(a0, n));
		}
		
		return aN;
	}
	
}
