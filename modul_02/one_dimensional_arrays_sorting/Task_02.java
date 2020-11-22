package by.lecttor.modul_02.one_dimensional_arrays_sorting;
/*
2. Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. 
Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
 Примечание. Дополнительный массив не использовать.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_02 {
	public static void main(String[] args) {

		int a;
		int b;

		System.out.print(" Введите размер последовательности (a) >> ");
		a = inputIn();
		System.out.print(" Введите размер последовательности (b) >> ");
		b = inputIn();

		int[] arrayA;
		int[] arrayB;

		arrayA = new int[a];
		arrayB = new int[b];

		arrayA = arrayValue(arrayA);
		arrayB = arrayValue(arrayB);

		System.out.println(" ");
		System.out.print("Последовательность А");
		arrayPrint(arrayA);
		System.out.println(" ");
		System.out.print("Последовательность B");
		arrayPrint(arrayB);
		
		System.out.println(" ");
		System.out.print("Новая последовательность");
		arrayA = arrayConect(arrayA, arrayB);

	}

	// соединение двух последовательсти
	public static int[] arrayConect(int[] array1, int[] array2) {
		int newLength;
		int endPointArray1;
		int value;
		endPointArray1 = array1.length;
		newLength = array1.length + array2.length;
		array1 = Arrays.copyOf(array1, newLength);
		value = 0;
		for (int i = endPointArray1; i < array1.length; i++) {
			array1[i] = array2[value];
			value++;
		}
		Arrays.parallelSort(array1);
		arrayPrint(array1);
		return array1;
	}

	// печать массива
	public static void arrayPrint(int[] array) {
		System.out.println(" ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	// заполнение последовательности
	public static int[] arrayValue(int[] array) {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}
		Arrays.parallelSort(array);
		return array;
	}

	// ввод числа
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
			System.out.print("��������� ���� >> ");
			i = in.nextLine();
		}
		per = in.nextInt();
		return per;
	}

	public static int control0(int x) {
		while (x <= 0) {
			System.out.print("����� ������ ���� ������ 0, ��������� ���� >> ");
			x = inputInt();
		}
		return x;
	}
}
