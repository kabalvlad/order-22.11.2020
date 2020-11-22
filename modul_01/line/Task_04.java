package by.lecttor.modul_01.line;

import java.util.Scanner;

// 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
// Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class Task_04 {

	public static void main(String[] args) {

		double x;
		double y;

		Scanner input = new Scanner(System.in);
		System.out.print("Введите число ввида nnn.ddd >> ");
		x = input.nextDouble();

		y = (x * 1000) % 1000 + (int) x / 1000.0;
		System.out.println(y);

	}

}
