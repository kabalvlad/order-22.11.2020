package by.lecttor.modul_04.simplest_classes_and_objects.task_05;

/*
5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

public class Task_05 {

	public static void main(String[] args) {
		Counter cs = new Counter();
		System.out.println("Значение счётчика по умолчанию ");
		cs.inputCount();
		cs.print();
		System.out.println("Значение счётчика пороизвольное ");
		cs.randCount();
		cs.print();
		System.out.println("Метод уменьшения ");
		cs.dec();
		cs.print();
		System.out.println("Метод увилечения ");
		cs.randCount();
		cs.print();
		cs.inc();
		cs.print();
		System.out.println("Получение его текущего состояния ");
		cs.print();

	}

}
