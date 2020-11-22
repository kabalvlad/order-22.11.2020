package by.lecttor.modul_02.arrays_of_arrays;

import java.util.Random;
import java.util.Scanner;

/*
 * 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class Task_02 {

	public static void main(String[] args) {
		int n;
		int k;
		int l; //

		Random rand = new Random();

		System.out.print(" Введите размер квадратной матрицы (n) >> ");
		n = inputIn();
		k = n;

		int[][] arrayNumber;
		arrayNumber = new int[n][k];

		System.out.println(" Матрица ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				arrayNumber[i][j] = (rand.nextInt(10) * 2 - 10);
				System.out.print(" |" + arrayNumber[i][j] + "| ");
			}
			System.out.println(" ");
		}

		System.out.println(" Элементы, стоящие на диагонали ");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + arrayNumber[i][i]);

		}
		System.out.println(" ");
		l = n - 1;
		for (int i = 0; i < n; i++) {
			System.out.print(" " + arrayNumber[i][l]);
			l--;
		}

	}

	public static int inputIn() {
		int k;
		k = inputInt();
		k = control0(k);
		System.out.println(" ");
		return k;
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
