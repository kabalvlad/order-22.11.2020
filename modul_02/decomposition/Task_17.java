package by.lecttor.modul_02.decomposition;

import java.util.Scanner;

/*
17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
*/

public class Task_17 {

	public static int count = 0; // счетчик для зачачи глобальная переменная

	public static void main(String[] args) {
		int n;

		System.out.print("Введите число n >> ");
		n = inputInt();
		n = control0(n);

		zero(n);
		System.out.println(
				count + " - количество вычеслений необходими провести чтоб получилось из числа " + n + " число  0");

	}

	public static void zero(int i) {
		int j; // для вычесленяи суммы цифр
		int sum; // сумма цифр числа
		int k; // прирочщение к сумме

		while (i > 0) {
			j = i;
			sum = 0;
			while (j > 0) {
				k = j % 10;
				sum += k;
				j /= 10;
			}
			// System.out.println( i + " = i " + sum + " = sum");
			i = i - sum;
			count++;
		}
		return;
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

	// проверка числа больше 0 и меньше 10
	public static int control0(int x) {
		while (x <= 0) {
			System.out.print("Число должна быть больше 0, повторите ввод >> ");
			x = inputInt();
		}
		return x;
	}

}
