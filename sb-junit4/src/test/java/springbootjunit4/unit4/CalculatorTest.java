package springbootjunit4.unit4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CalculatorTest {

	@MockBean
	Adder adder;
	
	@MockBean
	Subtractor subtractor;
	
	
	@Autowired
	Calculator calculator;
	
	
	@Test
	public void testAddition() {
		Mockito.when(adder.add(Mockito.anyInt(),Mockito.anyInt())).thenReturn(22);
		Integer result = calculator.add(Integer.valueOf(10), Integer.valueOf(12));
		assertEquals(Integer.valueOf(22),result);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testAdditionOneNegativeNumber() {
		calculator.add(Integer.valueOf(-10), Integer.valueOf(12));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testAdditionBothNegativeNumber() {
		calculator.add(Integer.valueOf(-10), Integer.valueOf(-12));
	}
	
	@Test
	public void testSubstraction() {
		Mockito.when(subtractor.subtract(Mockito.anyInt(),Mockito.anyInt())).thenReturn(1);
		Integer result = calculator.subtract(Integer.valueOf(11), Integer.valueOf(10));
		assertEquals(Integer.valueOf(1),result);
	}
	
}
