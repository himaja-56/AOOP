package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testing {
	
	@Test
	public void testConvertBinaryToDecimal() {
		assertEquals(12, BinaryToDecimal.convertBinaryToDecimal("1100"));
        assertEquals(0, BinaryToDecimal.convertBinaryToDecimal("0"));
        assertEquals(1, BinaryToDecimal.convertBinaryToDecimal("1"));
        assertEquals(255, BinaryToDecimal.convertBinaryToDecimal("11111111"));
        assertEquals(2, BinaryToDecimal.convertBinaryToDecimal("10"));
		
	}

}
