package org.launchcode.java.demos.lsn6inheritance.technology;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Program {
    @Test
    public void ramSizeTest(){
        Computer c = new Computer(50,200,"windows",1);
        assertEquals(50,c.getRamSize());
    }
    @Test
    public void laptopTest(){
        Laptop lt = new Laptop(40,100,"linux",true,true,2);
        assertEquals(50,lt.getRamSize());
    }
}
