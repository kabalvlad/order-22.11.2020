package by.lecttor.modul_04.simplest_classes_and_objects.task_08;

import java.math.*;

public class Customer {
	private int ID;
	private String SurName;
	private String Name;
	private String FatherName;
	private String Address;
	private String CreditCardNumber;
	private int BankAccountNumber;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public String getSurName() {
		return SurName;
	}

	public void setSurName(String surName) {
		this.SurName = surName;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getFatherName() {
		return FatherName;
	}

	public void setFatherName(String fatherName) {
		this.FatherName = fatherName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}

	public String getCreditCardNumber() {
		return CreditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.CreditCardNumber = creditCardNumber;
	}

	public int getBankAccountNumber() {
		return BankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.BankAccountNumber = bankAccountNumber;
	}

	// метод по выводу стринг
	public String toString() {
		return String.format("Customer{" + "id = " + ID + ", surname = '" + SurName + '\'' + ", name = '" + Name + '\''
				+ ", fatherName = '" + FatherName + '\'' + ", address = '" + Address + '\'' + ", CreditCardNumber = "
				+ CreditCardNumber + ", BankAccountNumber = " + BankAccountNumber + '}');
	}

}
