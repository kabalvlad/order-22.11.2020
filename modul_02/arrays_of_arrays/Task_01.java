package by.lecttor.modul_02.arrays_of_arrays;

import java.util.Scanner;
import java.util.Random;

/*
Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего. 
 */

public class Task_01 {

	public static void main(String[] args) {
		int n; // строки
		int o; // столбцы

		Random rand = new Random();

		System.out.print("Введите число строк N >> ");
		n = inputIn();
		System.out.print("Введите число столбцов O >> ");
		o = inputIn();

		int[][] arrayNumber;
		arrayNumber = new int[n][o];

		System.out.println(" Матрица ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < o; j++) {
				arrayNumber[i][j] = (rand.nextInt(100) * 2 - 100);
				System.out.print(" |" + arrayNumber[i][j] + "| ");
			}
			System.out.println(" ");
		}

		System.out.println(" Нечетные столбцы, у которых первый элемент больше последнего. ");
		for (int i = 1; i < o; i = i + 2) {
			if (arrayNumber[0][i] > arrayNumber[n - 1][i]) {
				for (int j = 0; j < n; j++) {
					System.out.println(" |" + arrayNumber[j][i] + "| ");
				}
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
