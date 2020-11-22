package by.lecttor.modul_02.one_dimensional_arrays_sorting;

import java.util.Random;
import java.util.Scanner;

/*
6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1, 
то продвигаются на один элемент вперед. Если ai > ai+1, то производится перестановка и
 сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
 */

public class Task_06 {
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
		arrayA = selectionShella(arrayA);
		System.out.println(" ");
		System.out.print("Последовательность измененая ");
		arrayPrint(arrayA);
	}

	//
	public static int[] selectionShella(int[] array) {
		int gap;
		int value;
		gap = array.length / 2;

		while (gap >= 1) {
			for (int i = 0; i < array.length; i++) {
				for (int j = i - gap; j >= 0; j -= gap) {
					if (array[j] > array[j + gap]) {
						value = array[j];
						array[j] = array[j + gap];
						array[j + gap] = value;
					}

				}
			}
			gap = gap / 2;

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
		while (x <= 2) {
			System.out.print("Число должна быть больше 2, повторите ввод >> ");
			x = inputInt();
		}
		return x;
	}

}
