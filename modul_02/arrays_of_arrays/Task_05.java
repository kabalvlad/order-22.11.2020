package by.lecttor.modul_02.arrays_of_arrays;

/*
 * 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

import java.util.Scanner;

public class Task_05 {
	public static void main(String[] args) {
		int n;
		int k;

		System.out.print(" Введите размер квадратной матрицы (n) >> ");
		n = inputIn();
		k = n;

		int[][] arrayNumber;
		arrayNumber = new int[n][k];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				arrayNumber[i][j] = i + 1;
				// System.out.print(" |" + arrayNumber[i][j] + "| ");
			}
			k--;

		}
		System.out.println(" Матрица ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" |" + arrayNumber[i][j] + "| ");
			}
			System.out.println(" ");
		}

	}

	// Ввод числа
	public static int inputIn() {
		int k;
		k = inputInt();
		k = control0(k);
		System.out.println(" ");
		return k;
	}

	// Ввод в консоль числа
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

	// проверка числа
	public static int control0(int x) {
		while (x <= 0 || x % 2 != 0) {
			System.out.print("Число должна быть больше 0 и четноё, повторите ввод >> ");
			x = inputInt();
		}
		return x;
	}

}
