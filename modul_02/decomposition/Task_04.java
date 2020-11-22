package by.lecttor.modul_02.decomposition;

import java.util.Scanner;

//4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
//из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

public class Task_04 {

	public static void main(String[] args) {

		int n; // число точек
		int ln; // порзиция первой точки с макс раст
		int jn; // позиция второй точки с макс раст
		double dist; // расстояние
		double max; // максиммальное расстояние

		max = 0; // инициализация максимального расстояния и др переменных
		ln = 0;
		jn = 0;

		System.out.print("Введите количество точек >> ");
		n = inputINT();
		n = control3(n);
		System.out.println("----------------");

		int[][] pointArray;
		pointArray = new int[n][2];

		for (int i = 0; i < n; i++) { // присвоение значений точкам
			System.out.print("Введите координату X" + (i + 1) + " точки >> ");
			pointArray[i][0] = inputX(i);
			System.out.print("Введите координату Y" + (i + 1) + " точки >> ");
			pointArray[i][1] = inputY(i);
			System.out.println(" x" + (i + 1) + " = " + pointArray[i][0] + " y" + (i + 1) + " = " + pointArray[i][1]);
			System.out.println("----------------");
		}

		// цикл для расчёта длинны
		for (int i = 0; i < (n - 1); i++) {
			int l = i;
			for (int j = (l + 1); j < n; j++) {
				dist = distance(pointArray[l][0], pointArray[l][1], pointArray[j][0], pointArray[j][1]);
				// System.out.println(dist);
				if (max < dist) { // проверка в каких ячейках находиться точки из задания
					ln = l;
					jn = j;
				}
				max = Math.max(max, dist); // нахождение максимальной длинны

			}
		}
		System.out.println("Максимальное расстояние = " + max);
		System.out.println("Между точками  " + (ln + 1) + " и " + (jn + 1) + " где X" + (ln + 1) + " = "
				+ pointArray[ln][0] + " и Y" + (ln + 1) + " = " + pointArray[ln][1]);
		System.out.print(" где X" + (jn + 1) + " = " + pointArray[jn][0]);
		System.out.println(" и Y" + (jn + 1) + " = " + pointArray[jn][1]);
	}

	// ввод числа инт
	public static int inputINT() {
		Scanner in = new Scanner(System.in);
		int j;
		int per;
		while (!in.hasNextInt()) {
			System.out.print("Введите количество точек >> ");
			String i = in.nextLine();
		}
		per = in.nextInt();
		return per;
	}

	// нахождение длинны
	public static double distance(int x1, int y1, int x2, int y2) {
		double dist;
		dist = Math.hypot(x2 - x1, y2 - y1);
		return dist;
	}

	// ввод координаты х
	public static int inputX(int n) {
		int per;
		String i;
		Scanner is = new Scanner(System.in);
		while (!is.hasNextInt()) {
			System.out.print("Введите координату X" + (n + 1) + " точки >> ");
			i = is.nextLine();
		}
		per = is.nextInt();
//		
		return (per);
	}

	// ввод координаты У
	public static int inputY(int n) {
		int per;
		String i;
		Scanner in = new Scanner(System.in);
		while (!in.hasNextInt()) {
			System.out.println("Введите координату Y" + (n + 1) + " точки >> ");
			i = in.nextLine();
		}
		per = in.nextInt();
		in.reset();
		return (per);
	}

	// проверка на значение больше 3
	public static int control3(int x) {
		while (x <= 2) {
			System.out.print("Число точек должно быть больше 3, повторите ввод >> ");
			x = inputINT();
		}

		return x;
	}

}