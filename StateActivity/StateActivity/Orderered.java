class Ordered implements State {
  Pizza pizza;

  public Ordered(Pizza pizza) {
    this.pizza = pizza;
  }

  public void ordered() {
    System.out.println("Ordered Pizza!");
    pizza.setState(pizza.getBuilt());
  }

  public void built() {
    System.out.println("ERROR: Pizza needs to be ordered before built");
  }

  public void baked() {
    System.out.println("ERROR: Pizza needs to be ordered before baked");
  }

  public void delivered() {
    System.out.println("ERROR: Pizza needs to be ordered before delivered");
  }
}