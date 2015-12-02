package exception;

import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException, MyException {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = 1;
		Scanner sc = new Scanner(System.in);
		while (num1 != 1) {
			num2 = sc.nextInt();
			try {
				num1 = num1 / num2;
				// System.out.println("Num1 = "+ Integer.toString(num1));
			} catch (Exception ex) {
				ex.printStackTrace();
				num1 = num1 / 1;
			} finally {
				System.out.println("Num1 = " + Integer.toString(num1));
				// continue;
			}
		}
		if (num1 == 1) {

			throw new MyException();

		}
		System.out.println("Main finish.");
	}
}
