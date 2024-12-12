package Inheretance;

public class AnimalCat extends Animal {
	public void makeSound() {
		System.out.println(" Cat Makes Sound");
	}
	public static void main(String[] args) {
		Animal a=new AnimalCat();
		a.makeSound();
	}
}
