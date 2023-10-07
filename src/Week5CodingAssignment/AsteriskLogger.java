package Week5CodingAssignment;

public class AsteriskLogger implements Logger {
	@Override
	public void log(String message) {
		System.out.println("***" + message + "***");
	}

	@Override
	public void error(String error) {
		System.out.println("***Error: " + error + "***");
	}
}
