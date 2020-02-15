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

