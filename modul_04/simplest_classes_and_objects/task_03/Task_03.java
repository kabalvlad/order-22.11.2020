package by.lecttor.modul_04.simplest_classes_and_objects.task_03;

/*
3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов).
Создайте массив из десяти элементов такого типа. 
Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
*/

public class Task_03 {

	public static void main(String[] args) {

		Student[] regedit = new Student[10];
		regedit[0] = new Student("Agent SMit", 109310, new int[] { 8, 8, 7, 9, 1 });
		regedit[1] = new Student("Keks A.A.", 109310, new int[] { 10, 9, 9, 9, 9 });
		regedit[2] = new Student("Ivanov I.I.", 109310, new int[] { 4, 5, 6, 7, 8 });
		regedit[3] = new Student("Donald T.A.", 109310, new int[] { 6, 8, 3, 0, 1 });
		regedit[4] = new Student("Kuzmich S.A.", 109310, new int[] { 3, 8, 4, 0, 2 });
		regedit[5] = new Student("Stalin I.I.", 109310, new int[] { 10, 10, 10, 9, 10 });
		regedit[6] = new Student("Lenin V.I.", 109310, new int[] { 10, 10, 10, 10, 10 });
		regedit[7] = new Student("Derzhinski F.A.", 109310, new int[] { 9, 9, 9, 9, 9 });
		regedit[8] = new Student("Bill Geats", 109310, new int[] { 7, 8, 7, 8, 7 });
		regedit[9] = new Student("Pyshkin A.S.", 109310, new int[] { 10, 9, 8, 7, 6 });

		ExcellentStudent(regedit);

	}

	public static void ExcellentStudent(Student[] regedit) {
		for (int i = 0; i < regedit.length; i++) {
			if (regedit[i].checkProgress()) {
				regedit[i].printStudent();
			}
		}
	}

}
