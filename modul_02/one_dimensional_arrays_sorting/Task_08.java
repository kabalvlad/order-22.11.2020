package by.lecttor.modul_02.one_dimensional_arrays_sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 8.Даны дроби p1/q1 , p2/q2, .... pn/qn ( где pi и qi, - натуральные). 
 Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
 */

public class Task_08 {

	public static void main(String[] args) {
		int p;
		int value;
		System.out.print(" Введите размер последовательности (p) >> ");
		p = inputIn();

		Fraction[] array;
		array = arrayValue(p);
		System.out.print(" Начальный вариант ");
		arrayPrint(array);
		array = selectionDen(array);
		System.out.print(" Конечный вариант ");
		arrayPrint(array);

	}

	// сортировка и поиск общего занменателя
	public static Fraction[] selectionDen(Fraction[] array) {
		int comDen;
		boolean check;
		int value;

		// Нахожу общий знаменатенль
		check = false;
		comDen = 1;
		while (!check) {
			for (int i = 0; i < array.length; i++) {
				value = comDen % array[i].den;
				if (value != 0) {
					comDen++;
					check = false;
					break;
				} else {
					check = true;
				}
			}

		}
		// Привожу дроби к общему знаменателю
		System.out.println(" ");
		for (int i = 0; i < array.length; i++) {
			value = comDen / array[i].den;
			array[i].num *= value;
			array[i].den = comDen;
		}
		// Сортирую вставками
		for (int i = 1; i < array.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (array[j + 1].num < array[j].num) {
					value = array[j].num;
					array[j].num = array[j + 1].num;
					array[j + 1].num = value;
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
	public static void arrayPrint(Fraction[] array) {
		System.out.println(" ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i].num + "/" + array[i].den + " ");
		}
	}

	// Заполнение создание и заполнение массива
	public static Fraction[] arrayValue(int p) {
		Random rand;
		Fraction[] array;

		array = new Fraction[p];
		rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = new Fraction();
			array[i].num = rand.nextInt(10);
			array[i].den = rand.nextInt(10);
			while (array[i].den == 0) {
				array[i].den = rand.nextInt(6);
			}
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
		while (x <= 1) {
			System.out.print("Число должна быть больше 1, повторите ввод >> ");
			x = inputInt();
		}
		return x;
	}

}
