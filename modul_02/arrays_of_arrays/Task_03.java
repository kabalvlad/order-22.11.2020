package by.lecttor.modul_02.arrays_of_arrays;

import java.util.Random;
import java.util.Scanner;

/*
 * 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task_03 {
	public static void main(String[] args) {
		int n;
		int r;
		int k;
		int p;

		Random rand = new Random();

		System.out.print(" Введите число строк матрицы (n) >> ");
		n = inputIn();
		System.out.print(" Введите число столбцов матрицы (r) >> ");
		r = inputIn();

		int[][] arrayNumber;
		arrayNumber = new int[n][r];

		System.out.println(" Матрица ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < r; j++) {
				arrayNumber[i][j] = rand.nextInt(10);
				System.out.print(" |" + arrayNumber[i][j] + "| ");
			}
			System.out.println(" ");
		}

		System.out.print(" Введите (k) cтроку >> ");
		k = inputIn();
		System.out.print(" Введите (p) столбец >> ");
		p = inputIn();

		System.out.println(" ");
		System.out.println(" Cтрока ");
		for (int i = 0; i < r; i++) {
			System.out.print(" " + arrayNumber[k - 1][i]);
		}

		System.out.println(" ");
		System.out.println(" Столбец ");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + arrayNumber[i][p - 1]);
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
