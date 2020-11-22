package by.lecttor.modul_01.cycles;

import java.util.Scanner;

// 1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
// все числа от 1 до введенного пользователем числа.

public class Task_01 {

	public static void main(String[] args) {
		int sum = 0;
		int x;
		System.out.print("Введите любое целое положительное число >>  ");
		x = inputInt();

		for (int i = 1; i < x; i++) {
			sum = sum + i;
			System.out.println(sum);
		}
		System.out.println(sum);
	}

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

}
