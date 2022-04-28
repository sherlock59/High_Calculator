/*
 * This main tests the whole functions
 * 
 * @author Annaberdi Meredov
 * @version 2.2
 * @since 2022.04.27
 */

package Calculator.app;

import Calculator.device.AdvanceCalc;

public class MainApp {

	public static void main(String[] args) {
		AdvanceCalc advanceClc = new AdvanceCalc();
		
		/*
		 * Test conduction process for functions below
		 */
		advanceClc.add(10);
		advanceClc.subtract(2);
		advanceClc.memoryAdd();
		advanceClc.multiply(10);
		advanceClc.memorySubtract();
		advanceClc.divide(2);
		advanceClc.memoryRecall();
		advanceClc.memoryReset();
		advanceClc.pow(3);
		advanceClc.sqrt();
		advanceClc.clear();
	}

}
