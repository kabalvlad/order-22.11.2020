package by.lecttor.modul_02.one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

/*
 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
 */

public class Task_09 {

	public static void main(String[] args) {
		int n;
		int count; // счетчик числа
		int number; // число у которого максисмальный счетчик
		int countMax; // максимальный счетчик

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
		System.out.println("  ");

		countMax = 0; // задаю занчение максимального счетчика
		number = arrayNumber[0];

		for (int i = 0; i < arrayNumber.length; i++) { // перебираю числа массива
			count = 0;
			for (int j = 0; j < arrayNumber.length; j++) { // считаю сколько раз число есть в массиве
				if (arrayNumber[i] == arrayNumber[j]) {
					count++;
				}
				// System.out.print(" " + count + " ");

			}
			// System.out.println(" cчетчик ячеёки = " + i );
			if (count >= countMax) { //
				if (count == countMax) {
					number = Math.min(number, arrayNumber[i]);
				} else {
					number = arrayNumber[i];
				}
				countMax = count;
				// System.out.println(" Число: " + number + " Повторений: " + countMax);
			}

		}
		System.out.println(" Число: " + number + " Повторений: " + countMax);

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
