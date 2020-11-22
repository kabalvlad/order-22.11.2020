package by.lecttor.modul_01.line;

import java.util.Random;
import java.util.Scanner;

// 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

public class Task_01 {

	public static void main(String[] args) {

		double a;
		double b;
		int c;
		double z;

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Введите число - a >> ");
		a = input.nextDouble();
		System.out.print("Введите число - b >> ");
		b = input.nextDouble();
		c = rand.nextInt(100); // генерирует случайное число от 0 до 100
		System.out.println(" число 'а' - " + a + " число 'b' - " + b + " число 'c' - " + c);

		z = ((a - 3) * b / 2) + c;
		System.out.println("Значение функции z = " + z);

	}

}
