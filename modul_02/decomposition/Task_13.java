package by.lecttor.modul_02.decomposition;

import java.util.Scanner;

/*
13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
решения задачи использовать декомпозицию.
*/

public class Task_13 {

	public static void main(String[] args) {
		int n;

		System.out.print(" Введите число  n >> ");
		n = inputInt();
		n = control2(n);

		twins(n);
	}

	// Вывод чисел близнецов
	public static void twins(int n) {
		int k;
		int j;
		j = 0;
		k = 0;
		for (int i = n; i <= (2 * n); i++) {
			if (simpleNumber(i)) {
				k = i;
			}
			if ((k - 2) == j) {
				System.out.println("Числа близнецы " + j + " и " + k);
			}
			j = k;

		}

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
		return (per);
	}

	// проверка бчисло больше двух
	public static int control2(int x) {
		while (x <= 2) {
			System.out.print("Число должна быть больше 2, повторите ввод >> ");
			x = inputInt();
		}

		return x;
	}

}
