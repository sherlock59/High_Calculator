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
		AdvanceCalc Calc = new AdvanceCalc();

		/*
		 * All the methods are tested here with numbers to make sure the calculator
		 * works properly.
		 */
		Calc.add(10);
		Calc.subtract(2);
		Calc.memoryAdd();
		Calc.multiply(10);
		Calc.memorySubtract();
		Calc.divide(2);
		Calc.memoryRecall();
		Calc.memoryClear();
		Calc.pow(3);
		Calc.sqrt();
		Calc.clear();
	}
}
