package co.com.valtica.energizados.facturacion.infrastructure.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.valtica.energizados.facturacion.application.GeneracionFacturaApplication;
import co.com.valtica.energizados.facturacion.domain.entities.Cliente;

@RestController
public class GeneracionFacturaController {
	
	@RequestMapping("/generar")
	public void generarFactura(@RequestParam Cliente cliente) {
		new GeneracionFacturaApplication().generarFactura(cliente);
	}

}
