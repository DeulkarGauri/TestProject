package log4jExample;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;

public class LoggingDemo {
	// int a;

	private static Logger mylog = Logger.getLogger(LoggingDemo.class);
	FileAppender f1 = new FileAppender();

	public static void main(String[] args) {
		System.out.println("welcome****");
		// BasicConfigurator.configure();
		//
		// mylog.setLevel(Level.ERROR);

		mylog.info("hello....");
		mylog.trace("This is trace message....");
		mylog.warn("this is warn message");
		mylog.error("This is error message");
		mylog.fatal("This fatal message...");

		// LoggingDemo log = new LoggingDemo(10);

		// System.out.println(mylog.equals(log));
		// System.out.println(mylog.getName());

	}

}
