package by.lecttor.modul_04.simplest_classes_and_objects.task_06;

/*
6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.

 */

public class Task_06 {

	public static void main(String[] args) {

		Time times = new Time();

		times.genTimeSetting();
		times.printTime();

		times.runUpDownTime();
		times.printTime();

		times.genHourSetting();
		times.printTime();

		times.genMinSetting();
		times.printTime();

		times.genSecSetting();
		times.printTime();
	}

}
