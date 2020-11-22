package by.lecttor.modul_01.branches;

// 1. Даны два угла треугольника (в градусах).
// Определить, существует ли такой треугольник, и если да, то будет ли
// он прямоугольным.

import java.util.Scanner;

public class Task_01 {

	public static void main(String[] args) {

		String i;
		int a;
		int b;
		int c;
		Scanner input = new Scanner(System.in);

		System.out.print("Введите угол A >> ");
		while (!input.hasNextInt()) {
			System.out.print("Введите угол A >> ");
			i = input.nextLine();
		}
		a = input.nextInt();

		System.out.print("Введите угол B >> ");
		while (!input.hasNextInt()) {
			System.out.print("Введите угол В >> ");
			i = input.nextLine();
		}
		b = input.nextInt();
		
		
		if (a + b < 180) {
			System.out.println("Существует такой треугольник ");
			c = 180 - a - b;
			if (a + b == 90 || a + c == 90 || b + c == 90) {
				System.out.println(" Данный треугольник являеться прямоугольным ");
			} else {
				System.out.println(" Данный треугольник не являеться прямоугольным");
			}
		} else {
			System.out.println("Такого треугольника не существует");
		}

	}

}
