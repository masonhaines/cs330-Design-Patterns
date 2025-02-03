public class Baked implements State {
  Pizza pizza;

  public Baked(Pizza pizza) {
    this.pizza = pizza;
  }

  public void ordered() {
    System.out.println("ERROR: Pizza is baking and cant be ordered");
  }

  public void built() {
    System.out.println("ERROR: Pizza is baking and cant be built");
  }

  public void baked() {
    System.out.println("Baking pizza!");
    pizza.setState(pizza.getDelivered());
  }

  public void delivered() {
    System.out.println("ERROR: Pizza needs to be baked before delivered");
  }
}