package by.lecttor.modul_01.cycles;

import java.util.Scanner;

// 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task_08 {

	public static void main(String[] args) {

		int i;
		int j;
		int k = 10;
		int provI;
		int provJ;
		int z; 

		System.out.print("Введите первое число >> ");
		i = inputInt();
		System.out.print("Введите второе число >> ");
		j = inputInt();

		System.out.println("В состав чисел " + i + " и  " + j + " входят числа: ");
		while (i > 0) {
			provI = i % k;
			i = i / k;
			z = j;
			while (z > 0) {
				provJ = z % k;
				z = z / k;
				if (provI == provJ) {
					System.out.println(" - " + provJ);
				}

			}

		}

	}

	//
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
