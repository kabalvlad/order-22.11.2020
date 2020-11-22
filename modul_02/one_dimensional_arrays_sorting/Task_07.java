package by.lecttor.modul_02.one_dimensional_arrays_sorting;
/*
 7. Пусть даны две неубывающие последовательности действительных чисел
a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Требуется указать те места, на которые 
нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_07 {
	public static void main(String[] args) {
		int a;
		int b;
		System.out.print(" Введите размер последовательности (а) >> ");
		a = inputIn();
		System.out.print(" Введите размер последовательности (b) >> ");
		b = inputIn();

		int[] arrayA;
		arrayA = new int[a];
		int[] arrayB;
		arrayB = new int[b];

		arrayA = arrayValue(arrayA);
		arrayB = arrayValue(arrayB);
		System.out.println(" ");
		System.out.print("Последовательность A");
		arrayPrint(arrayA);
		System.out.println(" ");
		System.out.print("Последовательность B");
		arrayPrint(arrayB);
		selection(arrayA, arrayB);

	}

	//
	public static void selection(int[] array1, int[] array2) {
		System.out.println(" ");
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] <= array1[0]) {
				System.out.println(" Число " + array2[i] + " небходимо встаивть до числа " + array1[0]);
			}
			if (array2[i] >= array1[array1.length - 1]) {
				System.out.println(
						" Число " + array2[i] + " небходимо встаивть после числа " + array1[array1.length - 1]);
			}
			for (int j = 1; j < array1.length - 1; j++) {
				if (array2[i] < array1[j] && array2[i] > array1[j - 1]) {
					System.out.println(
							" Число " + array2[i] + " небходимо встаивть между " + array1[j - 1] + " и " + array1[j]);
				}
				if (array2[i] == array1[j]) {
					System.out.println(" Число " + array2[i] + " небходимо встаивть между " + array1[j - 1] + " и "
							+ array1[j] + " или " + array1[j] + " и " + array1[j+1]);
				}
			}

		}

	}

	// Печать массива
	public static void arrayPrint(int[] array) {
		System.out.println(" ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	// Заполнение массива
	public static int[] arrayValue(int[] array) {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(20);
		}
		Arrays.parallelSort(array);
		// arrayPrint(array);
		return array;
	}

	// Ввод числа
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
		while (x <= 1) {
			System.out.print("Число должна быть больше 1, повторите ввод >> ");
			x = inputInt();
		}
		return x;
	}

}
