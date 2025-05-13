package SlotsAbstract;

public class ProgressiveSlot extends SlotMachine{
    ProgressiveSlot(String type) {
        name = type;

        if (name == "Nevada") {
            cabinet = new MediumCabinet();
            display = new LCD();
            payment = new Ticket();
            cpu = new x77();
            os = new Android();
            name = name + " Progessive";
        }
        else if (name == "New Jersey") {
            cabinet = new SmallCabinet();
            display = new CRT();
            payment = new Bills();
            cpu = new x86();
            os = new WindowsXP();
            name = name + " Progessive";
        }
        else if (name == "Washington") {
            cabinet = new LargeCabinet();
            display = new Reels();
            payment = new Coins();
            cpu = new ARM();
            os = new Android();
            name = name + " Progessive";
        }
    }
}