package by.lecttor.modul_04.simplest_classes_and_objects.task_02;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyDouble;

/*
 2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
класса.
 */

public class Task_02 {

	public static void main(String[] args) {

		Test2 Obj = new Test2();
		InputMyDouble inputValue = new InputMyDouble();

		Obj.setValueNull();
		Obj.printScrean(Obj.x, Obj.y);

		System.out.print("Введите X >>");
		Obj.setValue(Obj.x = inputValue.inputDouble(), true);
		Obj.printScrean(Obj.getX(), Obj.getY());

		Obj.setX(0.2);
		Obj.setY(false);
		Obj.printScrean(Obj.getX(), Obj.getY());

	}

}
