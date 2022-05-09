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
	 * initial current zero
	 */
	protected double currentVal = 0.0;

	/**
	 * default constructor 
	 */
	public Calculator() {
	}

	/**
	 * setting initial zero into zero with reset if has different digits
	 */
	public void clear() {
		currentVal = 0.0;
		System.out.println("Calculator Clear: " + this.currentVal);
	}

	/**
	 * adding method
	 */
	@Override
	public void add(double inputVal) {
		System.out.println("Testing add:  ");
		System.out.print(this.currentVal + " + " + inputVal + " = ");
		this.currentVal = this.currentVal + inputVal;
		System.out.println(this.currentVal);
	}

	/**
	 * subtract method
	 */
	@Override
	public void subtract(double inputVal) {
		System.out.println("Testing subtract:  ");
		System.out.print(this.currentVal + " - " + inputVal + " = ");
		this.currentVal = this.currentVal - inputVal;
		System.out.println(this.currentVal);

	}

	/**
	 *multiple method displayed
	 */
	@Override
	public void multiply(double inputVal) {
		System.out.print(this.currentVal + " * " + inputVal + " = ");
		this.currentVal = this.currentVal * inputVal;
		System.out.println(this.currentVal);
	}

	/**
	 * division method 
	 */
	@Override
	public void divide(double inputVal) {
		System.out.print(this.currentVal + " / " + inputVal + " = ");
		this.currentVal = this.currentVal / inputVal;
		System.out.println(this.currentVal);
	}

}
