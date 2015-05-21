import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;




public class RIngITest {
	private RingADT<String> bag;

	@Before
	public void setUp() {
		bag = new ArrayRing<String>(2);
		bag.add("Jan");
		bag.add("Per");
		bag.add("Hans");

	}
	
	@Test
	public void testCurrentItem(){
		assertEquals("Jan", bag.getCurrentItem());
	}

	@Test
	public void testAdd() {
		bag.add("Lis");
		bag.advance();
		bag.advance();
		bag.advance();
		assertEquals("Lis", bag.getCurrentItem());
	}

	@Test
	public void testRemove() {
		bag.remove("Lis");
		
		assertEquals("Jan", bag.getCurrentItem());
		
	}


}
