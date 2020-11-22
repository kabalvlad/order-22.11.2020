package by.lecttor.modul_01.line;

import java.util.Scanner;

// 6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
// принадлежит закрашенной области, и false — в противном случае: 

public class Task_06 {

	public static void main(String[] args) {

		int x;
		int y;
		String i; // для считывания значения

		Scanner it = new Scanner(System.in);

		System.out.print("Введите координату x >> ");
		while (!it.hasNextInt()) {
			System.out.print("Неверное значение, повторите ввод >>");
			i = it.nextLine();
		}
		x = it.nextInt();

		System.out.print("Введите координату y >> ");
		while (!it.hasNextInt()) {
			System.out.print("Неверное значение, повторите ввод >>");
			i = it.nextLine();
		}
		y = it.nextInt();

		// проверка точки
		if (x == 0 && y == -1) {
			System.out.println("false");
		} else {
			if (x >= -1 && x <= 1 && y >= -2 && y <= 3) {
				System.out.println("true");
			} else {
				if (x >= -3 && x <= -2 && y >= -2 && y <= -1) {
					System.out.println("true");
				} else {
					if (x >= 2 && x <= 3 && y >= -2 && y <= -1) {
						System.out.println("true");
					} else {
						System.out.println("false");
					}
				}

			}
		}

	}

}
