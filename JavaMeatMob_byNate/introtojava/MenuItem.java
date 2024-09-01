public class MenuItem {
    private String name;
    private double cost;
    private int reward;

    public MenuItem(String name, double cost, int reward) {
        this.name = name;
        this.cost = cost;
        this.reward = reward;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String get_name() {
        return name;
    }

    public void set_cost(double cost) {
        this.cost = cost;
    }

    public double get_cost() {
        return cost;
    }

    public void set_reward(int reward) {
        this.reward = reward;
    }

    public int get_reward() {
        return reward;
    }
}
