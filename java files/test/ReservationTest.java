/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwares2groupproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Grant
 */
public class ReservationTest {

    public ReservationTest() {
        
    }
    
    @Before
    public void setUp() {
    }
    @After
    public void tearDown() {
    }

    /**
     * Test of parseDate method, of class Reservation.
     */
    @Test
    public void testParseDate() {
        //pasre date is a utility function to load the date format from a string
        //I cant find a reliable way to set the date without using simpleDateFormat
        System.out.println("parseDate Test");
        String date = "2020/02/14";
        Date expResult = new Date("Fri Feb 14 00:00:00 CST 2020");
        Date result = Reservation.parseDate(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of addReservation method, of class Reservation.
     */
    @Test
    public void testAddReservation() {
        System.out.println("");
        System.out.println("");
        System.out.println("Setting up testing");
        Reservation reservationTest1 = new Reservation();
        String dHead = "2020/02/01";
        String nHead = "GenericName1";
        String d1 = "2020/02/02";
        String n1 = "GenericName2";
        String d2 = "2020/02/03";
        String n2 = "GenericName3";
        String d3 = "2020/02/04";
        String n3 = "GenericName4";
        String d4 = "2020/02/05";
        String n4 = "GenericName5";
        reservationTest1.addReservation(dHead, nHead);
        reservationTest1.addReservation(d1,n1);
        reservationTest1.addReservation(d2,n2);
        reservationTest1.addReservation(d3,n3);
        reservationTest1.addReservation(d4,n4);
        System.out.println("");
        System.out.println("");
        System.out.println("addReservation Test");
        //test head
        assertEquals("GenericName1", reservationTest1.head.name);
        Date expResult1 = new Date("Sat Feb 01 00:00:00 CST 2020");
        assertEquals(expResult1, reservationTest1.head.reservation_date);
        //test next
        assertEquals("GenericName2", reservationTest1.head.next.name);
        Date expResult2 = new Date("Sun Feb 02 00:00:00 CST 2020");
        assertEquals(expResult2, reservationTest1.head.next.reservation_date);
        //test final
        assertEquals("GenericName3", reservationTest1.head.next.next.name);
        Date expResult3 = new Date("Mon Feb 03 00:00:00 CST 2020");
        assertEquals(expResult3, reservationTest1.head.next.next.reservation_date);
        //the linked list stores and links the data if all tests pass
    }

    /**
     * Test of deleteReservation method, of class Reservation.
     */
    @Test
    public void testDeleteReservation() {
        System.out.println("");
        System.out.println("");
        System.out.println("Setting up testing");
        Reservation reservationTest2 = new Reservation();
        String dHead = "2020/02/01";
        String nHead = "GenericName1";
        String d1 = "2020/02/02";
        String n1 = "GenericName2";
        String d2 = "2020/02/03";
        String n2 = "GenericName3";
        String d3 = "2020/02/04";
        String n3 = "GenericName4";
        String d4 = "2020/02/05";
        String n4 = "GenericName5";
        reservationTest2.addReservation(dHead, nHead);
        reservationTest2.addReservation(d1,n1);
        reservationTest2.addReservation(d2,n2);
        reservationTest2.addReservation(d3,n3);
        reservationTest2.addReservation(d4,n4);
        System.out.println("");
        System.out.println("");
        System.out.println("deleteReservation Test");
        
        //Linked list is 5 long from SetUp();
        //for the final node it should be null
        reservationTest2.deleteReservation(d4,n4);
        assertEquals(reservationTest2.head.next.next.next.next, null);
        //now linked list is 4 long
        
        //for middle (3) node it should take on node 4's data
        reservationTest2.deleteReservation(d2, n2);
        Date expectedResult = new Date("Sun Feb 04 00:00:00 CST 2020");
        assertEquals(reservationTest2.head.next.next.name, "GenericName4");
        assertEquals(reservationTest2.head.next.next.reservation_date, expectedResult);
        
        //for head the head should switch to node 2's data
        reservationTest2.deleteReservation(dHead, nHead);
        assertEquals(reservationTest2.head.name, "GenericName2");
        expectedResult = new Date("Sun Feb 02 00:00:00 CST 2020");
        assertEquals(reservationTest2.head.reservation_date, expectedResult);
    }

    /**
     * Test of findReservation method, of class Reservation.
     */
    @Test
    public void testFindReservation() {
        System.out.println("");
        System.out.println("");
        System.out.println("Setting up testing");
        Reservation reservationTest3 = new Reservation();
        String dHead = "2020/02/01";
        String nHead = "GenericName1";
        String d1 = "2020/02/02";
        String n1 = "GenericName2";
        String d2 = "2020/02/03";
        String n2 = "GenericName3";
        String d3 = "2020/02/04";
        String n3 = "GenericName4";
        String d4 = "2020/02/05";
        String n4 = "GenericName5";
        reservationTest3.addReservation(dHead, nHead);
        reservationTest3.addReservation(d1,n1);
        reservationTest3.addReservation(d2,n2);
        reservationTest3.addReservation(d3,n3);
        reservationTest3.addReservation(d4,n4);
        System.out.println("");
        System.out.println("");
        System.out.println("findReservation Test");
        String output1 = reservationTest3.findReservation(dHead, nHead);
        String expectedOutput1 = nHead + "at" + dHead;
        assertEquals(output1,expectedOutput1);
        String output2 = reservationTest3.findReservation(d4, n4);
        String expectedOutput2 = n4 + "at" + d4;
        assertEquals(output2,expectedOutput2);
    }
    
}
