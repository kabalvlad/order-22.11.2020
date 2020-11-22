package by.lecttor.modul_02.decomposition;

import java.util.Scanner;

//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//треугольника.

public class Task_03 {

	public static void main(String[] args) {

		int a;
		double sT;
		double sH;

		System.out.println("Введите длинну стороны A >>");
		a = inputInt();

		sT = squareTringle(a);

		sH = squareHexagon(sT);
		System.out.printf("%.3f", sH);

	}

	// Получение и проверка числа (int)
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

	// Вычисление площади равностороннего треугольника
	public static double squareTringle(int x) {
		double s;
		s = (Math.sqrt(3) * (x * x)) / 4;
		return s;
	}

	// Вычисление площади шестиугольника
	public static double squareHexagon(double x) {
		double s;
		s = x * 6;
		return s;
	}

}

