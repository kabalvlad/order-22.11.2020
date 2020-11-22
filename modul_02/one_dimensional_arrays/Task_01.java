package by.lecttor.modul_02.one_dimensional_arrays;

import java.util.Scanner;

/*
1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
*/

public class Task_01 {
	public static void main(String[] args) {
		int k;
		int n;
		int nok; // кратный число
		int sum; // сумма

		sum = 0;

		System.out.print(" Введите N, где N число ячеек в массиве >> ");
		n = inputInt();
		n = control0(n);

		System.out.print(" Введите K >> ");
		k = inputInt();
		k = control0(k);

		int[] arrayNumber;
		arrayNumber = new int[n];

		System.out.println(" Заполните массив: ");
		for (int i = 0; i < n; i++) {
			System.out.print(" >> ");
			arrayNumber[i] = inputInt();
		}

		for (int i = 0; i < n; i++) {
			nok = arrayNumber[i] % k;
			if (nok == 0) {
				sum += arrayNumber[i];
			}
		}
		System.out.println(" Сумма = " + sum);

	}

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

	public static int control0(int x) {
		while (x <= 0) {
			System.out.print("Число должна быть больше 0, повторите ввод >> ");
			x = inputInt();
		}
		return x;
	}
}
