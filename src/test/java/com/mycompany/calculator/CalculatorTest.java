/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 5im15sibaach
 */
public class CalculatorTest {

    public CalculatorTest() {
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
     * Test of addition method, of class Calculator.
     */
    @org.junit.Test
    public void testAdditionPos() {
        System.out.println("addition pos");
        int s1 = 10;
        int s2 = 10;
        Calculator instance = new Calculator();
        int expResult = 20;
        int result = instance.addition(s1, s2);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testAdditionNeg() {
        System.out.println("addition neg");
        int s1 = -10;
        int s2 = -10;
        Calculator instance = new Calculator();
        int expResult = -20;
        int result = instance.addition(s1, s2);
        assertEquals(expResult, result);
        

    }

    @org.junit.Test
    public void testAdditionZ() {
        System.out.println("addition Z");
        int s1 = 10;
        int s2 = -10;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.addition(s1, s2);
        assertEquals(expResult, result);


    }

}
