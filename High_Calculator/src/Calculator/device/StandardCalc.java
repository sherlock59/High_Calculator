/*
 * this class handles the memory function for the whole app 
 * 
 * @author Annaberdi Meredov
 * @version 2.2
 * @since 2022.04.27
 */
package Calculator.device;

public class StandardCalc extends Calculator {@Override
public void add(double input) {
	// TODO Auto-generated method stub
	super.add(input);
}
	protected double memory = 0.0;


public  StandardCalc() {}

/*
 * this function sets the memory value to zero
 */
public void memoryReset() {
	memory = 0.0;
	System.out.println("Memory Reset: " + this.memory);
}

public void memoryAdd() {
	System.out.print("Memory add: ");
	this.memory += this.current;
	System.out.println(this.memory);
}

public void memorySubtract() {
	System.out.print("Memory Subtract: ");
	this.memory = this.memory - this.current;
	System.out.println(this.memory);
}

public void memoryRecall() {
	System.out.println("Memory Recall:" + this.memory);
}
	
}
