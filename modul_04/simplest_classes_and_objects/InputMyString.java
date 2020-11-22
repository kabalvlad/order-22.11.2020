package by.lecttor.modul_04.simplest_classes_and_objects;

import java.util.Scanner;

/*
Это мой собственный класс по вводу String через клавиатур.
Состоит из методов. 
1) inputString ввод текста из клавиатуры, прверка введен ли текст.
*/

public class InputMyString {
	// 1)
	public static String inputString() {
		String value;
		String i;
		Scanner in = new Scanner(System.in);
		while (!in.hasNextLine()) {
			System.out.print("Повторите ввод >> ");
			i = in.nextLine();
		}
		value = in.nextLine();
		return value;
	}
}
