package seminar12;

public class DecimalFormatter extends AbstractFormatter{

	@Override
	public String formatInput(int input) {
		return String.format("%d", input);
	}
}
