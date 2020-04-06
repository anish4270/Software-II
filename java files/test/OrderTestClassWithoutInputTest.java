/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwares2groupproject;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Grant
 */
public class OrderTestClassWithoutInputTest {
    OrderTestClassWithoutInput order;
    public OrderTestClassWithoutInputTest() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of testGetOrder method, of class OrderTestClassWithoutInput.
     */
    @Test
    public void testGetOrder() {
        System.out.println("\n\ntest setup \n\n");
        OrderTestClassWithoutInput instance = new OrderTestClassWithoutInput();
        List<Integer> InputArray = new ArrayList<Integer>();
        //input is one of each order, 2nd number doesnt matter as long as its not 0
        InputArray.add(1);
        InputArray.add(1);
        InputArray.add(2);
        InputArray.add(2);
        InputArray.add(3);
        InputArray.add(3);
        InputArray.add(4);
        //exit loop
        InputArray.add(0);
        //confirm selection
        InputArray.add(0);
        instance.OrderTestClassWithoutInput(InputArray);
        System.out.println("\n\ntest setup end \n\n");
        System.out.println("\n\ntest GetOrder\n\n");
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        List<Integer> output = instance.getOrder();
        assertEquals(expected, output);
    }

    /**
     * Test of testMenu method, of class OrderTestClassWithoutInput.
     */
    @Test
    public void testMenu() {
        System.out.println("\n\ntestMenu\n\n");
        OrderTestClassWithoutInput instance = new OrderTestClassWithoutInput();
        String menuOut = instance.menu();
        String output = ("1. Tacos $3\n2. Burrito $5\n3. Chimichanga $6\n4. Enchiladas $6");
        assertEquals(output,menuOut);
    }

    /**
     * Test of testCalcPrice method, of class OrderTestClassWithoutInput.
     */
    @Test
    public void testCalcPrice() {
        System.out.println("\n\ntestCalcPrice\n\n");
        OrderTestClassWithoutInput instance = new OrderTestClassWithoutInput();
        List<Integer> InputArray = new ArrayList<Integer>();
        //input is one of each order, 2nd number doesnt matter as long as its not 0
        InputArray.add(1);
        InputArray.add(1);
        InputArray.add(2);
        InputArray.add(2);
        InputArray.add(3);
        InputArray.add(3);
        InputArray.add(4);
        //exit loop
        InputArray.add(0);
        //confirm selection
        InputArray.add(0);
        instance.OrderTestClassWithoutInput(InputArray);
        int out = instance.calcPrice(instance.getOrder());
        int expected = 3 + 5 + 6 + 6;
        assertEquals(out, expected);
    }

    /**
     * Test of testOrder method, of class OrderTestClassWithoutInput.
     */
    @Test
    public void testOrder() {
        System.out.println("\n\ntestOrder\n\n");
        //other functions are dependent on this run
        assert(true);
    }
    
}
