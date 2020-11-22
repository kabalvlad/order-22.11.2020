package by.lecttor.modul_02.one_dimensional_arrays_sorting;

import java.util.Random;
import java.util.Scanner;

/*
 * 5. Сортировка вставками.
 * Дана последовательность a1, a2, ..., an 
 * Требуется переставить числа в порядке возрастания.  
 * Делается  это  следующим  образом.  Пусть a1, a2, ..., an - упорядоченная  последовательность,  
 * т. е. a1 <= a2 <= ... <= an.  Берется  следующее  число ai+1 и  вставляется  в  последовательность  так,  
 * чтобы  новая последовательность была тоже возрастающей. 
 * Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны. 
 * Примечание. Место помещения очередного элемента в отсортированную часть производить с 
 * помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции
 */

public class Task_05 {

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
		arrayA = selectionInsert(arrayA);
		System.out.println(" ");
		System.out.print("Последовательность измененая ");
		arrayPrint(arrayA);
	}

	//
	public static int[] selectionInsert(int[] array) {
		int value;
		for (int i = 1; i < array.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (array[j + 1] < array[j]) {
					value = array[j];
					array[j] = array[j + 1];
					array[j + 1] = value;
					// System.out.println(" - ");
				} else {
					// System.out.println(" + ");
					break;
				}
			}

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