package by.lecttor.modul_02.decomposition;

import java.util.Scanner;

//Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N.

public class Task_12 {
	public static void main(String[] args) {

		int k;
		int n;

		System.out.print("Введите число K >> ");
		k = inputInt();
		System.out.print("Введите число N >> ");
		n = inputInt();
		

		int[] mas;
		mas = getArray(k, n);

		System.out.println("Результат:");
		// System.out.println(Arrays.toString(mas));
		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}
		System.out.println("Длина массива: " + mas.length);

	}

	// Получение и проверка числа (int)
	public static int inputInt() {
		int per;
		String i;
		Scanner in = new Scanner(System.in);
		while (!in.hasNextInt()) {
			System.out.print(" >> ");
			i = in.nextLine();
		}
		per = in.nextInt();
		return (per);
	}

	// получение массива
	public static int[] getArray(int k, int n) {
		int[] arr = new int[1000];
		int counter = 0;

		for (int i = 0; i <= n; i++) {
			if (sumOfDigits(i) == k) {
				arr[counter] = i;
				counter++;
				if (counter >= arr.length) {
					arr = setSizeOfArray(arr, arr.length + 1000);
				}
			}
		}

		arr = setSizeOfArray(arr, counter);

		return arr;
	}

	// подсчет суммы цифр
	public static int sumOfDigits(int n) {
		int sum = 0;

		while (n > 0) {
			sum = sum + (n % 10);
			n = n / 10;
		}

		return sum;
	}

	// Изменение размера массива
	public static int[] setSizeOfArray(int[] array, int newLength) {
		int[] newArray;
		try {
			newArray = new int[newLength];
		} catch (OutOfMemoryError e) {
			e.printStackTrace();
			return array;
		}

		if (newLength > array.length) {
			newLength = array.length;
		}

		for (int i = 0; i < newLength; i++) {
			newArray[i] = array[i];
		}

		return newArray;
	}
}
