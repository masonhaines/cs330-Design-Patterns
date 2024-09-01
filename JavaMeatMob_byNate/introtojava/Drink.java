public class Drink extends MenuItem {
    private boolean straw;
    private int size;

    public Drink(String name, double cost, int reward) {
        super(name, cost, reward);
        straw = false;
    }

    public void set_size(int size) {
        if (size == 16 || size == 32) {
            this.size = size;
        }
        else {
            System.out.println("Not a given size");
        }
        if (size == 16) {
            this.set_cost(1.50);
        }
        else if (size == 32) {
            this.set_cost(2.50);
        }
    }

    public int get_size() {
        return size;
    }

    public void need_straw(boolean wants) {
        straw = wants;
        if (wants) {
            double new_cost = this.get_cost() + 0.1;
            this.set_cost(new_cost);
        }
    }

    public boolean has_straw() {
        return straw;
    }
}
