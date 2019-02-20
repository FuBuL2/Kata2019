
package com.cifpcarballeira.Katas.FizzBuzz.Tests;


import com.cifpcarballeira.katas.FizzBuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAM105
 */
public class TestFizzBuzz {

    public TestFizzBuzz() {
    }

    @Test
    public void test1devuelve1() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(1);
        assertEquals("1", result);
    }
    
    @Test
    public void test2devuelve2() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(2);
        assertEquals("2", result);
    }
}
