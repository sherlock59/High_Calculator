
package calculator.device;

import java.lang.Math;

/**
 * This calculator has all necessary functions of calculator plus build some advanced functions
 * including Power and square root. 
 * 
 * @author Anaberdi Meredov
 * @version 2.2
 * @since 09/05/22
 *
 */
public class AdvanceCalc extends StandartCalc implements AdvanceMath {

	/*
	 * The default constructor is used to handle housekeeping items.
	 */
	public AdvanceCalc() {
	}

	/*
	 * Overrides the power of method from the interface.
	 */
	@Override
	public void pow(double inputVal) {
		System.out.println("Testing POW: ");
		System.out.print(this.currentVal + " ^ " + inputVal + " is ");
		this.currentVal = (Math.pow(this.currentVal, inputVal));
		System.out.println(this.currentVal);
	}

	/*
	 * Overrides the square root method from the interface.
	 */
	@Override
	public void sqrt() {
		System.out.println("Testing Sqrt: ");
		System.out.print(this.currentVal + " \u221A ");
		this.currentVal = (Math.sqrt(this.currentVal));
		System.out.println(this.currentVal);
	}
}