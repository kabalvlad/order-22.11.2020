package by.lecttor.modul_02.one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

/*
 7. Даны действительные числа:
a1 a2 .... an
 Найти max( , , , ) a1 + a2n a2 + a2n−1  an + an+1
 */

public class Task_07 {

	public static void main(String[] args) {
		int n;
		int j; // для записи номера числа
		double max; // максимальное занчение
		double next; // значение для сравнения

		Random rand = new Random();

		System.out.print(" Введите N, где N число дествительных чисел >> ");
		n = inputInt();
		n = control0(n);

		double[] arrayNumber;
		arrayNumber = new double[n];

		for (int i = 0; i < arrayNumber.length; i++) {
			arrayNumber[i] = (rand.nextDouble() * 200 - 100);
			System.out.print("Число №" + (i + 1) + " ");
			System.out.printf("%.3f", arrayNumber[i]);
			System.out.println(" ");
		}

		max = arrayNumber[0] + arrayNumber[1];
		j = 0;
		for (int i = 1; i < (arrayNumber.length - 1); i++) {
			next = arrayNumber[i] + arrayNumber[i + 1];
			if (next > max) {
				max = next;
				j = i;
			}
		}
		System.out.print(" Максимум явлется сумма чисел " + (j + 1) + " и " + (j + 2) + " ");
		System.out.printf("%.3f", max);

	}

	// проверка простое число или нет
	public static boolean simpleNumber(int n) {
		int j;
		boolean simp;
		simp = true;
		for (int i = 2; i < n; i++) {
			j = n % i;
			if (j == 0) {
				simp = false;
				break;
			}
		}
		return (simp);
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
