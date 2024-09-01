import java.util.Scanner;

public class Customer {
    private String name;
    private int phone_number;
    private int reward_points;
    private MenuItem[] order;
    private int num_items;

    public Customer(String name, int phone_number) {
        order = new MenuItem[10];
        this.name = name;
        this.phone_number = phone_number;
        reward_points = 0;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String get_name() {
        return name;
    }

    public int get_num_items() {
        return num_items;
    }

    public void set_phone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public int get_phone_number() {
        return phone_number;
    }

    public int get_reward_points() {
        return reward_points;
    }

    public void add_points(int points) {
        reward_points += points;
    }

    public MenuItem use_points(MenuItem item) {
        reward_points -= item.get_reward();
        item.set_cost(0);
        return item;
    }

    public void add_item_to_order(MenuItem item, Scanner scanner) {
        if (num_items < order.length) {
            if (item.getClass() == Food.class) {
                System.out.println();
                System.out.print("Add ketchup? ");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("yes")) {
                    System.out.println("Ketchup added to item");
                    ((Food)item).need_ketchup(true);
                }
                else {
                    System.out.println("Ketchup not added to item");
                }
                System.out.println();
                System.out.print("Add mustard? ");
                choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("yes")) {
                    System.out.println("Mustard added to item");
                    ((Food)item).need_mustard(true);
                }
                else {
                    System.out.println("Mustard not added to item");
                }
            } 
            else if (item.getClass() == Drink.class) {
                System.out.println();
                System.out.print("What size? (16/32) ");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("16")) {
                    System.out.println();
                    System.out.println("Medium drink added to order");
                    ((Drink)item).set_size(16);
                }
                else if (choice.equalsIgnoreCase("yes")) {
                    System.out.println();
                    System.out.println("Large drink added to order");
                    ((Drink)item).set_size(32);
                }

                System.out.println();
                System.out.print("Include straw? ");
                choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("yes")) {
                    System.out.println("Straw included");
                    ((Drink)item).need_straw(true);
                }
                else {
                    System.out.println("Straw not included");
                }
            }

            if (reward_points >= item.get_reward()) {
                System.out.println();
                System.out.print("Use " + item.get_reward() + " points? (yes/no) (balance: " + reward_points + ") ");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("yes")) {
                    item = use_points(item);
                    System.out.println();
                    System.out.println(item.get_name() + " is now free!");
                    System.out.println();
                }
                else {
                    System.out.println();
                    System.out.println("Opted not to use points.");
                    this.add_points(item.get_reward());
                }
            }
            else {
                this.add_points(item.get_reward());
            }
            order[num_items] = item;
            num_items++;
            System.out.println();
            System.out.println("Reward balance: " + reward_points);
        }
        else {
            System.out.println();
            System.out.println("You have the maximum number of items");
        }
    }

    public MenuItem[] get_order() {
        return order;
    }

    public void display_order() {
        for (int i = 0; i < num_items; i++) {
            String two_dec = String.format("%.2f", order[i].get_cost());
            System.out.println((i + 1) + ". " + order[i].get_name() + " $" + two_dec);
        }
        calculate_cost();
    }

    public void calculate_cost() {
        double total = 0;
        for (int i = 0; i < num_items; i++) {
            total += order[i].get_cost();
        }
        double tax = 1.07;
        String two_dec = String.format("%.2f", total * tax);
        System.out.println("Your total is: $" + two_dec);
    }
}