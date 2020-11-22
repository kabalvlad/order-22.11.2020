package by.lecttor.modul_02.decomposition;

import java.util.Scanner;

/*
14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию.
*/

public class Task_14 {

	public static void main(String[] args) {
		int k;

		System.out.print(" Введите число  k >> ");
		k = inputInt();
		k = control1(k);

		System.out.println(" Числа Армстронга в промежутке от 1 до " + k + " являются: ");
		armstrongNumber(k);
	}

	// основвной метод
	public static void armstrongNumber(int k) {
		int ost;
		double sum;
		int count;
		int j;

		for (int i = 2; i <= k; i++) {
			count = 0;
			sum = 0;
			j = i;
			while (j != 0) {
				j = j / 10;
				count++;
			}
			j = i;
			while (j != 0) {
				ost = j % 10;
				sum = sum + Math.pow(ost, count);
				j = j / 10;
			}

			j = i;
			if (i == sum) {
				System.out.print(i + " ");
			}
		}
	}

	// проверка числа больше одного
	public static int control1(int x) {
		while (x <= 1) {
			System.out.print("Число должна быть больше 1, повторите ввод >> ");
			x = inputInt();
		}

		return x;
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
		return (per);
	}
}
