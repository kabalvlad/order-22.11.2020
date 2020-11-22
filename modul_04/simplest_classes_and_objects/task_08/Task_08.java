package by.lecttor.modul_04.simplest_classes_and_objects.task_08;

/*
8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Task_08 {

	public static void main(String[] args) {

		DataCustomer Li = new DataCustomer();

		DataCustomer[] DC = new DataCustomer[8];
		DC[0] = new DataCustomer(1, "Fisher", "Sam", "Celvin", "Lenin str 43", "5300430056567676", 99887456);
		DC[1] = new DataCustomer(2, "Fisher", "Sam", "Igorevich", "London str 23", "1010292934765532", 99876653);
		DC[2] = new DataCustomer(3, "Fisher", "Jak", "lalkin", "Kyibasheva str 99", "3010293335561112", 99546100);
		DC[3] = new DataCustomer(4, "Lenin", "Iliy", "Vladzimirovich", "Leninskay str 1", "2290891327662912", 64542200);
		DC[4] = new DataCustomer(5, "Ivanov", "Ivan", "Ivanovich", "Centralnay str 1", "0000111122223333", 00001111);
		DC[5] = new DataCustomer(6, "Aleksadrova", "Anna", "Olegovna", "Lesnay str 118", "4330563311863702", 19546170);
		DC[6] = new DataCustomer(7, "Volkova", "Olga", "Dmitrevna", "Krasnay str 74", "2727908711633901", 69339821);
		DC[7] = new DataCustomer(8, "Ivanoved", "Yna", "Semenova", "Pobedski str 69", "2800633621899002", 16666174);

		Li.printAr(DC);
		System.out.println(" ");
		Li.listABC(DC);
		Li.printAr(DC);
		Li.printCard(DC);

	}

}
