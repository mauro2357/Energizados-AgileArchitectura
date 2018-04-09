package functional.unit.co.com.valtica.energizados;

import org.databene.contiperf.Required;
import org.junit.Test;

public class FunctionalTest {
	@Test
	@Required(max = 100, average = 100, percentile90=100)
	public void test() {
		System.out.println("Invocado");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
