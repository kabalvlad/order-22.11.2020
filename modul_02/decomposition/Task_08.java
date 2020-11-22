package by.lecttor.modul_02.decomposition;

import java.util.Scanner;

//8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//массива с номерами от k до m.

public class Task_08 {

	public static void main(String[] args) {

		int n;
		int sum;
		int k, j = 0;

		System.out.print("Введите размер массива >> ");
		n = inputINT();
		n = control3(n);
		System.out.println("----------------");

		int[] arraySum;
		arraySum = new int[n];

		for (int i = 0; i < n; i++) { // присвоение значений
			System.out.print("Введите число в ячейку №" + i + " >> ");
			arraySum[i] = inputINT();
		}

		// поиск ячеек от к до м
		System.out
				.print("Укажите номер ячейки k, для вычисления суммы трех последовательно расположенных элементов >> ");
		k = inputINT();
		k = controlK(k, n);

		sum = summer(arraySum[k], arraySum[k + 1], arraySum[k + 2]);
		System.out.println("Сумма трех последовательно расположенных элементов = " + sum);

	}

	// ввод числа инт
	public static int inputINT() {
		Scanner in = new Scanner(System.in);
		int per;
		String i;
		while (!in.hasNextInt()) {
			System.out.print("Неверно значение, поробуйте ещё >> ");
			i = in.nextLine();
		}
		per = in.nextInt();
		return per;

	}

	// сумма чисел
	public static int summer(int i, int j, int k) {
		int sum;
		sum = i + j + k;
		return sum;
	}

	// проверка на значение больше 3
	public static int control3(int x) {
		while (x <= 2) {
			System.out.print("Число точек должно быть больше 3, повторите ввод >> ");
			x = inputINT();
		}

		return x;
	}

	// проверка больше 0 и меньше n - 3
	public static int controlK(int x, int n) {
		boolean cheker;
		cheker = false;
		while (!cheker) {
		if (x >= 0 && x <= n - 3) {
			cheker = true;
		} else {
			System.out.println("Неверный номер ячейки, номер может быть от 0 до " + (n - 3));
			System.out.print("Повторите ввод >> ");
			x = inputINT();
		}
	}
	return x;
	}

}
