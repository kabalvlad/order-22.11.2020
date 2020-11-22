package by.lecttor.modul_01.line;

import java.util.Scanner;

// 3.  Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class Task_03 {

	public static void main(String[] args) {

		double x;
		double y;
		double rx;
		double ry;
		double chisl;
		double chast;
		double sum;
		double znach;

		Scanner input = new Scanner(System.in);
		System.out.println("Введите угол X от 0 до 90 ");
		x = input.nextDouble();
		System.out.println("Введите угол Y от 0 до 90 ");
		y = input.nextDouble();

		// Перевод углов в радианы
		rx = Math.toRadians(x);
		ry = Math.toRadians(y);

		// Расчет формулы
		chisl = Math.sin(rx) + Math.cos(ry);
		chast = Math.cos(rx) + Math.sin(ry);

		sum = Math.tan(rx * ry);
		znach = chisl / chast * sum;
		System.out.println("Значение выражения = " + znach);

	}

}
