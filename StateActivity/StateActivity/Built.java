public class Built implements State {
  Pizza pizza;

  public Built(Pizza pizza) {
    this.pizza = pizza;
  }

  public void ordered() {
    System.out.println("ERROR: Pizza is already ordered");
  }

  public void built() {
    System.out.println("Building pizza!");
    pizza.setState(pizza.getBaked());
  }

  public void baked() {
    System.out.println("ERROR: Pizza needs to be built before baking");
  }

  public void delivered() {
    System.out.println("ERROR: Pizza needs to be baked before delivered");
  }
}