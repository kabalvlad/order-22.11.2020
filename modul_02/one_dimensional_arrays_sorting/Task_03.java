package by.lecttor.modul_02.one_dimensional_arrays_sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an. Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
*/

public class Task_03 {

	public static void main(String[] args) {
		int a;

		System.out.print(" Введите размер последовательности (а) >> ");
		a = inputIn();

		int[] arrayA;
		arrayA = new int[a];

		arrayA = arrayValue(arrayA);
		System.out.println(" ");
		System.out.print("Последовательность ");
		arrayPrint(arrayA);
		arrayA = selectionSort(arrayA);
		System.out.println(" ");
		System.out.print("Последовательность измененая ");
		arrayPrint(arrayA);
	}

	// сортировка выбором
	public static int[] selectionSort(int[] array) {
		int valueMax;
		int valueNext;
		int sellNumberMax;

		for (int i = 0; i < (array.length); i++) {
			valueMax = array[i];
			sellNumberMax = i;
			for (int j = i; j < (array.length); j++) {
				if (array[j] > valueMax) {
					sellNumberMax = j;
					valueMax = array[j];
				}
			}
			valueNext = array[i];
			array[i] = valueMax;
			array[sellNumberMax] = valueNext;
		}
		return array;
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
			array[i] = rand.nextInt(100);
		}
		//arrayPrint(array);
		Arrays.parallelSort(array);
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
		while (x <= 0) {
			System.out.print("Число должна быть больше 0, повторите ввод >> ");
			x = inputInt();
		}
		return x;
	}

}
