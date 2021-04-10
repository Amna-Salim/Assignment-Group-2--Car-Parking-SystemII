/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Hashtable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author TOSHIBA
 */
public class Permit_listTest {
    
    public Permit_listTest() {
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
     * Test of checkPermit method, of class Permit_list.
     */
    @Test
    public void testCheckPermit() {
        System.out.println("checkPermit");
        String a = "mazda";
        Permit_list instance = new Permit_list();
        Permit result1 = instance.addPermanentVisitor(a);
        boolean expResult = true;
        boolean result = instance.checkPermit(a);
        assertEquals(expResult, result);
        }


    /**
     * Test of getPermit method, of class Permit_list.
     */
    @Test
    public void testGetPermit() {
        System.out.println("getPermit");
        String a = "jeep";
        String a1 = "12";
        String a2 = "22";
        String a3 = "jhon";
        String a5 = "2";
        String a6 = "1";
        Permit_list instance = new Permit_list();
        
        Permit expResult = instance.addRegularVisitor(a, a1, a2, a3, a5, a6);
        Permit result = instance.getPermit(a);
        assertEquals(expResult, result);
    }


    /**
     * Test of addRegularVisitor method, of class Permit_list.
     */
    @Test
    public void testAddRegularVisitor() {
        System.out.println("addRegularVisitor");
        String a = "mazda";
        String a1 = "12";
        String a2 = "22";
        String a3 = "jhon";
        String a5 = "2";
        String a6 = "1";
        Permit_list instance = new Permit_list();
        Permit result = instance.addRegularVisitor(a, a1, a2, a3, a5, a6);
        Permit expResult = instance.getPermit(a);
        assertEquals(expResult, result);
        }


    /**
     * Test of addDayVisitor method, of class Permit_list.
     */
    @Test
    public void testAddDayVisitor() {
        System.out.println("addDayVisitor");
        String a = "gmc";
        String a1 = "4";
        String a3 = "10";
        Permit_list instance = new Permit_list();
        Permit result =  instance.addDayVisitor(a, a1, a3);
        Permit expResult = instance.getPermit(a);
         assertEquals(expResult, result);
       
    }


    /**
     * Test of addPermanentVisitor method, of class Permit_list.
     */
    @Test
    public void testAddPermanentVisitor() {
        System.out.println("addPermanentVisitor");
        String a = "jeep";
        Permit_list instance = new Permit_list();
        Permit result = instance.addPermanentVisitor(a);
         Permit expResult = instance.getPermit(a);
        assertEquals(expResult, result);
    }


    /**
     * Test of addUniversityMember method, of class Permit_list.
     */
    @Test
    public void testAddUniversityMember() {
        System.out.println("addUniversityMember");
        String a = "jeep";
        String a1 = "22";
        Permit_list instance = new Permit_list();
        Permit result =instance.addUniversityMember(a, a1);
        Permit expResult = instance.getPermit(a);
       assertEquals(expResult, result);
    }


    /**
     * Test of printPermit method, of class Permit_list.
     */
    @Ignore
    public void testPrintPermit() {
        System.out.println("printPermit");
        String a = "jeep";
        Permit_list instance = new Permit_list();
           Permit a2 = instance.addPermanentVisitor(a);
        Permit expResult = instance.getPermit(a);
        Hashtable result = instance.printPermit();
        assertNotEquals(expResult, result);   
    }

    /**
     * Test of removePermit method, of class Permit_list.
     */
    @Test
    public void testRemovePermit() {
        System.out.println("removePermit");
         String expResult = "Permit is removed for the vehicle";
         String a = "mazda";
        Permit_list instance = new Permit_list();
        Permit a2 = instance.addPermanentVisitor(a);
         Permit a1 = instance.getPermit(a);
        String result = instance.removePermit(a);
      
        assertEquals(expResult, result);
        
    }

    
}
