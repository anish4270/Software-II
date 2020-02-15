/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwares2groupproject;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;


    //adding a reservation to the linked list
    void addReservation(java.text.SimpleDateFormat d, String n){
        reservation_node newNode = new reservation_node(d, n);
        if(head == null){
            head = newNode;
        }
        else{
            reservation_node next = head;
            reservation_node before = head;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH");
            Date date1 = sdf.parse(next.reservation_date);
            Date date2 = sdf.parse(before.reservation_date);
            while (next.reservation_date.before(newNode.reservation_date) < 0 && next.next != null){
                before = next;
                next = next.next;
            }
            newNode.next = next;
            before.next = newNode;
            System.out.println("Reservation added");
        }
    }
}