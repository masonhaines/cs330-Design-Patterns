import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is your name and phone number?");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Number: ");
        int phone_number = scanner.nextInt();

        Customer NewCustomer = new Customer(name, phone_number);
        System.out.println();
        
        do {
            System.out.println("Choose an item to add to the menu:");
            System.out.println("1. Burger $9.50");
            System.out.println("2. Fries $3.50");
            System.out.println("3. Hot Dog $4.99");
            System.out.println("4. Shake $4.00");
            System.out.println("5. Soft Drink $2.50");

            System.out.println();
            System.out.print("Choice >> ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    NewCustomer.add_item_to_order(new Food("Burger", 9.50, 50), scanner);
                    System.out.println();
                    break;
                case 2:
                    NewCustomer.add_item_to_order(new Food("Fries", 3.50, 20), scanner);
                    System.out.println();
                    break;
                case 3:
                    NewCustomer.add_item_to_order(new Food("Hot Dog", 4.99, 40), scanner);
                    System.out.println();
                    break;
                case 4:
                    NewCustomer.add_item_to_order(new Drink("Shake", 4.00, 25), scanner);
                    System.out.println();
                    break;
                case 5:
                    NewCustomer.add_item_to_order(new Drink("Soft Drink", 2.50, 15), scanner);
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            if (NewCustomer.get_num_items() >= 10) {
                System.out.println("Menu is full. No more items can be added.");
                break;
            }

            System.out.print("Do you want to add another item? (yes/no): ");
            String order_more = scanner.nextLine();
            System.out.println();

            if (order_more.equalsIgnoreCase("no")) {
                break;
            }
        } while (true);

        NewCustomer.display_order();

        scanner.close();
    }
}
