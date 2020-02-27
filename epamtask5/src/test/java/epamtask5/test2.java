package epamtask5;

import static org.junit.Assert.*;

import org.junit.Test;

public class test2 {
	private static final double DELTA=1e-15;
	@Test
	public void test() {
		compound cv=new compound();
		assertEquals(828.0000000000002,cv.compound_interst(1200,30,2),DELTA);

		
	}

}
