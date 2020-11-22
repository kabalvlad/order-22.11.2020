package by.lecttor.modul_02.one_dimensional_arrays_sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 4. Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= an.
Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа  ai и ai+1.
Если ai > ai+1 , то делается перестановка. Так продолжается до тех пор,
 пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок
 */

public class Task_04 {
	public static int count = 0;

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
		arrayA = selectionSwap(arrayA);
		System.out.println(" ");
		System.out.print("Последовательность измененая ");
		arrayPrint(arrayA);
		System.out.println(" ");
		System.out.println("Количество перестановок " + count);

	}

	public static int[] selectionSwap(int[] array) {
		int valueMax;
		int valueMin;
		int arrLenght;
		int j;

		j = 1;
		arrLenght = array.length;

		while (arrLenght > 1) {
			j = 1;
			for (int i = 0; i < (array.length - 1); i++) {
				if (array[i] > array[j]) {
					count++;
					valueMax = array[i];
					valueMin = array[j];
					array[i] = valueMin;
					array[j] = valueMax;
				}
				j++;
			}
			arrLenght--;
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
