package epamtask5;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {
	private static final double DELTA=1e-15;
	@Test
	public void test() {
		simpleInterst cn=new simpleInterst();
		assertEquals(800,cn.simpleinterst(2000,10,4),DELTA);

	}

}
