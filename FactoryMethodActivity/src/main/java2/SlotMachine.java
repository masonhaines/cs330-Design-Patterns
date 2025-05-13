public abstract class SlotMachine {
  Cabinet cabinet;
  Display display;
  Payment payment;
  GPU gpu;
  OS os;
  String name;

  void play() {
    System.out.println("name");
    System.out.println("Cabinet type: " + cabinet.getType());
    System.out.println(", Payment type: " + payment.getType());
    System.out.println(", Display type: " + display.getType());
    System.out.println(", GPU type: " + gpu.getType());
    System.out.println(", Operating System: " + os.getType());

  }
}