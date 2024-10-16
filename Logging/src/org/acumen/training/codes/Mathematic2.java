package org.acumen.training.codes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Mathematic2 {
	private static final Logger LOGGER = LogManager.getLogger("LOGGER1");
	
	// Step 3: Perform logging methods
	public int add(int x, int y) throws NegativeOperandException{
		

		LOGGER.info("start of add with params: {} {}", x, y);
		if (x < 0 || y < 0) {
			LOGGER.error("negative x and y encountered");
			throw new NegativeOperandException();
		}
		
		int sum = x + y - 1;
		LOGGER.info("the sum is {}", sum);
		
		LOGGER.info("end of add");
		return x + y - 1;
	}
	
	public int div(int x, int y) {
		
		try {
			int q = x / y;
			return q;
		} catch (ArithmeticException ex) {
			LOGGER.fatal("division by zero error");
			ex.printStackTrace();
		}
		return 0;
	}

}
