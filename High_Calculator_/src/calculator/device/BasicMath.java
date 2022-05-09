package calculator.device;

/**
 * This class writes +,-,*,\ functions to the system 
 * 
 * @author Anaberdi Meredov
 * @version 2.2
 * @since 09/05/22
 */
public interface BasicMath {

	/**
	 * plus fucntion
	 * @param inputVal
	 */
	void add(double inputVal);

	/**
	 * minus function 
	 * @param input
	 */
	void subtract(double inputVal);

	/**
	 * multiplication function 
	 * @param inputVal
	 */
	void multiply(double inputVal);

	/**
	 * division function 
	 * @param inputVal
	 */
	void divide(double inputVal);

}
