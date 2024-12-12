package Oops;

import java.util.Scanner;

public class Class {
	private String title;
	private String author;
	private int price;
	
	public Class(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void discount(double percentage) {
		if(percentage>0 && percentage<=100) {
			double discAmount=(price*percentage)/100;
			System.out.println(percentage);
		}else {
			System.out.println("Invalid discount applied");
		}
	}
	
	public void bookDetails() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		Class book=new Class("CoreJava","sushma",900);
		book.bookDetails();
		System.out.println("Discount Applied:");
		book.discount(25);
		System.out.println("price After Discount");
		book.bookDetails();
		}
	}