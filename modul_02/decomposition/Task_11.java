package by.lecttor.modul_02.decomposition;

import java.util.Scanner;

//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Task_11 {

	public static void main(String[] args) {

		int n;
		int k;
		int countN;
		int countK;

		System.out.print("Введите первое число >>  ");
		n = inputInt();
		System.out.print("Введите второе число >>  ");
		k = inputInt();

		countN = countNumber(n);
		countK = countNumber(k);

		simile(n, k, countN, countK);

	}

	// получение числа
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

	//
	public static void simile(int n, int k, int countN, int countK) {
		if (countN > countK) {
			System.out.println(" В числе " + n + " больше цифр чем в числе " + k);
		}
		if (countN < countK) {
			System.out.println(" В числе " + k + " больше цифр чем в числе " + n);
		}
		if (countN == countK) {
			System.out.println(" В числе " + n + " и " + k + " одинаковое число цифр");
		}
		return;

	}

}