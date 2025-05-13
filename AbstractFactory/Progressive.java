public class Progressive extends SlotMachine {
  Progressive(String type) {
    name = type;

    if (name == "Nevada") {
        cabinet = new MediumCabinet();
        display = new LCD();
        payment = new Ticket();
        gpu = new x77();
        os = new Android();
        name = name + " Progessive";
    }
    else if (name == "New Jersey") {
        cabinet = new smallCabinet();
        display = new CRT();
        payment = new Bills();
        gpu = new x86();
        os = new WindowsXP();
        name = name + " Progessive";
    }
    else if (name == "Washington") {
        cabinet = new LargeCabinet();
        display = new Reels();
        payment = new Coins();
        gpu = new ARM();
        os = new Android();
        name = name + " Progessive";
    }
  }
  
}