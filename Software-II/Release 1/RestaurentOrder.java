import java.util.Scanner;
public class RestaurentOrder
{
    private static double itemPrice;
    static boolean ordering = true;
    static Scanner input = new Scanner(System.in);
    static double j=0.0;
    public static void main(String[] args) {
        int menuOption;
        int foodItem = 0;
        input = new Scanner(System.in);
        double currentTotal=0;
        while(ordering)
        {
            menu();
            menuOption = input.nextInt();
            switch(menuOption){
                case 1:
                    foodItem = 1;
                    currentTotal += ItemPrice(foodItem);
                    break;
                case 2:
                    foodItem = 2;
                    currentTotal += ItemPrice(foodItem);
                    break;
                case 3:
                    foodItem = 3;
                    currentTotal += ItemPrice(foodItem);
                case 4:
                    foodItem = 4;
                    currentTotal+= ItemPrice(foodItem);
                    break;
                case 5:
                    foodItem = 5;
                    currentTotal+= ItemPrice(foodItem);
                    break;
                case 6:
                    done(currentTotal);
                    break;
                default:
                    System.out.println("You have choose an invalid option.");
            }
        }
        System.out.println("Your total is: $" + currentTotal);
    }
    public static void menu() {
        System.out.println("Welcome User!!!!  \nChoose the order from the menu below \n\n1. Burger ($3.00) \n2. Fries ($2.00)\n3. Taco($2.50) \n4. Slice Pizza($3.00) \n5. Soda($1.50) \n6. Finish Order ");
        System.out.println("Please select the order: ");
    }

    public static double ItemPrice(int foodItem) {
        if (foodItem == 1) {
            // burger= $2.00
            System.out.println("You have selected a burger");
            itemPrice = 3.00;
        }
        if (foodItem == 2) {
            // fries = $1.50
            System.out.println("You have selected fries");
            itemPrice = 2.00;
        }
        if (foodItem == 3) {
            // soda = $1.00
            System.out.println("You have selected a Taco");
            itemPrice = 2.50;
        }
        if (foodItem==4){
            //Slice Pizza=$2.50
            System.out.println("You have selected a Slice of Pizza");
            itemPrice=3.00;
        }
        if (foodItem==5){
            System.out.println("You have selected a Soda");
            itemPrice=1.50;
        }
        quantity();
        return j;
    }

    public static double quantity() {
        System.out.println("Enter the quantity");
        double quantity = input.nextDouble();
        subTotal(quantity, itemPrice);
        return quantity;
    }

    public static double subTotal(double quantity, double itemPrice) {
        double subTotal = quantity * itemPrice;
        System.out.println("Subtotal: $" + subTotal);
        j=subTotal;
        return subTotal;
    }

    public static void done(double currentTotal) {
        ordering = false;
        System.out.println("Enjoy your meal ");
    }
}
