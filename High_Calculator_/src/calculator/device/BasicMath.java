package calculator.device;

/**
 * This class that implements interface logic for add, subtract,
 * multiple, and divide functions 
 * 
 * @author Anaberdi Meredov
 * @version 2.2
 * @since 09/05/22
 */
public interface BasicMath {

	/**
	 * Adds the user's input to the current value
	 * @param inputVal
	 */
	void add(double inputVal);

	/**
	 * Subtracts the user's input to the current value 
	 * @param input
	 */
	void subtract(double inputVal);

	/**
	 * Multiplies the user's input to the current value
	 * @param inputVal
	 */
	void multiply(double inputVal);

	/**
	 * divides the user's input to the current value 
	 * @param inputVal
	 */
	void divide(double inputVal);

}
