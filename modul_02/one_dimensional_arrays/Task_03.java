package by.lecttor.modul_02.one_dimensional_arrays;

import java.util.Scanner;

/*
3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
 */

public class Task_03 {

	public static void main(String[] args) {

		int n;
		int z;
		int countSouth;
		int countNorth;
		int countZero;

		countSouth = 0;
		countNorth = 0;
		countZero = 0;

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

		for (int i = 0; i < n; i++) {
			if (arrayNumber[i] > 0) {
				countSouth++;
			}
			if (arrayNumber[i] == 0) {
				countZero++;
			}
			if (arrayNumber[i] < 0) {
				countNorth++;
			}
		}
		System.out.println("Положительных элемнтов " + countSouth);
		System.out.println("Отрицательных элементов " + countNorth);
		System.out.println("Нулевых элементов " + countZero);

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
