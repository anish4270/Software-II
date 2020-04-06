
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
        Date reservation_date;
        String name; 
        reservation_node next;
        reservation_node(String d, String n){
            name = n;
            reservation_date = parseDate(d);
            next = null;
        }
    }
    
    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy/MM/dd").parse(date);
        } catch (ParseException e) {
            System.out.println("failed to parse Date");
            return null;
        }
    }
    //adding a reservation to the linked list
    void addReservation(String d, String n){
        Date date = parseDate(d);
        System.out.println(date);
        reservation_node newNode = new reservation_node(d, n);
        if(head == null){
            head = newNode;
            System.out.println("Reservation added at head");
        }
        else{
            reservation_node next = head;
            while (next.next != null){
                next = next.next;
            }
            next.next = newNode;
            System.out.println("Reservation added");
        }
    }
    //delete a reservation from the linked list
    void deleteReservation(String d, String name){
        Date date = parseDate(d);
        reservation_node currNode = head;
        reservation_node prev = currNode;
        //node to delete is head
        if (currNode != null && currNode.name.equals(name) && currNode.reservation_date.compareTo(date) == 0){
            head = head.next;
        }
        //itterate through linked list to find node
        while (currNode != null && !currNode.name.equals(name) && currNode.reservation_date.compareTo(date) != 0){
            prev = currNode;
            currNode = currNode.next;
        }
        //if node is found will exit while on correct node
        if (currNode != null && currNode.name.equals(name) && currNode.reservation_date.compareTo(date) == 0){
            prev.next = currNode.next;
            System.out.println("Reservation deleted");
        }
        else{
            System.out.println("could not find reservation to delete");
        }
    }
    //itterate through a linked list to find the node
    String findReservation(String d, String name){
        Date date = parseDate(d);
        reservation_node currNode = head;
        while(currNode != null && !currNode.name.equals(name) && currNode.reservation_date.compareTo(date) != 0 ){
            currNode = currNode.next;
        }
        if (currNode != null && currNode.name.equals(name) && currNode.reservation_date.compareTo(date) == 0){
            
            String Temp = currNode.name + "at" + d;
            return Temp;
        }
        else {
            System.out.println("could not find reservation");
            return null;
        }
    }
    
    
}
