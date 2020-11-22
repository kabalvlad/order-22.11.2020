package by.lecttor.modul_04.simplest_classes_and_objects.task_04;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyInt;

/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. 
Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
 */

public class Task_04 {

	public static void main(String[] args) {

		Train[] Trains = new Train[5];

		// станция, номер поезда, время отправления: часы минуты
		Trains[0] = new Train("Minsk", 931, 22, 16);
		Trains[1] = new Train("Berlin", 821, 4, 15);
		Trains[2] = new Train("Minskisa", 846, 7, 22);
		Trains[3] = new Train("Minskis", 771, 7, 59);
		Trains[4] = new Train("Minsk", 293, 22, 30);

		print(Trains);
		System.out.println(" ");
		TrainSort(Trains);
		print(Trains);

		System.out.println(" ");
		destinationSort(Trains);
		print(Trains);

		System.out.println(" ");
		Task_04 t = new Task_04();
		t.printInfo(Trains);

	}

	// Вывода информации о поезде, номер которого введен пользователем.
	public void printInfo(Train[] Trains) {
		int value;
		InputMyInt numberTrain = new InputMyInt();
		System.out.print("Введите номер поезда >> ");
		value = numberTrain.inputInt();

		for (int i = 0; i < Trains.length; i++) {
			if (value == Trains[i].getNumberTrain()) {
				Trains[i].printTrain();
			}
		}
	}

	// Печать массива
	public static void print(Train[] Trains) {
		for (int i = 0; i < Trains.length; i++) {
			Trains[i].printTrain();
		}
	}

	// сортировка массива по номерам поездов
	public static void TrainSort(Train[] Trains) {
		Train LinkValueMax;
		Train LinkValueMin;
		int arrayLength = Trains.length;
		while (arrayLength > 1) {
			for (int i = 0; i < (Trains.length - 1); i++) {
				if (Trains[i].getNumberTrain() > Trains[i + 1].getNumberTrain()) {
					LinkValueMax = Trains[i];
					LinkValueMin = Trains[i + 1];
					Trains[i] = LinkValueMin;
					Trains[i + 1] = LinkValueMax;
				}
			}
			arrayLength--;
		}
	}

	//сортировка массива по пунктам прибытия если совпадает пункт то по времени
	public static void destinationSort(Train[] Trains) {
		boolean needIntr;
		boolean needLetertIntr;
		int count;
		int endWords;

		// сортировка пузырьком 
		needIntr = true;
		while (needIntr) {
			for (int i = 1; i < Trains.length; i++) {
				if (Trains[i].getDestination().length() < Trains[i - 1].getDestination().length()) {
					endWords = Trains[i].getDestination().length();
				} else {
					endWords = Trains[i - 1].getDestination().length();
				}
				count = 0;
				needLetertIntr = true;
				while (needLetertIntr) { 
					// проверка на счетцик букв и рампределение по времени
					if (count == endWords && needLetertIntr == true) {
						if (Trains[i].getDestination().length() == Trains[i - 1].getDestination().length()) {
							if (Trains[i].getHoursDepartureTime() == Trains[i - 1].getHoursDepartureTime()) {
								if (Trains[i].getMinDepartureTime() < Trains[i - 1].getMinDepartureTime()) {
									swap(Trains, i, i - 1);
								}
							} else {
								if (Trains[i].getHoursDepartureTime() < Trains[i - 1].getHoursDepartureTime()) {
									swap(Trains, i, i - 1);
								}
							}

						} else {
							if (Trains[i].getDestination().length() < Trains[i - 1].getDestination().length()) {
								swap(Trains, i, i - 1);
							}

						}
						break;
					}
					// сравнение букв 
					int len1 = Trains[i].getDestination().charAt(count);
					int len2 = Trains[i - 1].getDestination().charAt(count);
					if (len1 == len2) {

						count++;
						needLetertIntr = true;
					} else {
						if (len1 < len2) {
							swap(Trains, i - 1, i);
							needIntr = true;
							needLetertIntr = false;
						} else {
							needIntr = false;
							needLetertIntr = false;
						}
					}

				}
			}
		}

	}

	// замена мест в массиве
	private static void swap(Train[] array, int ind1, int ind2) {
		Train tmp = array[ind1];
		array[ind1] = array[ind2];
		array[ind2] = tmp;
	}

}
