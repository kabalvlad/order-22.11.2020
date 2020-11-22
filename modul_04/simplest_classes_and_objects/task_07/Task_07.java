package by.lecttor.modul_04.simplest_classes_and_objects.task_07;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyDouble;

/*
 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.
 */

public class Task_07 {

	public static void main(String[] args) {

		int IO;
		boolean needTry;
		Triangle tr = new Triangle();

		needTry = true;
		while (needTry) {
			IO = 1;
			try {
				System.out.println(
						"Введите координаты точек (Xa, Ya, Xb, Yb, Xc, Yc) треугольника АВС соответсвенно >> ");
				tr.Triangle(inputLenTriag(), inputLenTriag(), inputLenTriag(), inputLenTriag(), inputLenTriag(),
						inputLenTriag());
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Давай начнём сначала.");
				IO = 0;
			}
			if (IO == 0) {
				needTry = true;
			} else {
				needTry = false;
			}
		}

		tr.calcArea();
		tr.calcMediana();
		tr.calcPerimeter();

	}

	public static double inputLenTriag() {
		double temp;
		System.out.print(">> ");
		temp = InputMyDouble.inputDouble();
		return temp;
	}

}
