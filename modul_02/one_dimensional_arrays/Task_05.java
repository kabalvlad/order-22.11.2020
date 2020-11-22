package by.lecttor.modul_02.one_dimensional_arrays;

import java.util.Scanner;

/*
 * 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */

public class Task_05 {
	public static void main(String[] args) {

		int n;

		System.out.print(" Введите N, где N число ячеек в массиве >> ");
		n = inputInt();
		n = control0(n);

		int[] arrayNumber;
		arrayNumber = new int[n];

		System.out.println(" Заполните массив: ");
		for (int i = 0; i < n; i++) {
			System.out.print(" >> ");
			arrayNumber[i] = inputInt();
		}

		for (int i = 0; i < n; i++) {
			if (arrayNumber[i] > i) {
				System.out.print(arrayNumber[i] + " | ");
			}
		}

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
