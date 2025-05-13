public class Straight extends SlotMachine {
  Straight(String type) {
    name = type;

    if(name == "Nevada") {
      cabinet = new LargeCabinet();
      display = new Reels();
      payment = new Ticket();
      gpu = new ARM();
      os = new Linux();
      name = name + " Straight";
    } else if (name == "NewJersey") {
      cabinet = new smallCabinet();
      display = new LCD();
      payment = new Coins();
      gpu = new ARM();
      os = new WindowsME();
      name = name + " Straight";
    } else if (name == "Washington") {
      cabinet = new LargeCabinet();
      display = new Reels();
      payment = new Bills();
      gpu = new ARM();
      os = new Linux();
      name = name + " Straight";
    }
  }

}
