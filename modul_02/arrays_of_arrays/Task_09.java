package by.lecttor.modul_02.arrays_of_arrays;

import java.util.Random;
import java.util.Scanner;

/*
9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
 */

public class Task_09 {

	public static void main(String[] args) {
		int n;
		int p;
		int sum;
		int max;
		int index;

		Random rand = new Random();

		System.out.print(" Введите число строк матрицы (n) >> ");
		n = inputIn();
		System.out.print(" Введите число столбцов матрицы (p) >> ");
		p = inputIn();

		int[][] arrayNumber;
		arrayNumber = new int[p][n];

		System.out.println("Матрица ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < p; j++) {
				arrayNumber[j][i] = rand.nextInt(10);
				System.out.print(" |" + arrayNumber[j][i] + "| ");
			}
			System.out.println(" ");
		}
		
		index = 0;
		sum = 0;
		max = 0;
		for (int i = 0;  i < p; i++) {	
			for (int j = 0; j < n; j++) {
				sum += arrayNumber[i][j];
			}
			if (sum>max) { 
				max = sum;
				index = i;
			}
			sum = 0;
		}
		System.out.println("В " + (index+1)  + " столбце максимальная сумма всех элементов, она равна " + max);

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
