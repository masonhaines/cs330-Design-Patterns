package SlotsAbstract;

public class WashingtonFactory implements SlotMachineFactory{
    String type = "Washington";
        
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
