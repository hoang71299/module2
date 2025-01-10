package ss7;

public class Test {
	public static void main(String[] args) {
		String test = "DTC123";

		System.out.println(test.matches("DTC[0-9]{3}"));
		System.out.println(test.matches("DTC\\d{3}"));
	}
}
