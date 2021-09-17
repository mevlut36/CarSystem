package fr.mev.car;

public class Main {

	public static void main(String[] args) {
		Car merco = new Car("Merco", 50, 350, true);
		merco.addFull(600);
		System.out.println(merco.getName() + " "+ merco.getFull() + "L");

	}
	
	public interface Fulled {
		boolean beFulled = true;
	}

}
