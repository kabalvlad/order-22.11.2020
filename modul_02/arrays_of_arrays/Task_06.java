package by.lecttor.modul_02.arrays_of_arrays;

import java.util.Scanner;

/*
 * 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public class Task_06 {

	public static void main(String[] args) {
		int n;
		int k;

		System.out.print(" Введите размер квадратной матрицы (n) >> ");
		n = inputIn();
	

		int[][] arrayNumber;
		arrayNumber = new int[n][n];

		k = n;
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < k; j++) {
				arrayNumber[i][j] = 1;
				// System.out.print(" |" + arrayNumber[i][j] + "| ");
			}
			k--;
		}
		k = -1;
		for (int i = (n-1); i >= (n / 2); i--) {
			for (int j = i; j > k; j--) {
				arrayNumber[i][j] = 1;
				//  System.out.print(" |" + arrayNumber[i][j] + "| ");
			}
			k++;
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
