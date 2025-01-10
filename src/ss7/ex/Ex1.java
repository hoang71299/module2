package ss7.ex;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("DTC534".matches("DTC[0-9]{3}"));
		System.out.println("DTC534".matches("DTC\\d{3}"));

		//b
		System.out.println("+84901234567".matches("[+][(](0|84)[)]3[2-9][0-9]{7}"));

		//c
		System.out.println("Nguyen_Van_A_2003@gmail.com".matches("[a-zA-Z0-9_]{6,32}[@]gmail[.]com"));

		//d
		System.out.println("HunhHong.".matches("[a-zA-Z0-9_.]{6,32}"));

		//e
		System.out.println("HunhHong@123".matches("[A-Z]([}\\w!@#$%^&*]{5,31})"));
	}
}
