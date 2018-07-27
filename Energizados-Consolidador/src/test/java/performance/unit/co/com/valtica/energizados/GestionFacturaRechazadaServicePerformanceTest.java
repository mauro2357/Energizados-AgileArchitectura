package performance.unit.co.com.valtica.energizados;

import org.databene.contiperf.Required;

import co.com.valtica.energizados.facturacion.application.GestionRechazoFacturaApplication;

public class GestionFacturaRechazadaServicePerformanceTest {

	@Required(max = 100, average = 100, percentile90=100)
	public void validar_Performance_Rechazo_Factura() {
		
		//Aqui se debe inicializar la prueba de performance
		new GestionRechazoFacturaApplication().gestionar(null);
	}
	
}
