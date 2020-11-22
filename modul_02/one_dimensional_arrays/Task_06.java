package by.lecttor.modul_02.one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

/*
6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
 */

public class Task_06 {

	public static void main(String[] args) {
		int n;
		double sum;

		sum = 0;

		Random rand = new Random();

		System.out.print(" Введите N, где N размер последовательности >> ");
		n = inputInt();
		n = control0(n);

		double[] arrayNumber;
		arrayNumber = new double[n];

		for (int i = 0; i < arrayNumber.length; i++) {
			arrayNumber[i] = (rand.nextDouble() * 10);
			System.out.printf("%.3f", arrayNumber[i]);
			System.out.println(" ");
		}

		for (int i = 2; i <= n; i++) {
			if (simpleNumber(i)) {
				sum += arrayNumber[(i - 1)];
			}

		}
		System.out.print(" Сумма равна = ");
		System.out.printf("%.3f", sum);

	}

	// проверка простое число или нет
	public static boolean simpleNumber(int n) {
		int j;
		boolean simp;
		simp = true;
		for (int i = 2; i < n; i++) {
			j = n % i;
			if (j == 0) {
				simp = false;
				break;
			}
		}
		return (simp);
	}

	// ввод числа
	public static int inputInt() {
		int per;
		String i;
		Scanner in = new Scanner(System.in);
		while (!in.hasNextInt()) {
			System.out.print("Повторите ввод >> ");
			i = in.nextLine();
		}
		per = in.nextInt();
		return per;
	}

	// проверка числа больше 0
	public static int control0(int x) {
		while (x <= 1) {
			System.out.print("Число должна быть больше 1, повторите ввод >> ");
			x = inputInt();
		}
		return x;
	}
}
