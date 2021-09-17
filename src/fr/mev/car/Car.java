package fr.mev.car;

public class Car {
	
	private String name;
	private double full;
	private double max_full;
	private boolean motorised;
	
	public Car(String name, double full, double max_full, Boolean motorised) {
		this.name = name;
		this.full = full;
		this.max_full = full;
		this.motorised = motorised;
	}
	
	public String getName() {
		return name;
	}
	
	public double getFull() {
		return full;
	}
	
	public double getMaxFull() {
		return max_full;
	}
	
	public void addFull(double fulled) {
		if(full < max_full) {
			this.full += fulled;
		} 
		
		if(fulled >= max_full) {
			double sous = full + fulled - max_full;
			this.full += sous;
		}
	}

}
