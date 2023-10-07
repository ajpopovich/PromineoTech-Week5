package Week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log("Hello");
		asteriskLogger.log("Something went wrong");
		
		spacedLogger.log("Hello");
		spacedLogger.log("Something went wrong");

	}

}
