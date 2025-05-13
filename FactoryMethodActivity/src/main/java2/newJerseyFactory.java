public class newJerseyFactory implements SlotMachineFactory{
    String type = "New Jersey";
    
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