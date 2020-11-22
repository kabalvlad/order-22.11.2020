package by.lecttor.modul_02.one_dimensional_arrays;

import java.util.Scanner;

/*
4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

public class Task_04 {

	public static void main(String[] args) {

		int n;
		int iMax; // номер ячейки макс
		int iMin; // номер ячейки мин
		int max; // макс число
		int min; // мин число

		System.out.print(" Введите N, где N число ячеек в массиве >> ");
		n = inputInt();
		n = control0(n);

		int[] arrayNumber;
		arrayNumber = new int[n];

		System.out.println(" Заполните массив: ");
		for (int i = 0; i < n; i++) {
			System.out.print(" >> ");
			arrayNumber[i] = inputInt();
		}

		max = arrayNumber[0];
		min = arrayNumber[0];
		iMax = 0;
		iMin = 0;
		for (int i = 1; i < n; i++) {
			if (max >= arrayNumber[i]) {
				iMax = i;
				max = arrayNumber[i];
			}
			if (min <= arrayNumber[i]) {
				iMin = i;
				min = arrayNumber[i];
			}
		}
		arrayNumber[iMin] = max;
		arrayNumber[iMax] = min;

		for (int i = 0; i < n; i++) {
			System.out.print(arrayNumber[i] + " | ");
		}

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
		while (x <= 1) {
			System.out.print("Число должна быть больше 0, повторите ввод >> ");
			x = inputInt();
		}
		return x;
	}
}
