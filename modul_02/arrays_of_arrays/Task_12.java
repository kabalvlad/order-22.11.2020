package by.lecttor.modul_02.arrays_of_arrays;

import java.util.Random;
import java.util.Scanner;

/*
 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class Task_12 {

	public static void main(String[] args) {

		int n;
		int p;

		System.out.print(" Введите число строк матрицы (n) >> ");
		n = inputIn();
		System.out.print(" Введите число столбцов матрицы (p) >> ");
		p = inputIn();

		Random rand = new Random();

		int[][] arrayNumber;
		arrayNumber = new int[n][p];

		System.out.println("Исходная матрица ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < p; j++) {
				arrayNumber[i][j] = (rand.nextInt(10) * 2 - 10);
				System.out.print(" |" + arrayNumber[i][j] + "| ");
			}
			System.out.println("  ");
		}

		lineArrayUp(arrayNumber);
		System.out.println("Матрица: строки возрастанют");
		arrayPrint(arrayNumber);
		lineArrayDown(arrayNumber);
		System.out.println("Матрица: строки убывают");
		arrayPrint(arrayNumber);

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

	// сортировка на возрастание
	public static int[][] lineArrayUp(int array[][]) {
		int temp; // временное занчение

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = j + 1; k < array[i].length; k++) {
					if (array[i][j] > array[i][k]) {
						temp = array[i][j];
						array[i][j] = array[i][k];
						array[i][k] = temp;
					}
				}
			}

		}
		return array;
	}

	// cортировка на убывание
	public static int[][] lineArrayDown(int array[][]) {
		int temp; // временное занчение

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = j + 1; k < array[i].length; k++) {
					if (array[i][j] < array[i][k]) {
						temp = array[i][j];
						array[i][j] = array[i][k];
						array[i][k] = temp;
					}
				}
			}
		}
		return array;
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
