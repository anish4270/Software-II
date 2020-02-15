
package softwares2groupproject;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Reservation {
    //a linked list data structure to hold reservations
    //reservations will be ordered by date of Reservation, earliest reservations at head
    reservation_node head;
    
    Reservation(){  
        head = null;
    }
    //the actual reservation information will be stored in the node
    static class reservation_node{
        java.text.SimpleDateFormat reservation_date;
        String name; 
        reservation_node next;
        reservation_node(java.text.SimpleDateFormat d, String n){
            name = n;
            d = reservation_date;
            next = null;
        }
    }
    //adding a reservation to the linked list
    void addReservation(java.text.SimpleDateFormat d, String n){
        reservation_node newNode = new reservation_node(d, n);
        if(head == null){
            head = newNode;
        }
        else{
            reservation_node next = head;
            while (next.next != null){
                next = next.next;
            }
            newNode.next = next;
            System.out.println("Reservation added");
        }
    }
    //delete a reservation from the linked list
    void deleteReservation(java.text.SimpleDateFormat date, String name){
        reservation_node currNode = head;
        reservation_node prev = currNode;
        //node to delete is head
        if (currNode != null && currNode.name == name && currNode.reservation_date == date){
            head = head.next;
        }
        //itterate through linked list to find node
        while (currNode != null && currNode.name != name && currNode.reservation_date != date){
            prev = currNode;
            currNode = currNode.next;
        }
        //if node is found will exit while on correct node
        if (currNode != null && currNode.name == name && currNode.reservation_date == date ){
            prev.next = currNode.next;
            System.out.println("Reservation deleted");
        }
        else{
            System.out.println("could not find reservation to delete");
        }
    }
    //itterate through a linked list to find the node
    reservation_node findReservation(java.text.SimpleDateFormat date, String name){
        reservation_node currNode = head;
        while(currNode != null && currNode.name != name && currNode.reservation_date != date ){
            currNode = currNode.next;
        }
        if (currNode != null && currNode.name == name && currNode.reservation_date == date){
            return currNode;
        }
        else {
            System.out.println("could not find reservation");
            return null;
        }
    }
    
    
}
