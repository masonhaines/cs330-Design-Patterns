package SlotsAbstract;

public class BonusSlot extends SlotMachine{
	BonusSlot(String type) {
        name = type;

        if (name == "Nevada") {
            cabinet = new SmallCabinet();
            display = new CRT();
            payment = new Ticket();
            cpu = new x86();
            os = new Linux();
            name = name + " Bonus";
        }
        else if (name == "Washington") {
            cabinet = new MediumCabinet();
            display = new VGA();
            payment = new Ticket();
            cpu = new ARM();
            os = new Symbian();
            name = name + " Bonus";
        }
        else if (name == "New Jersey") {
            cabinet = new LargeCabinet();
            display = new Reels();
            payment = new Coins();
            cpu = new ARM();
            os = new WindowsME();
            name = name + " Bonus";
        }
    }
}