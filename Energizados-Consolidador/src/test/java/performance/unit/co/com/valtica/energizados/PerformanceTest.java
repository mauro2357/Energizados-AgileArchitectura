package performance.unit.co.com.valtica.energizados;

import org.databene.contiperf.PerfTest;
import org.databene.contiperf.Required;
import org.databene.contiperf.junit.ContiPerfSuiteRunner;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import functional.unit.co.com.valtica.energizados.FunctionalTest;

@RunWith(ContiPerfSuiteRunner.class)
@SuiteClasses(FunctionalTest.class)
@PerfTest(invocations = 10, threads = 30)

public class PerformanceTest {


	

}
