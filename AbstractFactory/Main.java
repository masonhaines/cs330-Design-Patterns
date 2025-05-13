public class Main {

  public static void main(String[] args) {

    SlotMachineFactory nevadaMachine = new nevadaFactory();
    SlotMachineFactory washingtonMachine = new washingtonFactory();
    SlotMachineFactory newjerseyMachine = new newJerseyFactory();

    SlotMachine nevadaStraight = nevadaMachine.createStraight();
    nevadaStraight.play();

    SlotMachine washingtonBonus = washingtonMachine.createBonus();
    washingtonBonus.play();

    SlotMachine newjerseyProgressive = newjerseyMachine.createProgressive();
    newjerseyProgressive.play();
    
  }

}