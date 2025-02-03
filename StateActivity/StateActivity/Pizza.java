public class Pizza {
  State ordered;
  State built;
  State baked;
  State delivered;
  State currentState;

  public Pizza() {
    System.out.println("Making new Pizza order");
    ordered = new Ordered(this);
    built = new Built(this);
    baked = new Baked(this);
    delivered = new Delivered(this);
    currentState = this.ordered;
  }

  public void setState(State currentState) {
    this.currentState = currentState;
  }

  public State getOrdered() {
    return this.ordered;
  }

  public State getBuilt() {
    return this.built;
  }

  public State getBaked() {
    return this.baked;
  }

  public State getDelivered() {
    return this.delivered;
  }

  public void ordered() {
    currentState.ordered();
  }

  public void built() {
    currentState.built();
  }

  public void baked() {
    currentState.baked();
  }

  public void delivered() {
    currentState.delivered();
  }

}