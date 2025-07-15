package coreJava;

public class Car {
	void start(){
		System.out.println("Car started");
	}
	void changeGear(int gn) {
		System.out.println("Gear  changed to "+gn+" gear.");
		if(gn == 0)
			stop();
	}
	void stop() {
		System.out.println("car stopped.");
	}
}
