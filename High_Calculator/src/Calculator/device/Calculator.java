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
		System.out.println("Calculator reset:" + this.current);
	}
	
	/*
	 * Override methods below for +,-,/, and * 
	 */
	@Override
	public void add(double input) {
		System.out.println("---------------------------------------");
		System.out.println("Welcome to Advanced Calculator");
		System.out.println("---------------------------------------");
		System.out.println("Testings Add:");
		System.out.print("   " + this.current + " + " + input + " = ");
		this.current = this.current + input;
		System.out.println(this.current + " \n ");
	}
	
	@Override
	public void subtract(double input) {
		System.out.println("Testing Subtract:");
		System.out.print("   " + this.current + " - " + input + " = ");
		this.current = this.current - input;
		System.out.println(this.current + " \n ");
	}
	
	@Override
	public void multiply(double input) {
		System.out.print(this.current + "*" + input + " = ");
		this.current = this.current * input;
		System.out.println(this.current);
	}
	
	@Override
	public void divide(double input) {
		System.out.print(this.current + " / " + input + " = ");
		this.current = this.current / input;
		System.out.println(this.current);
	}
	
}
