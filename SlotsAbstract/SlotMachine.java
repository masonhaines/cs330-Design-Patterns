package SlotsAbstract;

public abstract class SlotMachine {
	String name;
	Cabinet cabinet;
	CPU cpu;
	Payment payment;
	Display display;
	OS os;
	
	void play() {
		System.out.println("--- Making a " + name + " ---");
		System.out.println("fetching components: " + cabinet.getType() + ", " + payment.getType() + ", " + display.getType() + ", " + cpu.getType());
		System.out.println("assembling components");
		System.out.println("testing hardware");
		System.out.println("uploading software: " + os.getType());
		System.out.println("testing softwawre");
	}
}

