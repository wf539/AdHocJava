package com.cardinus.udemy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitExampleTest {
    
	@Test
    public void twoPlusTwoEqualsFour() {
        
		assertEquals( "Addition should be done correctly", 4, 2+2 );
    }
}
