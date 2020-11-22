package by.lecttor.modul_02.arrays_of_arrays;

/*
14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
 */

import java.util.Random;

public class Task_14 {
	public static void main(String[] args) {
		int m;
		int n;
		int count;

		m = nowRand();
		n = nowRand();

		int[][] arrayRandom;
		arrayRandom = new int[m][n];

		for (int i = 0; i < n; i++) {
			count = 0;
			for (int j = 0; j < m; j++) {
				arrayRandom[j][i] = 1;
				if (arrayRandom[j][i] == 1) {
					count++;
				}
				if (count > i) {
					arrayRandom[j][i] = 0;
				}
			}
		}
		System.out.println("Матрица ");
		arrayPrint(arrayRandom);

	}

	// случайный 0 или 1
	public static int numberRand() {
		int i;
		double temp;
		Random rand = new Random();
		temp = rand.nextDouble();
		if (temp >= 0.5) {
			i = 1;
		} else {
			i = 0;
		}
		return i;
	}

	// печать массива
	public static void arrayPrint(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(" |" + array[i][j] + "| ");
			}
			System.out.println("  ");
		}
	}

	// случаное число не меньше 2-ух
	public static int nowRand() {
		int i;
		i = 0;
		Random rand = new Random();
		while (i < 2) {
			i = rand.nextInt(20);
		}
		return i;
	}

}
