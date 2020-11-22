package by.lecttor.modul_02.decomposition;

import java.util.Scanner;

public class Task_05 {

//  Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
// которое меньше максимального элемента массива, но больше всех других элементов).

	public static void main(String[] args) {
		int n;
		int max;
		int min;
		int num;

		System.out.print("Введите количество чисел в массиве >> ");
		n = inputINT();
		n = control3(n);
		System.out.println("----------------");

		int[] numberArray;
		numberArray = new int[n];

		System.out.println("ЗАПОЛНИТЕ МАССИВ ");
		System.out.println("----------------");
		for (int i = 0; i < n; i++) {
			System.out.print("Введите число >> ");
			numberArray[i] = inputNumber();
			System.out.println("     ");
		}

		// находим минимальное занчение
		min = numberArray[0];
		for (int i = 0; i < n; i++) {
			min = comparison(numberArray[i], min);
		}

		// находим максимальное значение
		max = numberArray[0];
		for (int i = 0; i < n; i++) {
			max = comparison(numberArray[i], max, min); // переменная мин нужна для работы правильной работы методов
		}
		// System.out.println("max - " + max + " min - " + min); // для проверки
		// значений

		System.out.println("----------------");

		// находим ответ
		num = min;
		for (int i = 0; i < n; i++) {
			num = comparison(numberArray[i], num, min, max);

		}

		System.out.println("----------------");
		System.out.println("Вторым максимальным числом является " + num);
		System.out.println("----------------");
	}

	// ввод числа инт
	public static int inputINT() {
		Scanner in = new Scanner(System.in);
		int per;
		String i;
		while (!in.hasNextInt()) {
			System.out.print("Введите число >> ");
			i = in.nextLine();
		}

		per = in.nextInt();
		return per;

	}

	// ввод числа инт в массив
	public static int inputNumber() {
		Scanner in = new Scanner(System.in);
		int per;
		String i;
		while (!in.hasNextInt()) {
			System.out.print("Введите число >> ");
			i = in.nextLine();
		}
		per = in.nextInt();
		return per;
	}

	// поиск мин занчения массива
	public static int comparison(int x, int y) {
		int per;
		per = Math.min(y, x);
		return per;
	}

	// поиск макс значения из массива
	public static int comparison(int x, int y, int min) {
		int per;
		per = Math.max(y, x);
		return per;
	}

	// поиск второго максимального значения из массива
	public static int comparison(int x, int y, int min, int max) {
		int per;
		if (x == max) { // исключаем максимальное занчение
			per = y;
		} else {
			per = Math.max(y, x);
		}
		return per;
	}

	// проверка на значение больше 3
	public static int control3(int x) {
		while (x <= 2) {
			System.out.print("Число точек должно быть больше 3, повторите ввод >> ");
			x = inputINT();
		}

		return x;
	}

}
