package Week5CodingAssignment;

public class SpacedLogger implements Logger {
	@Override
	public void log (String message) {
		String spacedMessage = String.join(" ", message.split(""));
		System.out.println(spacedMessage);
	}
	
	@Override
	public void error(String error) {
		String spacedError = String.join(" ", error.split(""));
				System.out.println("ERROR: " + spacedError);
	}
	}
