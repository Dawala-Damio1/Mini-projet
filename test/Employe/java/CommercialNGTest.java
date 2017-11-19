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
public class CommercialNGTest {
    
    public CommercialNGTest() {
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
     * Test of getChiffreAffaire method, of class Commercial.
     */
    @Test
    public void testGetChiffreAffaire() {
        System.out.println("getChiffreAffaire");
        Commercial instance = null;
        double expResult = 0.0;
        double result = instance.getChiffreAffaire();
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CommercialImpl extends Commercial {

        public CommercialImpl() {
            super("", "", "", 0, "", 0.0);
        }

        @Override
        public double calculerSalaire() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
