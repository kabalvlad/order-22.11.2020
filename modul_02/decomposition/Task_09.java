package by.lecttor.modul_02.decomposition;

import java.util.Scanner;

//9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y— прямой.

public class Task_09 {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		int t;
		double ht; // гипотенуза
		double s1;
		double s2;
		double square;

		System.out.print("Введите длину сторны X >> ");
		x = inputINT();
		x = control0(x);

		System.out.print("Введите длину сторны Y >> ");
		y = inputINT();
		y = control0(y);

		System.out.print("Введите длину сторны Z >> ");
		z = inputINT();
		z = control0(z);

		System.out.print("Введите длину сторны t >> ");
		t = inputINT();
		t = control0(t);

		s1 = trigonSquare(x, y);
		ht = hypotenuse(x, y);
		s2 = trigonSquare(z, t, ht);
		square = s1 + s2;

		System.out.printf("Площадь четырехугольника равна = ");
		System.out.printf("'%.3f'%n", square);

	}

	// ввод числа инт
	public static int inputINT() {
		Scanner in = new Scanner(System.in);
		int per;
		while (!in.hasNextInt()) {
			System.out.print("Неверно значение, поробуйте ещё >> ");
			String i = in.nextLine();
		}

		per = in.nextInt();
		return per;

	}

	// проверка на значение больше 0
	public static int control0(int x) {
		while (x <= 0) {
			System.out.print("Длинна должна быть больше 0, повторите ввод >> ");
			x = inputINT();
		}

		return x;
	}

	// площадь прямоугольного треугольника
	public static double trigonSquare(int x, int y) {
		double square90;

		square90 = (1 / 2) * x * y;

		return square90;

	}

	// полощадь треугольника
	public static double trigonSquare(int x, int y, double z) {
		double square;
		double halfPerimeter;
		double hp;

		halfPerimeter = (x + y + z) / 2;
		hp = halfPerimeter * (halfPerimeter - x) * (halfPerimeter - y) * (halfPerimeter - z);
		square = Math.sqrt(hp);

		return square;

	}

	// нахождение гипотенузы прямоугольного треугольника
	public static double hypotenuse(int a, int b) {
		double ht;

		ht = Math.sqrt((a * a) + (b * b));

		return ht;

	}

}
