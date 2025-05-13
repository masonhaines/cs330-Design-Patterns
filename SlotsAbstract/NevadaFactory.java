package SlotsAbstract;

public class NevadaFactory implements SlotMachineFactory{
	String type = "Nevada";
	
	public SlotMachine createStraight() {
		return new StraightSlot(type);
	}
	
	public SlotMachine createBonus() {
		return new BonusSlot(type);
	}
	
	public SlotMachine createProgressive() {
		return new ProgressiveSlot(type);
	}
}
