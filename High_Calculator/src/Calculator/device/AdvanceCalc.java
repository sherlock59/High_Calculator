/*
 * This Calculator does necessary basic functions
 * 
 * @author Annaberdi Meredov
 * @version 4.2
 * @since 2022.04.27
 */

package Calculator.device;

import Calculator.device.*;

import java.lang.Math;

public class AdvanceCalc extends StandardCalc implements AdvanceMath {
	
	public AdvanceCalc() {}
	
	/*
	 * Overrides power for method from the interface 
	 */
	@Override
	public void pow(double input) {
		System.out.print(this.current + "^" + input +  "is ");
		this.current = (Math.pow(this.current,  input));
		System.out.println(this.current);
	}
	
	@Override
	public void sqrt() {
		System.out.print(this.current + " \u221A ");
		
	}

}
