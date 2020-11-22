package by.lecttor.modul_02.one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

/*
 8. Дана последовательность целых чисел (a1 a2 .... an).
  Образовать новую последовательность, выбросив из исходной те члены,
   которые равны min( a1 a2 ..... an).
 */

public class Task_08 {

	public static void main(String[] args) {
		int n;
		int minInt;
		int j; // для поиска номера минимальной позиции

		Random rand = new Random();

		System.out.print(" Введите N, где N число чисел >> ");
		n = inputInt();
		n = control0(n);

		int[] arrayNumber;
		arrayNumber = new int[n];

		for (int i = 0; i < arrayNumber.length; i++) {
			arrayNumber[i] = (rand.nextInt(20));
			System.out.print(" "+arrayNumber[i]);
		}
		minInt = arrayNumber[0];

		for (int i = 0; i < arrayNumber.length; i++) {
			minInt = Math.min(minInt, arrayNumber[i]);

		}
		System.out.println(" ");
		System.out.println(" Новая последовательность :");
		for (int i = 0; i < arrayNumber.length; i++) {
			if (minInt != arrayNumber[i]) {
				System.out.print(" " + arrayNumber[i]);
			}
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

	// проверка числа больше 1
	public static int control0(int x) {
		while (x <= 1) {
			System.out.print("Число должна быть больше 1, повторите ввод >> ");
			x = inputInt();
		}
		return x;
	}

}
