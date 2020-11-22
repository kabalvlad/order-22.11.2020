package by.lecttor.modul_04.simplest_classes_and_objects.task_09;

public class Book {
	private int Id;
	private String Author;
	private String PublishingHouse;
	private int YearOfPublication;
	private int NumberOfPages;
	private int Price;
	private String BindingType;

	public Book(int id, String author, String publishingHouse, int yearOfPublication, int numberOfPages, int price,
			String bindingType) {
		setId(id);
		setAuthor(author);
		setPublishingHouse(publishingHouse);
		setYearOfPublication(yearOfPublication);
		setNumberOfPages(numberOfPages);
		setPrice(price);
		setBindingType(bindingType);

	}

	public String toString() {
		return String.format("id " + getId() + " Автор: " + getAuthor() + " Издательство: " + getPublishingHouse()
				+ " Год издания: " + getYearOfPublication() + " Число страниц: " + getNumberOfPages() + " Цена: "
				+ getPrice() + " Тип переплёта: " + getBindingType());
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		this.Author = author;
	}

	public String getPublishingHouse() {
		return PublishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.PublishingHouse = publishingHouse;
	}

	public int getYearOfPublication() {
		return YearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.YearOfPublication = yearOfPublication;
	}

	public int getNumberOfPages() {
		return NumberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.NumberOfPages = numberOfPages;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		this.Price = price;
	}

	public String getBindingType() {
		return BindingType;
	}

	public void setBindingType(String bindingType) {
		this.BindingType = bindingType;
	}

}
