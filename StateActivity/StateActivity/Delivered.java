public class Delivered implements State {
  Pizza pizza;

  public Delivered(Pizza pizza) {
    this.pizza = pizza;
  }

  public void ordered() {
    System.out.println("ERROR: Pizza is already ordered!");
  }

  public void built() {
    System.out.println("ERROR: Pizza is already built!");
  }

  public void baked() {
    System.out.println("ERROR: Pizza is already baked!");
  }

  public void delivered() {
    System.out.println("Pizza has been delivered!");
    this.pizza.setState(pizza.getOrdered());
  }

}