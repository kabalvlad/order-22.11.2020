package by.lecttor.modul_02.decomposition;

import java.util.Scanner;

/*
16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
*/

public class Task_16 {

	public static void main(String[] args) {
		int n;

		System.out.print(" Введите n >> ");
		n = inputInt();
		n = control0At10(n);
		summ(n);

	}

	//
	public static void summ(int n) {
		int j; // переменная для минимального числа
		long sum; // сумма нечентных чисел
		long k; // поиск четных чисел
		int count; // счетчик четных чисел

		j = 1;
		sum = 0;
		count = 0;

		for (int i = 1; i < n; i++) { // нахожу минимальное число с которого идёт проверка
			j = j * 10;
		}
		for (int i = j; i < j * 10; i++) { // поиск суммы нечетных чисел
			if (i % 2 != 0) {
				sum += i;
			}
		}
		k = sum;
		while (k != 0) { // посик четных чисел в сумме
			if (k % 2 == 0) {
				count++;
			}
			k /= 10;
		}
		System.out.println("Сумма нечетных чисел = " + sum);
		System.out.println("Число четных цифр в найденной сумме = " + count);

	}

	// проверка числа больше 0 и меньше 10
	public static int control0At10(int x) {
		while (x <= 0 || x >= 10) {
			System.out.print("Число должна быть больше 0 и меньше 10, повторите ввод >> ");
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
		return per;
	}

}
