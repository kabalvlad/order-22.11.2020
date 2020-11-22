package by.lecttor.modul_01.branches;

import java.util.Scanner;

// 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой. 

public class Task_03 {

	public static void main(String[] args) {

		int xa;
		int ya;
		int xb;
		int yb;
		int xc;
		int yc;
		double AB;
		double BC;
		double CA;
		double poluPirimetr; // полупиреметр для нахожденя площади треугольника
		double square; // площадь

		// ввод данных
		System.out.print("xa >> ");
		xa = inputINT();
		System.out.print("ya >> ");
		ya = inputINT();

		System.out.print("xb >> ");
		xb = inputINT();
		System.out.print("yb >> ");
		yb = inputINT();

		System.out.print("xc >> ");
		xc = inputINT();
		System.out.print("yc >> ");
		yc = inputINT();

		// длинна между точками
		AB = distantIJ(xa, ya, xb, yb);
		BC = distantIJ(xb, yb, xc, yc);
		CA = distantIJ(xc, yc, xa, ya);

		// нахождение площади треугольника
		poluPirimetr = (AB + BC + CA) / 2;
		square = Math.sqrt(poluPirimetr * (poluPirimetr - AB) * (poluPirimetr - BC) * (poluPirimetr - CA));

		// проверка условия задачи
		if (square == 0) {
			System.out.println("Точки А В С лежат на одной прямой ");
		} else {
			System.out.println("Точки A B C не лежат на одной прямой ");
		}
	}

	// расчёт расстояния между точками
	public static double distantIJ(int x1, int y1, int x2, int y2) {
		double IJ;
		IJ = Math.hypot(x2 - x1, y2 - y1);
		return (IJ);
	}

	// получение числа (int)
	public static int inputINT() {
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
