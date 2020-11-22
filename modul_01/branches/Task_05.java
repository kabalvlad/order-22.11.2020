package by.lecttor.modul_01.branches;

import java.util.Scanner;

// 5. Вычислить значение функции:

public class Task_05 {

	public static void main(String[] args) {

		int x;
		double fx;

		System.out.print("Введите  x >> ");
		x = inputINT();

		if (x <= 3) {
			fx = x * x - 3 * x + 9;
			System.out.println(fx);
		} else {

			fx = 1 / (Math.pow(x, 3) + 6);
			System.out.println(fx);
		}

	}

	public static int inputINT() {
		String i;
		int per;
		Scanner in = new Scanner(System.in);
		while (!in.hasNextInt()) {
			System.out.print(" >> ");
			i = in.nextLine();
		}
		per = in.nextInt();
		return (per);
	}

}
