public class Main {
  public static void main(String[] args) {
    Pizza pizza = new Pizza();
    System.out.println("\nPizza One:");
    pizza.ordered();
    pizza.built();
    pizza.baked();
    pizza.delivered();

    System.out.println("");

    Pizza pizzaTwo = new Pizza();
    System.out.println("\nPizza Two:");
    pizzaTwo.baked();
    pizzaTwo.ordered();
  }
}