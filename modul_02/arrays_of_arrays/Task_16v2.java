package by.lecttor.modul_02.arrays_of_arrays;

/*
16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
...,  n2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат.
*/

import java.util.Scanner;

public class Task_16v2 {
	public static void main(String[] args) {
		int n;

		System.out.print(" Введите размер квадратной матрицы (n) >> ");
		n = inputIn();

		int[][] arr = new int[n][n];

		magicMatrix(arr);
		outputArr(arr);
	}

	public static void outputArr(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void magicMatrix(int[][] arr) {
		int currentIndexI = 0;
		int currentIndexJ = arr.length / 2;

		int[] arrNewBuff = new int[2];
		for (int currentValue = 1; currentValue <= (int) (Math.pow(arr.length, 2)); currentValue++) {
			arr[currentIndexI][currentIndexJ] = currentValue;

			if (currentValue == (int) (Math.pow(arr.length, 2))) {
				break;
			}
			arrNewBuff = findCurrentIndex(arr, currentIndexI, currentIndexJ);
			currentIndexI = arrNewBuff[0];
			currentIndexJ = arrNewBuff[1];

		}

	}

	public static int[] findCurrentIndex(int[][] arr, int isIndexI, int isIndexJ) {
		int indexI = isIndexI - 1;
		int indexJ = isIndexJ + 1;
		int[] arrBuff = new int[2];

		if (indexI < 0 && indexJ < arr.length) {
			indexI = arr.length - 1;
			indexJ = isIndexJ + 1;
			arrBuff[0] = indexI;
			arrBuff[1] = indexJ;
		}
		if (indexI >= 0 && indexJ >= arr.length) {
			indexI = isIndexI - 1;
			indexJ = 0;
			arrBuff[0] = indexI;
			arrBuff[1] = indexJ;
		}
		if (indexI < 0 && indexJ >= arr.length) {
			indexI = isIndexI + 1;
			indexJ = isIndexJ - 1;
			arrBuff[0] = indexI;
			arrBuff[1] = indexJ;
		}
		if (arr[indexI][indexJ] != 0) {
			indexI = isIndexI + 1;
			indexJ = isIndexJ;
			arrBuff[0] = indexI;
			arrBuff[1] = indexJ;
		}
		if (arr[indexI][indexJ] == 0) {
			arrBuff[0] = indexI;
			arrBuff[1] = indexJ;
			return arrBuff;
		}
		return arrBuff;
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
		while (x <= 2) {
			System.out.print("Число должна быть больше 2, повторите ввод >> ");
			x = inputInt();
		}
		return x;
	}
}
