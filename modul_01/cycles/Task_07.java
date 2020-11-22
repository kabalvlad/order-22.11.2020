package by.lecttor.modul_01.cycles;

import java.util.Scanner;

// 7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
// m и n вводятся с клавиатуры.

public class Task_07 {

	public static void main(String[] args) {

		int m;
		int n;
		int min;
		int max;
		int ost;
		boolean test;

		test = false;

		// Ввод данных
		System.out.print("Введите натуральное число m >>  ");
		m = inputInt();
		System.out.print("Введите натуральное число n >>");
		n = inputInt();

		// нахождение начало и конца числового промежутка
		min = Math.min(n, m);
		max = Math.max(m, n);

		while (min <= max) {
			System.out.println("Делителями числа " + min + " являются числа: ");
			for (int del = 2; del < min; del++) {
				ost = min % del;
				if (ost == 0) {
					System.out.println(del);
					test = true;
				}
			}
			if (test == false) {
				System.out.println("данное число является простым, оно делитьcя на 1  и само на себя");
			}
			min++;
			test = false;

		}
	}

	public static int inputInt() {
		String i;
		int per;
		Scanner in = new Scanner(System.in);
		while (!in.hasNextInt()) {
			System.out.print(" >> ");
			i = in.nextLine();
		}
		per = in.nextInt();
		return (per);
	}

}
