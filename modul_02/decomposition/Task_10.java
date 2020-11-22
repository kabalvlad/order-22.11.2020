package by.lecttor.modul_02.decomposition;

import java.util.Scanner;

//10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
//являются цифры числа N.

public class Task_10 {

	public static void main(String[] args) {

		int n;
		int k;
		int j;

		System.out.print("Введите натуральное число >>  ");
		n = inputInt();
		n = controlZero(n);
		System.out.println("Ваше натуральное число " + n);

		k = countNumber(n);

		int[] arrayNumberN;
		arrayNumberN = new int[k];

		for (int i = (k - 1); i >= 0; i--) {
			j = restNumber(n);
			arrayNumberN[i] = j;
			n /= 10;

		}

		for (int i = 0; i < k; i++) {
			System.out.println("Ячейка " + i + " число в ней " + arrayNumberN[i]);
		}

	}

	// остаток от деления
	public static int restNumber(int x) {
		x %= 10;
		return x;
	}

	// щетчик ячеек
	public static int countNumber(int n) {
		int count;
		count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	// Получение и проверка числа (int)
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

	// проверка на значение больше 0
	public static int controlZero(int x) {
		while (x < 0) {
			System.out.print("Повторите ввод >> ");
			x = inputInt();
		}

		return x;
	}

}
