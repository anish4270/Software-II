/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 s*/
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
        System.out.println("System main does nothing currently");
        //use case 1 create an order
        Order newOrder = new Order();
        newOrder.Order();
        //use case 2 add reservations
        reservationList.addReservation("2020/02/14", "Becky");
        reservationList.addReservation("2020/02/15", "Becky2");
        reservationList.addReservation("2020/02/16", "Becky3");
        System.out.println(reservationList.head.name);
        System.out.println(reservationList.head.reservation_date);
        reservationList.deleteReservation("2020/02/14", "Becky");
        System.out.println(reservationList.head.name);
        System.out.println(reservationList.head.reservation_date);
        System.out.println(reservationList.head.next.name);
        System.out.println(reservationList.head.next.reservation_date);
    }
    
}
