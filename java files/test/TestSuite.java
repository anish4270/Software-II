/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwares2groupproject;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Grant
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({softwares2groupproject.Softwares2GroupProjectTest.class, softwares2groupproject.OrderTestClassWithoutInputTest.class,softwares2groupproject.ReservationTest.class})
public class TestSuite {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
