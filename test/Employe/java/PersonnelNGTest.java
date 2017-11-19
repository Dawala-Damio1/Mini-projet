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
public class PersonnelNGTest {
    
    public PersonnelNGTest() {
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
     * Test of ajouterEmploye method, of class Personnel.
     */
    @Test
    public void testAjouterEmploye() {
        System.out.println("ajouterEmploye");
        Employe e = null;
        Personnel instance = new Personnel();
        instance.ajouterEmploye(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salaireMoyen method, of class Personnel.
     */
    @Test
    public void testSalaireMoyen() {
        System.out.println("salaireMoyen");
        Personnel instance = new Personnel();
        double expResult = 0.0;
        double result = instance.salaireMoyen();
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afficherSalaires method, of class Personnel.
     */
    @Test
    public void testAfficherSalaires() {
        System.out.println("afficherSalaires");
        Personnel instance = new Personnel();
        instance.afficherSalaires();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
