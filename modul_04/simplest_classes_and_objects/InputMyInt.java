package by.lecttor.modul_04.simplest_classes_and_objects;

import java.util.Scanner;

/*
 Это мой собственный класс по вводу числа Int через клавиатур.
 Состоит из 3 методов. 
 1) inputInt ввод числа из клавиатуры, прверка ее на тип int, присваиваиние заначения.
 2) control проверка числа если оно доно быть больше или меньше определенного занчения.
 3) inputInteger объеденеие 1 метода и 2-го.
 */

public class InputMyInt {
	private static int j;

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	// 3)
	public static int inputInteger() {
		int i;
		i = inputInt();
		i = control(i);
		System.out.println(" ");
		return i;
	}

	// 1)
	public static int inputInt() {
		int value;
		String i;
		Scanner in = new Scanner(System.in);
		while (!in.hasNextInt()) {
			System.out.print("Повторите ввод >> ");
			i = in.nextLine();
		}
		value = in.nextInt();
		return value;
	}

	// 2)
	public static int control(int i) {
		while (i <= j) {
			System.out.print("Число должна быть больше " + j + ", повторите ввод >> ");
			i = inputInt();
		}
		return i;
	}

}
