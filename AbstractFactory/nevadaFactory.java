public class nevadaFactory implements SlotMachineFactory{
    String type = "Nevada";
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