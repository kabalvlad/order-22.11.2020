package by.lecttor.modul_02.arrays_of_arrays;

import java.util.Random;
import java.util.Scanner;

/*
 16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
...,  n2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат.
 */
public class Task_16 {

	public static void main(String[] args) {

		int n;
		int k; // временная переменная
		int sumMagik;
		boolean cheak;

		System.out.print(" Введите размер квадратной матрицы (n) >> ");
		n = inputIn();

		sumMagik = (int) ((n * (Math.pow(n, 2) + 1)) / 2);
		System.out.println("Сумма маджик квадрата " + sumMagik);

		int[][] arrayNumber;
		arrayNumber = new int[n][n];

		int[] arrayValue;
		arrayValue = new int[n * n];

		k = 1;
		System.out.println("Матрица значений ");
		for (int i = 0; i < arrayValue.length; i++) {
			arrayValue[i] = k;
			k++;
			System.out.print(" |" + arrayValue[i] + "| ");
		}
		System.out.println("  ");

		arrayNumber = fillArray(arrayNumber, arrayValue);
		cheak = chekArray(arrayNumber, sumMagik);

		while (cheak) {
			k = 1;
			for (int i = 0; i < arrayValue.length; i++) {
				arrayValue[i] = k;
				k++;
			}
			arrayNumber = fillArray(arrayNumber, arrayValue);
			cheak = chekArray(arrayNumber, sumMagik);
		}

	}

	// ----------------------------------------------------------------------------------
	// Методы
	// ---------------------------------------------------------------------------------

	// Проверка условия квадрата
	public static boolean chekArray(int[][] array, int sum) {
		boolean event = false;
		int[] arSum = controlSum(array); // подсчёт суммы ячеек
		for (int n = 0; n < arSum.length; n++) {
			if (arSum[n] != sum) {
				event = true;
			}
		}
		if (!event) {
			System.out.println(" ");
			System.out.println("Магичский квадрат");
			arrayPrint(array);
		} 
		if(event) {
			System.out.println(" ");
			System.out.println("Ложный квадрат");
			arrayPrint(array);
		}
		

		return event;
	}

	// заполнение массива случайно
	public static int[][] fillArray(int[][] array, int[] arrayV) {
		boolean event = false;
		int k;
		Random rand = new Random();

		k = rand.nextInt(arrayV.length - 1);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = arrayV[k];
				arrayV[k] = -1;
				for (int n = 0; n < arrayV.length; n++) {
					if (arrayV[n] != -1) {
						event = true;
					}
				}
				if (event) {
					while (arrayV[k] == -1) {
						k = rand.nextInt(arrayV.length);
						event = false;
					}
				}
			}
		}

		return array;
	}

	// подсчет суммы для магического квадрата
	public static int[] controlSum(int[][] array) {
		int sum;
		int countSum; // для заполнения массива суммы
		int[] arraySum;

		countSum = 0;

		arraySum = new int[(array.length * 2) + 2];
		// сумма строк
		for (int i = 0; i < array.length; i++) {
			sum = 0;
			for (int j = 0; j < array.length; j++) {
				sum += array[i][j];
			}
			arraySum[countSum] = sum;
			countSum++;
		}
		// сумма столбцов
		for (int i = 0; i < array.length; i++) {
			sum = 0;
			for (int j = 0; j < array.length; j++) {
				sum += array[j][i];
			}
			arraySum[countSum] = sum;
			countSum++;
		}
		// сумма первой диагонали
		sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i][i];
		}
		arraySum[countSum] = sum;
		countSum++;

		// сумма второй диагонали
		sum = 0;
		int j;
		j = (array.length - 1);
		for (int i = 0; i < array.length; i++) {
			sum += array[i][j];
			j--;
		}
		arraySum[countSum] = sum;

		return arraySum;

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
		while (x <= 2) {
			System.out.print("Число должна быть больше 2, повторите ввод >> ");
			x = inputInt();
		}
		return x;
	}
}
