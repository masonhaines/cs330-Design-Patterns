package SlotsAbstract;

public class NewJerseyFactory implements SlotMachineFactory{
    String type = "New Jersey";
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
