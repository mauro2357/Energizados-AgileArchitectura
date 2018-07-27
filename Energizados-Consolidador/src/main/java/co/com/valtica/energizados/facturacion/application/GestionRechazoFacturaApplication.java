package co.com.valtica.energizados.facturacion.application;

import co.com.valtica.energizados.facturacion.domain.entities.Factura;
import co.com.valtica.energizados.facturacion.domain.entities.FacturaRechazada;

public class GestionRechazoFacturaApplication {

	public Factura gestionar(FacturaRechazada facturaRechazada) {
		return facturaRechazada.gestionar();
	}
	
}
