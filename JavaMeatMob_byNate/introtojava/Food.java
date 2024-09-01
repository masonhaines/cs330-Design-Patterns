public class Food extends MenuItem {
    private boolean ketchup;
    private boolean mustard;


    public Food(String name, double cost, int reward) {
        super(name, cost, reward);
        ketchup = false;
        mustard = false;
    }

    public void need_ketchup(boolean wants) {
        this.ketchup = wants;
        if (wants) {
            double new_cost = this.get_cost() + 0.25;
            this.set_cost(new_cost);
        }
    }

    public boolean has_ketchup(MenuItem item) {
        return ketchup;
    }

    public void need_mustard(boolean wants) {
        this.mustard = wants;
        if (wants) {
            double new_cost = this.get_cost() + 0.25;
            this.set_cost(new_cost);
        }
    }

    public boolean has_mustard() {
        return mustard;
    }
}
