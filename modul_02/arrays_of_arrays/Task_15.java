package by.lecttor.modul_02.arrays_of_arrays;

import java.util.Random;
import java.util.Scanner;

/*
 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

public class Task_15 {
	public static void main(String[] args) {

		int n;
		int p;
		int max;

		System.out.print(" Введите число строк матрицы (n) >> ");
		n = inputIn();
		System.out.print(" Введите число столбцов матрицы (p) >> ");
		p = inputIn();

		Random rand = new Random();

		int[][] arrayNumber;
		arrayNumber = new int[n][p];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < p; j++) {
				arrayNumber[i][j] = rand.nextInt(50);
			}
		}

		System.out.println("Исходная матрица ");
		arrayPrint(arrayNumber);

		max = arrayNumber[0][0];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < p; j++) {
				max = Math.max(arrayNumber[i][j], max);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < p; j++) {
				if (arrayNumber[i][j] % 2 != 0) {
					arrayNumber[i][j] = max;
				}
			}
		}
		System.out.println("Полученая матрица ");
		arrayPrint(arrayNumber);

	}

	// ----------------------------------------------------------------------------------
	// Методы
	// ---------------------------------------------------------------------------------

	// печать массива
	public static void arrayPrint(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(" |" + array[i][j] + "| ");
			}
			System.out.println("  ");
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
