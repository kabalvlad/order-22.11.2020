package by.lecttor.modul_02.arrays_of_arrays;

import java.util.Random;
import java.util.Scanner;

/*
 * 10. Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task_10 {

	public static void main(String[] args) {
		int n;

		Random rand = new Random();

		System.out.print(" Введите число строк матрицы (n) >> ");
		n = inputIn();

		int[][] arrayNumber;
		arrayNumber = new int[n][n];

		System.out.println("Матрица ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arrayNumber[j][i] = (rand.nextInt(10) * 2 - 10);
				System.out.print(" |" + arrayNumber[j][i] + "| ");
			}
			System.out.println(" ");
		}
		System.out.println("Положительные элементы главной диагонали квадратной матрицы: ");
		for (int i = 0; i < n; i++) {
			if (arrayNumber[i][i] >= 0) {
				System.out.print(arrayNumber[i][i] + "  ");
			}
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
