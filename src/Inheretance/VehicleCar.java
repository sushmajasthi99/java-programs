package Inheretance;

public class VehicleCar extends Vehicle {
	public void drive() {
		System.out.println("Reparing car");
	}
		public static void main(String[] args) {
			Vehicle v=new VehicleCar();
			v.drive();
		}
}