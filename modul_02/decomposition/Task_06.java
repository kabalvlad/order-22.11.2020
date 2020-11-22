package by.lecttor.modul_02.decomposition;

import java.util.Scanner;

//6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Task_06 {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		boolean chek;

		System.out.print("Введите  первое число >> ");
		x = inputNumber();
		System.out.print("Введите  второе число >> ");
		y = inputNumber();
		System.out.print("Введите  третье число >> ");
		z = inputNumber();

		chek = primeNumber(x, y, z);
		if (chek) {
			System.out.print("Данные числа " + x + " " + y + " " + z + " являются взаимно простыми");
		} else {
			System.out.print("Данные числа " + x + " " + y + " " + z + " НЕ являются взаимно простыми");
		}

	}

	// ввод числа инт
	public static int inputNumber() {
		Scanner in = new Scanner(System.in);
		int per;
		String i;
		while (!in.hasNextInt()) {
			System.out.print(" >> ");
			i = in.nextLine();
		}
		per = in.nextInt();
		return per;
	}

	// Метод по проверки являються ли числа взаимно простыми
	public static boolean primeNumber(int x, int y, int z) {
		int max;
		int i;
		int j;
		int k;
		boolean truthCheck; // для выбора ответа

		truthCheck = true;

		max = Math.max(Math.max(x, y), Math.max(y, z));

		for (int f = 2; f < (max / 2); f++) {
			i = x % f;
			j = y % f;
			k = z % f;
			if (i == 0 && j == 0 && k == 0) {
				truthCheck = false;
			}

		}

		return truthCheck;

	}

}
