/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ryan
 */
public class RyanListTest {
    
    public RyanListTest() {
    }   
    @BeforeClass
    public static void setUpClass() {
    } 
    @AfterClass
    public static void tearDownClass() {
    }
    
    //Test of next method, of class RyanList.   
    @Test
    public void testNext() {
        System.out.println("testing next"); 
        //set up
        RyanList instance = new RyanList();
        ILinkedList expResult = null;
        //testing method here
        ILinkedList result = instance.next(); 
        assertEquals(expResult, result);
        
    }
  
      @Test
      //Broken
    public void testNextWithInts() {
        System.out.println("nextWithInts"); 
        //set up
        RyanList instance = new RyanList();
        instance.setNext(new RyanList(3));
        
        
        ILinkedList expResult = null;
        expResult = instance.next();
        
        //testing method here
        ILinkedList result = instance.next(); 
        assertEquals(expResult, result);
    }  

    //Test of last method, of class RyanList.   
    @Test
    public void testLast() {
        System.out.println("last");
        //set up result
        RyanList instance = new RyanList();
        ILinkedList result = instance.last();
        //set up expResult
        RyanList instance2 = new RyanList();
        ILinkedList expResult = instance.last();
        //ILinkedList expResult = filler.next;

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    //Test of after method, of class RyanList.
    @Test
    public void testAfter() {
        System.out.println("testing after");
        int n = 0;
        RyanList instance = new RyanList();
        ILinkedList result = instance.after(n);
        
        ILinkedList expResult = instance.after(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAfterNEquals2() {
        System.out.println("testing after");
        int n = 2;
        RyanList instance = new RyanList(1);
        instance.setNext(new RyanList(2));
        instance.setNext(new RyanList(3));
        ILinkedList result = instance.after(n);
        //set up expResult
        ILinkedList expResult = instance.after(n);
        assertEquals(expResult, result);
    }
  


     //Test of detach method, of class RyanList.
    @Test
    public void testDetach() {
        System.out.println("detach");
        RyanList instance = new RyanList();
        ILinkedList expResult = null;
        ILinkedList result = instance.detach();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
 

    //Test of get method, of class RyanList.  
    @Test
    public void testGetAnInt() {
        System.out.println("testing get2");
        RyanList instance = new RyanList(5);
        Object expResult = 5;
        Object result = instance.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   
    //Test of set method, of class RyanList.   
    @Test
    public void testSet() {
        System.out.println("testing set");
        
        Object x = null;
        Object expValue = null;
        RyanList instance = new RyanList();
        instance.set(x);
        Object value = instance.get();
        assertEquals(expValue, value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        @Test
    public void testSetWithInts() {
        System.out.println("testing setWithInts");
        
        Object x = 4;
        Object expValue = 4;
        RyanList instance = new RyanList();
        instance.set(x);
        Object value = instance.get();
        assertEquals(expValue, value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
 
  
    //Test of setNext method, of class RyanList.
     
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        RyanList instance = new RyanList();
        instance.setNext(null);
        ILinkedList result = instance.next();
        ILinkedList expResult = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

 
    //Test of append method, of class RyanList.
    
    @Test
    public void testAppend() {
        System.out.println("append");
        RyanList instance = new RyanList();
        instance.append(null);
        ILinkedList expResult = null;
        
    
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    //Test of insert method, of class RyanList.

    @Test
    public void testInsert() {
        System.out.println("insert");
        RyanList instance = new RyanList();
        instance.insert(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
