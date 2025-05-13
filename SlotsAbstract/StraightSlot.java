package SlotsAbstract;

public class StraightSlot extends SlotMachine {
	StraightSlot(String type) {
		name = type;
		
		if(name == "Nevada") {
			cabinet = new LargeCabinet();
			display = new Reels();
			payment = new Ticket();
			cpu = new ARM();
			os = new Linux();
			name = name + " Straight";
		} else if (name == "NewJersey") {
			cabinet = new SmallCabinet();
			display = new LCD();
			payment = new Coins();
			cpu = new ARM();
			os = new WindowsME();
			name = name + " Straight";
		} else if (name == "Washington") {
			cabinet = new LargeCabinet();
			display = new Reels();
			payment = new Bills();
			cpu = new ARM();
			os = new Linux();
			name = name + " Straight";
		}
	}
	
}
