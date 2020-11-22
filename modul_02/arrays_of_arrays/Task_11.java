package by.lecttor.modul_02.arrays_of_arrays;

import java.util.Random;

/*
11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.

 */

public class Task_11 {

	public static void main(String[] args) {
		int n;
		int p;
		int count;

		n = 10;
		p = 20;

		Random rand = new Random();

		int[][] arrayNumber;
		arrayNumber = new int[n][p];

		System.out.println("Исходная матрица ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < p; j++) {
				arrayNumber[i][j] = rand.nextInt(20);
				System.out.print(" |" + arrayNumber[i][j] + "| ");
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			count = 0;
			for (int j = 0; j < p; j++) {
				if (arrayNumber[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				System.out.println("В строке №" + (i + 1) + " число 5 встречается три и более раз.");
			}

		}

	}

}
