/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package azure.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kavansol
 */
public class ShopTest {
    
    public ShopTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Shop.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Shop instance = new Shop();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Shop.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Shop instance = new Shop();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStaffName method, of class Shop.
     */
    @Test
    public void testGetStaffName() {
        System.out.println("getStaffName");
        Shop instance = new Shop();
        String[] expResult = null;
        String[] result = instance.getStaffName();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStaffName method, of class Shop.
     */
    @Test
    public void testSetStaffName() {
        System.out.println("setStaffName");
        String[] staffName = null;
        Shop instance = new Shop();
        instance.setStaffName(staffName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}