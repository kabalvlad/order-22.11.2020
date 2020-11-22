package by.lecttor.modul_04.simplest_classes_and_objects.task_08;

import java.util.Arrays;
import java.util.Comparator;
import by.lecttor.modul_04.simplest_classes_and_objects.InputMyString;

public class DataCustomer {
	Customer cs = new Customer();

	public DataCustomer(int id, String surName, String name, String fatherName, String address, String creditCardNumber,
			int bankAccountNumber) {
		cs.setID(id);
		cs.setSurName(surName);
		cs.setName(name);
		cs.setFatherName(fatherName);
		cs.setAddress(address);
		cs.setCreditCardNumber(creditCardNumber);
		cs.setBankAccountNumber(bankAccountNumber);
	}

	public DataCustomer() {
		// Чтобы был )))
	}

	// сортировка списка по алвафиту ХЗ как! ещё сам толком не разобрался Новые
	// методы
	public void listABC(DataCustomer[] array) {
		Comparator<DataCustomer> pcomp = new SurNameComparator()
				.thenComparing(new NameComparator().thenComparing(new FatherNameComparator()));
		Arrays.sort(array, pcomp);
	}

	// печать массива
	public void printAr(DataCustomer[] array) {
		for (DataCustomer i : array) {
			System.out.println(i.cs.toString());
		}
	}

	// печать массива с заданным деапозоном карточек
	public void printCard(DataCustomer[] array) {
		String Start;
		String End;
		System.out.print("Введите начальный номер диапозона карточек>> ");
		Start = InputCCN();
		System.out.print("Введите конечный номер диапозона карточек>> ");
		End = InputCCN();
		for (DataCustomer i : array) {
			if (CheckCCN(i.cs.getCreditCardNumber(), Start, End)) {
				System.out.println(i.cs.toString());
			}
		}

	}

	// проверка диапозона
	private static boolean CheckCCN(String CCN, String sta, String end) {
		boolean value;
		int blokRoom1 = 0;
		int blokRoom2 = 0;
		int ccn;
		int s;
		int e;
		for (int i = 0; i < CCN.length(); i++) {
			ccn = Character.getNumericValue(CCN.charAt(i));
			s = Character.getNumericValue(sta.charAt(i));

			if (ccn < s) {
				blokRoom1 = 0;
				break;
			} else {
				if (ccn > s) {
					blokRoom1 = 1;
					break;
				} else {
					blokRoom1 = 1;
				}
			}
		}
		for (int i = 0; i < CCN.length(); i++) {
			ccn = Character.getNumericValue(CCN.charAt(i));
			e = Character.getNumericValue(end.charAt(i));
			if (ccn > e) {
				blokRoom2 = 0;
				break;
			} else {
				if (ccn < e) {
					blokRoom2 = 1;
					break;
				} else {
					blokRoom2 = 1;
				}
			}
		}
		if (blokRoom1 == 1 && blokRoom2 == 1) {
			value = true;
		} else {
			value = false;
		}

		return value;

	}

	// ввод диапозонов
	private static String InputCCN() {
		String value;
		value = InputMyString.inputString();
		while (value.length() != 16) {
			System.out.print("Неверно повторите ввод >>");
			value = InputMyString.inputString();
		}
		return value;
	}

}

class SurNameComparator implements Comparator<DataCustomer> {
	@Override
	public int compare(DataCustomer dc1, DataCustomer dc2) {
		return dc1.cs.getSurName().compareTo(dc2.cs.getSurName());
	}
}

class NameComparator implements Comparator<DataCustomer> {
	@Override
	public int compare(DataCustomer dc1, DataCustomer dc2) {
		return dc1.cs.getName().compareTo(dc2.cs.getName());
	}
}

class FatherNameComparator implements Comparator<DataCustomer> {
	@Override
	public int compare(DataCustomer dc1, DataCustomer dc2) {
		return dc1.cs.getFatherName().compareTo(dc2.cs.getFatherName());
	}
}
