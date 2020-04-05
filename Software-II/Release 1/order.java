package softwares2groupproject;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Order {

    List<Integer> order_Array;
    int cost = 0;
    List<Integer> getOrder(){
        return order_Array;
    }
    //basic menu output
    void menu(){
        System.out.println("1. Tacos $3");
        System.out.println("2. Burrito $5");
        System.out.println("3. Chimichanga $6");
        System.out.println("4. Enchiladas $6");
    }
    //should add together the prices but currently doesnt
    void calcPrice(){
        int price = 0;
        for (int i = order_Array.size()-1;i>-1;i--){
            if (order_Array.get(i) == 1){
                    price = price + 3;
                    System.out.println("1. Tacos $3");
                    System.out.println("total $" + price);
            }
            else if (order_Array.get(i) == 2){
                    price = price + 5;
                    System.out.println("2. Burrito $5");
                    System.out.println("total $" + price);
            }
            else if (order_Array.get(i) == 3){
                    price = price + 6;
                    System.out.println("3. Chimichanga $6");
                    System.out.println("total $" + price);
            }
            else if (order_Array.get(i) == 4){
                    price = price + 6;
                    System.out.println("4. Enchiladas $6");
                    System.out.println("total $" + price);
            }
        }
        System.out.println(price);
        cost = price;
    }
    //scans input from user to take orders in
    void Order(){
        Scanner scan = new Scanner(System.in);
        int mult = 1;  
        int ID;
        int I = 0;
        int confirm = 1;
        //this while block will reset the order if not confirmed at the end
        while (confirm != 0){
            //remakes the orderArray if the confirmation fails
            List<Integer> orderArray = new ArrayList<Integer>();
            //exit condition on inputing new orders
            while(mult != 0){
                if (mult != 0){
                    //print menu every time, could be moved up to the confrim while to only show once
                    menu();
                    System.out.println("Please Enter the Id of the food you wish to order: ");
                    ID = scan.nextInt();
                    //check if valid ID
                    if (ID > 4 | ID < 0) {
                        System.out.println("invalid input");
                        mult = 1;
                    }
                    //add to array if valid
                    else{
                        orderArray.add(ID);
                        I++;
                        System.out.println("Would you like to order another item? (0 = no) ");
                        mult = scan.nextInt();
                    }
                }
            }
            //confirm order section
            int confirm2 = 1;
            while(confirm2 == 1)
            {
                System.out.println("confirm order:" + orderArray + "(0 = confirm 1 = restart 2 = remove item from order)");
                mult = scan.nextInt();
                //if not confirmed then the array is wiped and remade
                if (mult == 2)
                {
                    menu();
                    System.out.print("Enter the ID of the food you wish to remove: ");
                        ID = scan.nextInt();
                    for (int i = orderArray.size()-1;i>-1;i--)
                    {
                        if(orderArray.get(i) == ID)
                        {
                            orderArray.remove(i);
                            break;
                        }
                    }
                
                }
                else if (mult != 0){
                    orderArray = null;
                    confirm2 = 0;
                    confirm = 1;
                }
                //else send it through and calculate price
                else {
                    confirm2 = 0;
                    confirm = 0;
                    order_Array = orderArray;
                    calcPrice();
                    System.out.println("the cost of this order will be $" + cost);
                }
            }
        }
    }
}
