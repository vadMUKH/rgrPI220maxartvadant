package rgr;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelpMe {

	@Test
	public void test() {
		Calc calc = new Calc();
		int result = calc.calc(10000, 1,1,1);
		assertEquals(10000,result);
	}

}
