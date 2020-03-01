package Calc;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
public class CalculatorTest {

	@Test
	public void testAddTwoPositive() {
		int first=1;
		int second=2;
		Calculator ca = new Calculator();
		int result = ca.add(first,second);
		assertTrue(result>0);
			}
	@Test
	public void testAddTwoNegative() {
		int first=-1;
		int second=-2;
		Calculator ca = new Calculator();
		int result = ca.add(first,second);
		assertTrue(result<0);
		//assertEquals(result<0,ca.add(first,second) );
	}
	@Test
	public void testAddOnePositiveisGreaterOneNegative() {
		int first=-1;
		int second=2;
		Calculator ca = new Calculator();
		int result = ca.add(first,second);
		assertTrue(result>0);
	}
	@Test
	public void testAddOnePositiveOneNegativeisGreater() {
		int first=1;
		int second=-2;
		Calculator ca = new Calculator();
		int result = ca.add(first,second);
		assertTrue(result<0);
	}
	

}
