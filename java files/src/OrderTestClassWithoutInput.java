package softwares2groupproject;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * due to the while loop and user input for the order class i have remade a dummy class that takes input in the form of an array.
 * This code is functionally the same as the Order class but returns values for testing
 * instances requiring input have been replaced
 * the while loop is now bound to the length of input
 * @author Grant
 */
public class OrderTestClassWithoutInput {

    List<Integer> order_Array;
    int cost = 0;
    List<Integer> getOrder(){
        return order_Array;
    }
    //basic menu output
    String menu(){
        System.out.println("1. Tacos $3");
        System.out.println("2. Burrito $5");
        System.out.println("3. Chimichanga $6");
        System.out.println("4. Enchiladas $6");
        String output = ("1. Tacos $3\n2. Burrito $5\n3. Chimichanga $6\n4. Enchiladas $6");
        return output;
    }
    int calcPrice(List<Integer> order_ArrayTest){
        int price = 0;
        for (int i = 0;i<order_ArrayTest.size();i++){
            if (order_ArrayTest.get(i) == 1){
                    price = price + 3;
                    System.out.println("1. Tacos $3");
                    System.out.println("total $" + price);
            }
            else if (order_ArrayTest.get(i) == 2){
                    price = price + 5;
                    System.out.println("2. Burrito $5");
                    System.out.println("total $" + price);
            }
            else if (order_ArrayTest.get(i) == 3){
                    price = price + 6;
                    System.out.println("3. Chimichanga $6");
                    System.out.println("total $" + price);
            }
            else if (order_ArrayTest.get(i) == 4){
                    price = price + 6;
                    System.out.println("4. Enchiladas $6");
                    System.out.println("total $" + price);
            }
        }
        return price;
    }

    //scans input from user to take orders in
    void OrderTestClassWithoutInput(List<Integer> ArrayOfInput){
        
        int mult = 1;  
        int ID;
        int I = 0;
        int confirm = 1;
        //Replace incapsulating while loop with for loop simulating input
        for (int i = 0;i<ArrayOfInput.size()-1;i++){
            //remakes the orderArray if the confirmation fails
            List<Integer> orderArray = new ArrayList<Integer>();
            //exit condition on inputing new orders
            while(mult != 0){
                if (mult != 0){
                    //print menu every time, could be moved up to the confrim while to only show once
                    //menu();
                    System.out.println("Please Enter the Id of the food you wish to order: ");
                    ID = ArrayOfInput.get(i);
                    i++;
                    //check if valid ID
                    if (ID > 4 | ID < 1) {
                        System.out.println("invalid input");
                        mult = 1;
                    }
                    //add to array if valid
                    else{
                        orderArray.add(ID);
                        I++;
                        System.out.println("Would you like to order another item? (0 = no) ");
                        mult = ArrayOfInput.get(i);
                        i++;
                    }
                }
            }
            //confirm order section
            System.out.println("confirm order:" + orderArray + "(0 = confirm 1 = restart)");
            mult = ArrayOfInput.get(i);
            //if not confirmed then the array is wiped and remade
            if (mult != 0){
                orderArray = null;
                confirm = 1;
            }
            //else send it through and calculate price
            else {
                confirm = 0;
                order_Array = orderArray;
                calcPrice(orderArray);
                System.out.println("the cost of this order will be $" + cost);
            }
        }
    }
}
