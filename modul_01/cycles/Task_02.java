package by.lecttor.modul_01.cycles;

// 2. Вычислить значения функции на отрезке [а,b] c шагом h:

import java.util.Scanner;

public class Task_02 {

	public static void main(String[] args) {

		double a;
		double b;
		double h;
		double sta;
		double fin;
		double x;
		double y;

		System.out.print("Введите точку А >> ");
		a = inputDouble();
		System.out.print("Введите точку  B  >> ");
		b = inputDouble();
		System.out.print("Введите шаг >> ");
		h = inputDouble();

		// поиск начала отрезка
		sta = Math.min(a, b);
		fin = Math.max(a, b);

		// основной цикл
		x = sta;
		while (x <= fin) {
			if (x > 2) {
				y = x;
				System.out.println(y);
			} else {
				y = (-x);
				System.out.println(y);
			}
			x = x + h;
		}

	}

	public static double inputDouble() {
		String i;
		double per;
		Scanner in = new Scanner(System.in);
		while (!in.hasNextDouble()) {
			System.out.print(" >> ");
			i = in.nextLine();
		}
		per = in.nextDouble();
		return (per);
	}

}
