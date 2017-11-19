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
public class ManutentionnaireNGTest {
    
    public ManutentionnaireNGTest() {
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
     * Test of calculerSalaire method, of class Manutentionnaire.
     */
    @Test
    public void testCalculerSalaire() {
        System.out.println("calculerSalaire");
        Manutentionnaire instance = null;
        double expResult = 0.0;
        double result = instance.calculerSalaire();
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitre method, of class Manutentionnaire.
     */
    @Test
    public void testGetTitre() {
        System.out.println("getTitre");
        Manutentionnaire instance = null;
        String expResult = "";
        String result = instance.getTitre();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
