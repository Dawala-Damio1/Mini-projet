/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employe.java;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Mahamat Dawala
 */
public class EmployeNGTest {
    
    public EmployeNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of calculerSalaire method, of class Employe.
     */
    @Test
    public void testCalculerSalaire() {
        System.out.println("calculerSalaire");
        Employe instance = null;
        double expResult = 0.0;
        double result = instance.calculerSalaire();
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitre method, of class Employe.
     */
    @Test
    public void testGetTitre() {
        System.out.println("getTitre");
        Employe instance = null;
        String expResult = "";
        String result = instance.getTitre();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Employe.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Employe instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EmployeImpl extends Employe {

        public EmployeImpl() {
            super("", "", "", 0, "");
        }

        public double calculerSalaire() {
            return 0.0;
        }
    }
    
}
