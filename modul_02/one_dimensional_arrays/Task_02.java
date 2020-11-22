package by.lecttor.modul_02.one_dimensional_arrays;

import java.util.Scanner;

/*
  2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.
 */

public class Task_02 {

	public static void main(String[] args) {
		int n;
		int z;
		int count;

		count = 0;

		System.out.print(" Введите N, где N число ячеек в массиве >> ");
		n = inputInt();
		n = control0(n);

		System.out.print(" Введите Z >> ");
		z = inputInt();

		int[] arrayNumber;
		arrayNumber = new int[n];

		System.out.println(" Заполните массив: ");
		for (int i = 0; i < n; i++) {
			System.out.print(" >> ");
			arrayNumber[i] = inputInt();
		}

		for (int i = 0; i < n; i++) {
			if (arrayNumber[i] > z) {
				arrayNumber[i] = z;
				count++;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arrayNumber[i] + " | ");
		}
		System.out.print(" Количество замен " + count);

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
		while (x <= 0) {
			System.out.print("Число должна быть больше 0, повторите ввод >> ");
			x = inputInt();
		}
		return x;
	}

}
