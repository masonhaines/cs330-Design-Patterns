public class washingtonFactory implements SlotMachineFactory{
    String type = "Washington";
    public SlotMachine createStraight() {
        return new Straight(type);
    }
    public SlotMachine createBonus() {
        return new Bonus(type);
    }
    public SlotMachine createProgressive() {
        return new Progressive(type);
    }
}