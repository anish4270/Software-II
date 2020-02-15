/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwares2groupproject;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Softwares2GroupProject {
    public static void main(String[] args) {
        Reservation reservationList = new Reservation();
        //use case 1 create an order
        Order newOrder = new Order();
        newOrder.Order();
        //use case 2 add reservations
        SimpleDateFormat dateFormat = new SimpleDateFormat("2020/02/14/1200");
        reservationList.addReservation(dateFormat, "Becky");
        dateFormat = Date.parse("2020/02/14/1400");
        reservationList.addReservation(dateFormat, "Becky");
        System.out.println(newOrder.getOrder());
    }
    
}
