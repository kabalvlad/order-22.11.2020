package by.lecttor.modul_02.arrays_of_arrays;

/*
 * 7. Сформировать квадратную матрицу порядка N по правилу: 
 * и подсчитать количество положительных элементов в ней
 */

import java.util.Scanner;

public class Task_07 {

	public static void main(String[] args) {
		int n;
		int count;

		count = 0;

		System.out.print(" Введите размер квадратной матрицы (n) >> ");
		n = inputIn();

		double[][] arrayNumber;
		arrayNumber = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arrayNumber[i][j] = matrixSin(i, j, n);
			}
		}

		System.out.println(" Матрица ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arrayNumber[i][j] >= 0) {
					count++;
				}
				System.out.print(" |" + arrayNumber[i][j] + "| ");
			}
			System.out.println(" ");
		}
		System.out.print(" Количество положительных элементов в матрице " + count);

	}

	// расчёт занчения ячйки
	public static double matrixSin(int i, int j, int n) {
		double A;
		A = Math.sin((Math.sqrt(j) - Math.sqrt(i)) / n);
		return A;
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
