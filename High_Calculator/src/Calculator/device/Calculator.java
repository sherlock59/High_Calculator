/*
 * This class builds the functions such as +,-,/, and *
 * 
 * @author Annaberdi Meredov
 * @version 2.2
 * @since 2022.04.27
 */
package Calculator.device;

public abstract class Calculator implements BasicMath {
	
	protected double current = 0.0;
	
	public Calculator() {}
	
	public void clear() {
		current = 0.0;
		System.out.println("C :" + this.current);
	}
	
	/*
	 * Override methods below for +,-,/, and * 
	 */
	@Override
	public void divide(double input) {
		System.out.print(this.current + " * " + input + "=");
		this.current = this.current * input;
		System.out.println(this.current);
	}
	
	@Override
	public void multiply(double input) {
		System.out.print(this.current + "*" + input + "=");
		this.current = this.current * input;
		System.out.println(this.current);
	}

}
