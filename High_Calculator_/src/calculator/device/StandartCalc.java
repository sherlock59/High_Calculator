package calculator.device;

/**
 * This class handles the calculator's memory 
 * 
 * @author Anaberdi Meredov
 * @version 2.2
 * @since 09/05/22
 */
public class StandartCalc extends Calculator {
	
	/**
	 * initializing memoryVal 
	 */
	protected double memoryVal;
	
	/*
	 * The default constructor is used to handle housekeeping items.
	 */
	public StandartCalc() {}

	/*
	 * Sets the memory value to zero.
	 */
	public void memoryClear() {
		this.memoryVal = 0.0;
		System.out.println("Memory Clear: " + this.memoryVal);
	}

	/*
	 * Updates the value in the memory.
	 */
	public void memoryAdd() {
		System.out.print("Testing memory add: ");
		this.memoryVal += this.currentVal;
		System.out.println(this.memoryVal);
	}

	/*
	 * Subtracts the memory value from the current value.
	 */
	public void memorySubtract() {
		System.out.print("Memory Subtract: ");
		this.memoryVal -= this.currentVal;
	    System.out.println(this.memoryVal);
	}

	/*
	 * Displays the value that is stored in memory.
	 */
	public double memoryRecall() {
		System.out.println("Testing Memory Recall: " + this.memoryVal);
		return this.memoryVal;
	}

}
