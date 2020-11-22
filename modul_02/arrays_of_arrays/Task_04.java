package by.lecttor.modul_02.arrays_of_arrays;

import java.util.Scanner;

/*
 * 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public abstract class Task_04 {

	public static void main(String[] args) {
		int n;
		int k;
		int f;

		System.out.print(" Введите размер квадратной матрицы (n) >> ");
		n = inputIn();
		k = n;

		int[][] arrayNumber;
		arrayNumber = new int[n][k];

		for (int i = 0; i < n; i = i + 2) {
			for (int j = 0; j < k; j++) {
				arrayNumber[i][j] = j + 1;
				// System.out.print(" |" + arrayNumber[i][j] + "| ");
			}
		}
		for (int i = 1; i < n; i = i + 2) {
			f = n;
			for (int j = 0; j < k; j++) {
				arrayNumber[i][j] = f;
				f--;
				// System.out.print(" |" + arrayNumber[i][j] + "| ");
			}
		}
		System.out.println(" Матрица ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
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
		while (x <= 0) {
			System.out.print("Число должна быть больше 0, повторите ввод >> ");
			x = inputInt();
		}
		return x;
	}

}
