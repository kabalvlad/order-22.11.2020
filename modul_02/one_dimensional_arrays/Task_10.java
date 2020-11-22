package by.lecttor.modul_02.one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

/*
 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */

public class Task_10 {
	public static void main(String[] args) {

		int n;

		Random rand = new Random();

		System.out.print(" Введите n, где n число чисел массива >> ");
		n = inputInt();
		n = control0(n);

		int[] arrayNumber;
		arrayNumber = new int[n];

		for (int i = 0; i < arrayNumber.length; i++) { // заполнение массива случайными числами
			arrayNumber[i] = (rand.nextInt(10));
			System.out.print(" " + arrayNumber[i]);

		}

		for (int i = 0; i < arrayNumber.length; i = i + 2) { // заполнение массива нулями
			arrayNumber[i] = 0;
		}

		System.out.println(" ");
		for (int i = 0; i < arrayNumber.length; i++) {
			System.out.print(" " + arrayNumber[i]);
		}

	}

	// ввод числа
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

	// проверка числа больше 0
	public static int control0(int x) {
		while (x <= 0) {
			System.out.print("Число должна быть больше 0, повторите ввод >> ");
			x = inputInt();
		}
		return x;
	}
}
