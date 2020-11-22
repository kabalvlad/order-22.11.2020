package by.lecttor.modul_02.arrays_of_arrays;

import java.util.Scanner;
import java.util.*;

/*
 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры
 */

public class Task_08 {

	public static void main(String[] args) {
		int n;
		int p;
		int P1;
		int P2;

		Random rand = new Random();

		System.out.print(" Введите число строк матрицы (n) >> ");
		n = inputIn();
		System.out.print(" Введите число столбцов матрицы (p) >> ");
		p = inputIn();
		System.out.print(" Введите первый номер замены (Р1) >> ");
		P1 = inputIn(p);
		System.out.print(" Введите второй номер замены (Р2) >> ");
		P2 = inputIn(p);

		int[][] arrayNumber;
		arrayNumber = new int[p][n];

		System.out.println("Исходная матрица ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < p; j++) {
				arrayNumber[j][i] = rand.nextInt(20);
				System.out.print(" |" + arrayNumber[j][i] + "| ");
			}
			System.out.println(" ");
		}

		int[] arrayP1;
		int[] arrayP2;
		arrayP1 = new int[p];
		arrayP2 = new int[p];

		arrayP1 = arrayCopi(arrayNumber, P1, n);
		arrayP2 = arrayCopi(arrayNumber, P2, n);

		arrayNumber = arrayInsert(arrayP1, arrayNumber, P2);
		arrayNumber = arrayInsert(arrayP2, arrayNumber, P1);

		System.out.println("Конечная матрица ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < p; j++) {
				System.out.print(" |" + arrayNumber[j][i] + "| ");
			}
			System.out.println(" ");
		}
	}

	// вставка копированого массива
	public static int[][] arrayInsert(int[] j, int[][] k, int p) {
		for (int i = 0; i < j.length; i++) {
			k[p][i] = j[i];
		}
		return k;
	}

	// копирование нужных столбцов
	public static int[] arrayCopi(int[][] j, int p, int n) {
		int[] l = new int[n];
		for (int i = 0; i < l.length; i++) {
			l[i] = j[p][i];
		}
		return l;
	}

	// Ввод числа
	public static int inputIn() {
		int k;
		k = inputInt();
		k = control0(k);
		System.out.println(" ");
		return k;
	}

	public static int inputIn(int i) {
		int k;
		k = inputInt();
		k = control0(k, i);
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

	// проверка числа
	public static int control0(int x, int i) {
		while (x < 0 || x >= i) {
			System.out.print("Число должна быть больше -1 и меньше " + i + " , повторите ввод >> ");
			x = inputInt();
		}
		return x;
	}

}
