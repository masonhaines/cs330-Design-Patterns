package SlotsAbstract;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SlotMachineFactory nevadaMachine = new NevadaFactory();
		SlotMachineFactory washingtonMachine = new WashingtonFactory();
		SlotMachineFactory newjerseyMachine = new NewJerseyFactory();
		
		SlotMachine nevadaStraight = nevadaMachine.createStraight();
		nevadaStraight.play();
		
		SlotMachine washingtonBonus = washingtonMachine.createBonus();
		washingtonBonus.play();
		
		SlotMachine newjerseyProgressive = newjerseyMachine.createProgressive();
		newjerseyProgressive.play();
		
	}

}
