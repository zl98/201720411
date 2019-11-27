import org.junit.Before;
import org.junit.Test;

public class BinaryOperationTest {
	BinaryOperation bo1;
	BinaryOperation bo2;
	@Before
	public void setUp() throws Exception {
		bo1=new AdditionOperation();
		bo2=new SubstractOperation();
	}

	@Test
	public void testCalculate() {
		assertEquals(bo1.calculate(10, 20),30);
	}

	private void assertEquals(int calculate, int i) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testCheckingCalculation() {
		assertEquals(bo1.checkingCalculation(), true);
	}

	private void assertEquals(boolean checkingCalculation, boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testEqualsBinaryOperation() {
		assertEquals(bo1.equals(bo2), false);
	}

}