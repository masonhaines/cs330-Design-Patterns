public class Main {
  public static void main(String[] args) {
    GameUnit grunt = new Grunt(new Walk(), new Pistol());
    GameUnit tank = new Tank(new Driving(), new Canon());
    grunt.move();
    tank.move();
    grunt.attack();
    tank.attack();
  }
}