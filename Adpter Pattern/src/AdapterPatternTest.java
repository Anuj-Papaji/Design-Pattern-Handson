import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdapterPatternTest {
	private Movable bugattiVeyron;
	private MovableAdapter bugattiVeyronAdapter;
	@Before
	public void setMovable() {
		bugattiVeyron = new BugattiVeyron();
		bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
	}
	@Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}
	@Test
	public void whenConvertingUSDToEuro_thenSuccessfullyConverted(){
		assertEquals(bugattiVeyronAdapter.getPrice(), 2730000, 0.001);
	}
	@After
	public void unsetMovable() {
		bugattiVeyronAdapter = null;
		bugattiVeyron = null;
	}

}
