public class Bonus extends SlotMachine {
  Bonus(String type) {
    name = type;

    if (name == "Nevada") {
      cabinet = new smallCabinet();
      display = new CRT();
      payment = new Ticket();
      gpu = new x86();
      os = new Linux();
      name = name + " Bonus";
    } else if (name == "Washington") {
      cabinet = new MediumCabinet();
      display = new VGA();
      payment = new Ticket();
      gpu = new ARM();
      os = new Symbian();
      name = name + " Bonus";
    } else if (name == "New Jersey") {
      cabinet = new LargeCabinet();
      display = new Reels();
      payment = new Coins();
      gpu = new ARM();
      os = new WindowsME();
      name = name + " Bonus";
    }
  }

}