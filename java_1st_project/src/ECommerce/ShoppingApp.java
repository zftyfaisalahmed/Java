package ECommerce;

import java.util.*;

public class ShoppingApp {
    private static Scanner sc = new Scanner(System.in);
    private static List<String> cartItems = new ArrayList<>();
    private static List<Integer> cartPrices = new ArrayList<>();

    public static void main(String[] args) {
        // Collect user details
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        boolean shopping = true;

        while (shopping) {
            System.out.println("\nCategories:");
            System.out.println("1. Electronic");
            System.out.println("2. Home");
            System.out.println("3. Clothes");
            System.out.println("4. Fashion");
            System.out.println("5. Study");
            System.out.print("Enter Your Choice: ");
            int categoryChoice = sc.nextInt();

            switch (categoryChoice) {
                case 1:
                    selectSubCategory("Electronic",
                            new String[] { "Laptop", "Mouse", "Pen drive", "CPU", "LCD Screen" },
                            new String[] { "Dell - $800", "Logitech - $30", "Kingston - $25", "Intel i7 - $400",
                                    "Samsung - $150" },
                            new int[] { 800, 30, 25, 400, 150 });
                    break;
                case 2:
                    selectSubCategory("Home", new String[] { "Furniture", "Kitchen", "Decor", "Bedding", "Lighting" },
                            new String[] { "Sofa - $500", "Microwave - $120", "Wall Art - $50", "Queen Bed - $700",
                                    "Chandelier - $300" },
                            new int[] { 500, 120, 50, 700, 300 });
                    break;
                case 3:
                    selectSubCategory("Cloths",
                            new String[] { "Men's Wear", "Women's Wear", "Kids' Wear", "Accessories", "Footwear" },
                            new String[] { "Shirts - $1500", "Pants - $2000", "Suits - $5000", "T-shirts - $800" },
                            new int[] { 1500, 2000, 5000, 800 });
                    break;
                case 4:
                    selectSubCategory("Fashion",
                            new String[] { "Watches", "Jewelry", "Bags", "Sunglasses", "Perfumes" },
                            new String[] { "Rolex - $5000", "Diamond Ring - $3000", "Gucci Bag - $2000",
                                    "RayBan - $250", "Chanel - $500" },
                            new int[] { 5000, 3000, 2000, 250, 500 });
                    break;
                case 5:
                    selectSubCategory("Study", new String[] { "Books", "Stationery", "Courses", "Software", "Gadgets" },
                            new String[] { "Java Book - $50", "Pens - $5", "Python Course - $200",
                                    "Microsoft Office - $120", "Calculator - $25" },
                            new int[] { 50, 5, 200, 120, 25 });
                    break;
                default:
                    System.out.println("Category not available.");
            }

            System.out.print("\nDo you want to continue shopping? (y/n): ");
            char continueShopping = sc.next().charAt(0);
            if (continueShopping == 'n' || continueShopping == 'N') {
                shopping = false;
            }
        }

        checkout(name, email);
    }

    private static void selectSubCategory(String categoryName, String[] subCategories, String[] items, int[] prices) {
        System.out.println("\nCategory selected: " + categoryName);
        System.out.println("=================");
        System.out.println(categoryName + ": Sub Category:");
        for (int i = 0; i < subCategories.length; i++) {
            System.out.println(subCategories[i] + " --> For Press: " + (i + 1));
        }

        System.out.print("Enter Your choice: ");
        int subChoice = sc.nextInt();

        System.out.println("\nDisplay item with price:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " -- For press: " + (i + 1));
        }

        System.out.print("Enter Your Choice: ");
        int itemChoice = sc.nextInt();

        String selectedItem = items[itemChoice - 1].split(" - ")[0];
        int selectedPrice = prices[itemChoice - 1];

        System.out.println("You have chosen this item: " + selectedItem + " - $" + selectedPrice);
        System.out.print("What do you want to do? ----- for purchasing press 'p' for add to cart press 'a': ");
        char action = sc.next().charAt(0);

        if (action == 'a' || action == 'A') {
            cartItems.add(selectedItem);
            cartPrices.add(selectedPrice);
            System.out.println("Item added to cart successfully!");
        } else if (action == 'p' || action == 'P') {
            cartItems.add(selectedItem);
            cartPrices.add(selectedPrice);
            System.out.println("Item purchased successfully!");
        } else {
            System.out.println("Invalid choice! Item not added.");
        }
    }

    private static void checkout(String name, String email) {
        if (cartItems.isEmpty()) {
            System.out.println("\nYour cart is empty.");
            return;
        }

        System.out.println("\nYour cart contains:");
        for (String item : cartItems) {
            System.out.println(item);
        }

        System.out.print("\nDo you want to purchase the items in your cart? (y/n): ");
        char confirmPurchase = sc.next().charAt(0);

        int totalAmount = 0;
        if (confirmPurchase == 'y' || confirmPurchase == 'Y') {
            for (int price : cartPrices) {
                totalAmount += price;
            }
        } else {
            cartItems.clear();
            cartPrices.clear();
            System.out.println("\nYou did not purchase any items.");
        }

        // Print Bill
        System.out.println("\n*********** BILL RECEIPT ***********");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("\nPurchased Items:");
        System.out.println("Item                 Price");
        System.out.println("------------------------------");
        for (int i = 0; i < cartItems.size(); i++) {
            System.out.printf("%-20s $%d\n", cartItems.get(i), cartPrices.get(i));
        }
        System.out.println("------------------------------");
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("***********************************");
        System.out.println("Thank you for shopping with us, " + name + "!");
        System.out.println("We hope to see you again soon!");
    }
}
