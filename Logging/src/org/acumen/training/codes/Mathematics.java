package org.acumen.training.codes;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Mathematics {
	// Step 1 : Setup a logger object
	private static final Logger LOGGER = Logger.getLogger(Mathematics.class.getName());
	
	public Mathematics() {
		// Step 2: Configure Logger
		LOGGER.setLevel(Level.INFO);
		
		// Step 2a: Create the format of the log
		try {
			FileHandler filehandler = new FileHandler("./src/files/math.log", true);
			filehandler.setLevel(Level.INFO);
			filehandler.setEncoding("utf-8");
			
			// Step 2b: Define log message format
			SimpleFormatter text = new SimpleFormatter();
		    filehandler.setFormatter(text);
			
			LOGGER.addHandler(filehandler);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	// Step 3: Perform the logging
	
	@SuppressWarnings("removal")
	public int add(int x, int y) throws NegativeOperandException{
		// start log
		LOGGER.info("start of add with params: %d %d".formatted(x, y));
		if (x < 0 || y < 0) {
			LOGGER.severe("negative x and y encountered");
			throw new NegativeOperandException();
		}
		
		int sum = x + y - 1;
		LOGGER.info("the sum is %d".formatted(sum));
		// log the result
		
		// warn log
		Integer bigSum = new Integer(sum);
		LOGGER.warning("used a deprecated Integer wrapping");
		
		// end log
		LOGGER.info("end of add");
		return sum ;
	}
	
	public int div(int x, int y) {
		return x / y;
	}

}
