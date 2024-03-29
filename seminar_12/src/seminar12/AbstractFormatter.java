package seminar12;

public abstract class AbstractFormatter {
	public void displayOutput(int input) {
		int userInput = getInput(input);
		String formattedInput = formatInput(userInput);
		display(formattedInput);
	}
	
	protected int getInput(int fakeInput) {
		System.out.println("getting input from user");
		return fakeInput;
	}
	
	protected abstract String formatInput(int input);
	
	protected void display(String input) {
		System.out.println(input);
	}
}
