package by.lecttor.modul_04.simplest_classes_and_objects.task_03;

public class Student {
	private String FullName;
	private int GroupNumber;
	private int[] Progress;

	public Student(String FullName, int GroupNumber, int[] Progress) {
		this.FullName = FullName;
		this.GroupNumber = GroupNumber;
		this.Progress = new int[5];
		this.Progress = Progress;
	}

	public void printStudent() {
		System.out.println("ФИО: " + FullName + " Номер группы №" + GroupNumber);

	}

	public boolean checkProgress() {
		boolean check = true;
		for (int i = 0; i < Progress.length; i++) {
			if (Progress[i] < 9) {
				check = false;
			}
		}
		return check;
	}

}
