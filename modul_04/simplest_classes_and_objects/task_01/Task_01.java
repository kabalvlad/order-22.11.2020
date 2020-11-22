package by.lecttor.modul_04.simplest_classes_and_objects.task_01;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyInt;

/*
1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.
 */

public class Task_01 {
	public static void main(String[] args) {

		InputMyInt i = new InputMyInt();
		Test1 value = new Test1();

		Test1 value2 = new Test1();
		System.out.print("Введите X >> ");
		value.setX(i.inputInt());
		System.out.print("Введите Y >> ");
		value.setY(i.inputInt());

		value.printScrean(value.getX(), value.getY());
		value.sum(value.getX(), value.getY());
		value.max(value.getX(), value.getY());

	}

}
