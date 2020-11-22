package by.lecttor.modul_03;

import java.util.Scanner;

/*
 * Это мой собственный класс по вводу числа double через клавиатур. Состоит из 3
 * методов. 1) inputDouble ввод числа из клавиатуры, прверка ее на тип Double,
 * присваиваиние заначения. 2) control проверка числа если оно доно быть больше
 * или меньше определенного занчения. 3) inDouble объеденеие 1 метода и
 * 2-го.
 */

public class InputMyDouble {

	private static double j;

	public double getJ() {
		return j;
	}

	public void setJ(double j) {
		this.j = j;
	}

	// 3)
	public static double inDouble() {
		double i;
		i = inputDouble();
		i = control(i);
		System.out.println(" ");
		return i;
	}

	// 1)
	public static double inputDouble() {
		double value;
		String i;
		Scanner in = new Scanner(System.in);
		while (!in.hasNextDouble()) {
			System.out.print("Повторите ввод >> ");
			i = in.nextLine();
		}
		value = in.nextDouble();
		return value;
	}

	// 2)
	public static double control(double i) {
		while (i <= j) {
			System.out.print("Число должна быть больше " + j + ", повторите ввод >> ");
			i = inputDouble();
		}
		return i;
	}

}
