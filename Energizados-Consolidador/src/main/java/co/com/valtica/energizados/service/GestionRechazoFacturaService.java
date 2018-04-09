package co.com.valtica.energizados.service;

import co.com.valtica.energizados.domain.Factura;
import co.com.valtica.energizados.domain.FacturaRechazada;

public class GestionRechazoFacturaService {

	public Factura gestionar(FacturaRechazada facturaRechazada) {
		return facturaRechazada.gestionar();
	}
	
}
