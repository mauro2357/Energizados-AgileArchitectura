package co.com.valtica.energizados.facturacion.application;

import co.com.valtica.energizados.facturacion.domain.entities.Cliente;
import co.com.valtica.energizados.facturacion.domain.entities.FacturaAgua;
import co.com.valtica.energizados.facturacion.domain.entities.FacturaLuz;

public class GeneracionFacturaApplication {
	
	public void generarFactura(Cliente cliente) {
		FacturaAgua facturaAgua=new FacturaAgua(cliente);
		FacturaLuz facturaLuz=new FacturaLuz(cliente);
		facturaAgua.calcularTarifa();
		facturaLuz.calcularTarifa();
		
	}

}
