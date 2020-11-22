package by.lecttor.modul_02.one_dimensional_arrays_sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
 */

public class Task_01 {
	public static void main(String[] args) {
		int l;
		int n;
		int k;

		System.out.print(" Введите размер первого массива (l) >> ");
		l = inputIn();
		System.out.print(" Введите размер второго массива (n) >> ");
		n = inputIn();
		while (n == l) {
			System.out.print(" Размеры массивов совпадают введите другое число >> ");
			n = inputIn();
		}
		System.out.print(" Введите натуральное число (k) >> ");
		k = inputIn();
		while (k >= l) {
			System.out.print("(k) не может быть больше длинны первого массива, введите другое число >> ");
			k = inputIn();
		}

		int[] arrayL;
		int[] arrayN;

		arrayL = new int[l];
		arrayN = new int[n];

		arrayL = arrayValue(arrayL);
		arrayN = arrayValue(arrayN);

		arrayPrint(arrayL);
		arrayPrint(arrayN);

		arrayL = arraySum(arrayL, arrayN, k);

	}

	public static int[] arraySum(int[] array1, int[] array2, int k1) {
		int newLength;
		int n1 = array1.length;

		newLength = array1.length + array2.length;
		array1 = Arrays.copyOf(array1, newLength);
		// arrayPrint(array1);
		for (int i = (array1.length - 1); i > (k1 + array2.length - 1); i--) {
			array1[i] = array1[n1 - 1];
			n1--;
		}
		// arrayPrint(array1);
		int j = 0;
		for (int i = k1; i < (k1 + array2.length); i++) {
			array1[i] = array2[j];
			j++;
		}
		arrayPrint(array1);
		return array1;
	}

	public static void arrayPrint(int[] array) {
		System.out.println(" ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static int[] arrayValue(int[] array) {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(9);
		}
		return array;
	}

	public static int inputIn() {
		int k;
		k = inputInt();
		k = control0(k);
		System.out.println(" ");
		return k;
	}

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

	public static int control0(int x) {
		while (x <= 0) {
			System.out.print("Число должна быть больше 0, повторите ввод >> ");
			x = inputInt();
		}
		return x;
	}

}
