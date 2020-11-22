package by.lecttor.modul_04.simplest_classes_and_objects.task_06;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyInt;

public class Time {
	private int hour;
	private int min;
	private int sec;

	private int runHour;
	private int runMin;
	private int runSec;
	private int UpDown;

	// изменение времени
	public void runUpDownTime() {
		InputMyInt num = new InputMyInt();
		System.out
				.println("Для того чтоб отмотать время вперёд введите (1), для того чтоб отмотать назад введите (0):");
		System.out.print(">> ");
		this.UpDown = num.inputInt();
		contrUpDown();
		System.out.print("На сколько часов >>");
		this.runHour = num.inputInt();
		contr(runHour);
		System.out.print("На сколько минут >>");
		this.runMin = num.inputInt();
		contr(runMin);
		System.out.print("На сколько секунд >>");
		this.runSec = num.inputInt();
		contr(runSec);
		rewind();

	}

	// функция изменения времени
	private void rewind() {
		int value;
		switch (UpDown) {
		case 1:
			value = runSec / 60;
			runSec = runSec - (60 * value);
			if (runSec + sec >= 60) {
				value++;
				this.sec = (runSec + sec) - 60;
			} else {
				this.sec = runSec + sec;
			}
			runMin = runMin + value;
			value = runMin / 60;
			runMin = runMin - (60 * value);
			if (runMin + min >= 60) {
				value++;
				this.min = (runMin + min) - 60;
			} else {
				this.min = min + runMin;
			}
			runHour = value + runHour;
			value = runHour / 24;
			runHour = runHour - (24 * value);
			if (runHour + hour >= 24) {
				value++;
				this.hour = (runHour + hour) - 24;
			} else {
				this.hour = runHour + hour;
			}
			break;
		case 0:
			value = runSec / 60;
			runSec = runSec - (60 * value);
			if (sec - runSec < 0) {
				value++;
				sec = (sec - runSec) + 60;
			} else {
				sec = sec - runSec;
			}
			runMin = runMin + value;
			value = runMin / 60;
			runMin = runMin - (60 * value);
			if (min - runMin < 0) {
				value++;
				min = (min - runMin) + 60;
			} else {
				min = min - runMin;
			}
			runHour = value + runHour;
			value = runHour / 24;
			runHour = runHour - (24 * value);
			if (hour - runHour < 0) {
				value++;
				hour = (hour - runHour) + 24;
			} else {
				hour = hour - runHour;
			}
			break;
		}
	}

	// Установка время
	public void genTimeSetting() {
		InputMyInt num = new InputMyInt();
		System.out.println("Установка времени:");
		System.out.print("Часов >>");
		this.hour = num.inputInt();
		cH();
		System.out.print("Минут >>");
		this.min = num.inputInt();
		cM();
		System.out.print("Секунд >>");
		this.sec = num.inputInt();
		cC();
	}

	// установка часов
	public void genHourSetting() {
		System.out.print("Введите часы >>");
		this.hour = InputMyInt.inputInt();
		cH();
	}

	// установка минут
	public void genMinSetting() {
		System.out.print("Введите минуты >>");
		this.min = InputMyInt.inputInt();
		cM();
	}

	// устанвка секунд
	public void genSecSetting() {
		System.out.print("Введите секунды >>");
		this.sec = InputMyInt.inputInt();
		cC();
	}

	// ввыовд времени
	public void printTime() {
		System.out.println("Время: " + hour + ":" + min + ":" + sec);
	}

	// проверка часов
	private void cH() {
		if (this.hour >= 24 || this.hour < 0) {
			this.hour = 0;
		}
	}

	// Проверка минут
	private void cM() {
		if (this.min >= 60 || this.min < 0) {
			this.min = 0;
		}
	}

	// Проверка секунд
	private void cC() {
		if (this.sec >= 60 || this.sec < 0) {
			this.sec = 0;
		}
	}

	// Проверка 0 или 1
	private void contrUpDown() {
		while (this.UpDown > 1 || this.UpDown < 0) {
			System.out.print("Введите либо (1) или (0)>> ");
			this.UpDown = InputMyInt.inputInt();
		}
	}

	// Проверка меньше 0 и макс инт
	private int contr(int value) {
		while (value < 0 || value > 2147483647) {
			System.out.print("Введите число больше или равно (0)>>");
			value = InputMyInt.inputInt();
		}
		return value;
	}

}
