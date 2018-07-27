package performance.unit.co.com.valtica.energizados;

import org.databene.contiperf.PerfTest;
import org.databene.contiperf.junit.ContiPerfSuiteRunner;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import functional.unit.co.com.valtica.energizados.GestionFacturaRechazadaTest;

@RunWith(ContiPerfSuiteRunner.class)
@SuiteClasses(GestionFacturaRechazadaTest.class)
@PerfTest(invocations = 10, threads = 30)
public class PerformanceTest {


	

}
