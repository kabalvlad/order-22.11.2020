package by.lecttor.modul_04.simplest_classes_and_objects.task_04;

public class Train {
	private String destination;
	private int NumberTrain;
	private int HoursDepartureTime;
	private int MinDepartureTime;
	
	public int getHoursDepartureTime() {
		return HoursDepartureTime;
	}

	public void setHoursDepartureTime(int hoursDepartureTime) {
		HoursDepartureTime = hoursDepartureTime;
	}

	public int getMinDepartureTime() {
		return MinDepartureTime;
	}

	public void setMinDepartureTime(int minDepartureTime) {
		MinDepartureTime = minDepartureTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberTrain() {
		return NumberTrain;
	}

	public void setNumberTrain(int NumberTrain) {
		this.NumberTrain = NumberTrain;
	}

	public void printTrain() {
		System.out.println("Станция: " + destination + " Номер поезда  " + "№" + NumberTrain + " Время отправленя "
				+ HoursDepartureTime + ":" + MinDepartureTime);

	}

	public Train(String destination, int NumberTrain, int HoursDepartureTime, int MinDepartureTime) {
		this.destination = destination;
		this.NumberTrain = NumberTrain;
		this.HoursDepartureTime = HoursDepartureTime;
		this.MinDepartureTime = MinDepartureTime;
	}

}
