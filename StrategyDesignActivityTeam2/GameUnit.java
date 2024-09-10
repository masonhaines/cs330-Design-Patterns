public class GameUnit {
  MoveBehavior moveBehavior;
  AttackBehavior attackBehavior;

  public GameUnit(MoveBehavior moveBehavior, AttackBehavior attackBehavior) {
    this.moveBehavior = moveBehavior;
    this.attackBehavior = attackBehavior;
  }
  
  public void attack() {
    attackBehavior.attack();
  }

  public void move() {
    moveBehavior.move();
  }

  public void pickupWeapon(AttackBehavior attackBehavior){ // Assignment 3
    if(attackBehavior != getAttackBehavior()) this.attackBehavior = attackBehavior;
  }

  public void setMoveBehavior(MoveBehavior moveBehavior) {
    this.moveBehavior = moveBehavior;
  }
  public void setAttackBehavior(AttackBehavior attackBehavior) {
    this.attackBehavior = attackBehavior;
  }
  public AttackBehavior getAttackBehavior() {
    return attackBehavior;
  }
  public MoveBehavior getMoveBehavior() {
    return moveBehavior;
  }
}