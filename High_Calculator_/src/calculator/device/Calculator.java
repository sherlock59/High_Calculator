package calculator.device;

/**
 * This class takes responsibility for handling basic math functions.
 * Also, presents the function into a screen 
 * 
 * @author Anaberdi Meredov
 * @version 2.2
 * @since 09/05/22
 */
public abstract class Calculator implements BasicMath {



	/**
	 * The calculator's current value
	 */
	 double currentVal;

	/**
	 * This constructor handles housekeeping items
	 */
	public Calculator() {
	}

	/**
	 * Resets the calculator current value back to zero
	 */
	public void clear() {
		this.currentVal = 0.0;
		System.out.println("Calculator Clear: " + this.currentVal);
	}

	/**
	 * Adds the user's input to the current value. 
	 */
	@Override
	public void add(double inputVal) {
		System.out.println("Testing add:  ");
		System.out.print(this.currentVal + " + " + inputVal + " = ");
		this.currentVal += inputVal;
		System.out.println(this.currentVal);
	}

	/**
	 * Subtracts the user's input to the current value.
	 */
	@Override
	public void subtract(double inputVal) {
		System.out.println("Testing subtract:  ");
		System.out.print(this.currentVal + " - " + inputVal + " = ");
		this.currentVal -= inputVal;
		System.out.println(this.currentVal);

	}

	/**
	 * Multiplies the user's input to the current value
	 */
	@Override
	public void multiply(double inputVal) {
		System.out.print(this.currentVal + " * " + inputVal + " = ");
		this.currentVal *= inputVal;
		System.out.println(this.currentVal);
	}

	/**
	 * Divides the user's input to the current value 
	 */
	@Override
	public void divide(double inputVal) {
		System.out.print(this.currentVal + " / " + inputVal + " = ");
		this.currentVal /= inputVal;
		System.out.println(this.currentVal);
	}

}
