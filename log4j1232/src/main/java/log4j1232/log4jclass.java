package log4j1232;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;

public class log4jclass {

	static Logger mylogger = Logger.getLogger(log4jclass.class.getName());

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("java project");

		/*
		 * log.trace("Trace Message!"); log.debug("Debug Message!");
		 * log.info("Info Message!"); log.warn("Warn Message!");
		 * log.error("Error Message!"); log.fatal("Fatal Message!");
		 */
		mylogger.trace("Hello this is trace message");

		mylogger.debug("Hello This is debug message..");

		mylogger.info("Hello this is info message....");

		mylogger.warn("Hello this is my warn message..");

		mylogger.error("hello this is error message....");

		mylogger.fatal("Hello this is fatal ,message...");

	}
}
