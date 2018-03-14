public class Operations {

	public static void main(String[] args) {
		doMaths(4, 2, 8);

	}

	public static void doMaths(int number1, int number2, int number3) {

		if (number1 + number2 == number3) {
			System.out.println(number1 + ", " + number2 + ", " + number3);
			System.out.println(number1 + " + " + number2 + " = " + number3);
			System.out.println(number2 + " + " + number1 + " = " + number3);
			System.out.println(number3 + " - " + number2 + " = " + number1);
			System.out.println(number3 + " - " + number1 + " = " + number2);
		} else if (number3 + number1 == number2) {
			System.out.println(number1 + ", " + number2 + ", " + number3);
			System.out.println(number1 + " + " + number3 + " = " + number2);
			System.out.println(number3 + " + " + number1 + " = " + number2);
			System.out.println(number2 + " - " + number1 + " = " + number3);
			System.out.println(number2 + " - " + number3 + " = " + number1);

		}
		if (number2 + number3 == number1) {
			System.out.println(number1 + ", " + number2 + ", " + number3);
			System.out.println(number2 + " + " + number3 + " = " + number1);
			System.out.println(number3 + " + " + number2 + " = " + number1);
			System.out.println(number1 + " - " + number2 + " = " + number3);
			System.out.println(number1 + " - " + number3 + " = " + number2);
		} else if ((number1 % number2 == 0) && (number3 % number1 == 0)
				&& (number3 % number2 == 0)) {
			System.out.println(number1 + ", " + number2 + ", " + number3);
			System.out.println(number1 + " * " + number2 + " = " + number3);
			System.out.println(number2 + " * " + number1 + " = " + number3);
			System.out.println(number3 + " / " + number1 + " = " + number2);
			System.out.println(number3 + " / " + number2 + " = " + number1);
		} else if ((number1 % number2 == 0) && (number1 % number3 == 0)) {
			System.out.println(number1 + ", " + number2 + ", " + number3);
			System.out.println(number1 + " / " + number2 + " = " + number3);
			System.out.println(number1 + " / " + number3 + " = " + number2);
			System.out.println(number2 + " * " + number3 + " = " + number1);
			System.out.println(number3 + " * " + number2 + " = " + number1);
		} else if ((number3 % number1 == 0) && (number3 % number2 == 0)) {
			System.out.println(number1 + ", " + number2 + ", " + number3);
			System.out.println(number3 + " / " + number1 + " = " + number2);
			System.out.println(number3 + " / " + number2 + " = " + number1);
			System.out.println(number1 + " * " + number2 + " = " + number3);
			System.out.println(number2 + " * " + number1 + " = " + number3);
		} else
			System.out.println("Can't do the operations with these numbers");

	}

}
