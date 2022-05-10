package calculator.app;

import calculator.device.*;

/**
 * This main runs a test for the classes in application device package
 * 
 * @author Anaberdi meredov
 * @version 2.2
 * @since 09/05/22
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AdvanceCalc calc = new AdvanceCalc();

		/*
		 * All the methods are tested here with numbers to make sure the calculator
		 * works properly.
		 */
		calc.add(10);
		calc.subtract(2);
		calc.memoryAdd();
		calc.multiply(10);
		calc.memorySubtract();
		calc.divide(2);
		calc.memoryRecall();
		calc.memoryClear();
		calc.pow(3);
		calc.sqrt();
		calc.clear();
	}
}
