package by.lecttor.modul_04.simplest_classes_and_objects.task_05;

import java.util.Random;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyInt;

public class Counter {
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
		control();
	}

	public void inc() {
		this.count++;
	}

	public void dec() {
		this.count--;
	}

	public void print() {
		System.out.println(count);
	}

	public void inputCount() {
		InputMyInt num = new InputMyInt();
		System.out.print("Введите значениес счётчика по умолчанию >> ");
		this.count = num.inputInt();
		control();
	}

	public void control() {
		while (this.count <= 0 || this.count >= 100) {
			System.out.print("Число должна быть больше 0  и меньше 100 , повторите ввод >> ");
			this.count = InputMyInt.inputInt();
		}
	}

	public void randCount() {
		Random rand = new Random();
		this.count = rand.nextInt(99);

	}
}
