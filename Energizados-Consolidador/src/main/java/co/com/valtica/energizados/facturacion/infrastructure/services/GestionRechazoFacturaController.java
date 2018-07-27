package co.com.valtica.energizados.facturacion.infrastructure.services;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.valtica.energizados.facturacion.application.GestionRechazoFacturaApplication;
import co.com.valtica.energizados.facturacion.domain.entities.ContadorAgua;
import co.com.valtica.energizados.facturacion.domain.entities.ContadorElectricidad;
import co.com.valtica.energizados.facturacion.domain.entities.ContadorGas;
import co.com.valtica.energizados.facturacion.domain.entities.Factura;
import co.com.valtica.energizados.facturacion.domain.entities.FacturaRechazada;
import co.com.valtica.energizados.facturacion.infrastructure.repositories.DescuentosRepositoryMySQl;

@RestController
public class GestionRechazoFacturaController {
    
    @RequestMapping("/regenerarFactura")
    public String index() {
    	GestionRechazoFacturaApplication facturaService=new GestionRechazoFacturaApplication();
    	
    	FacturaRechazada facturaRechazada=new FacturaRechazada(new DescuentosRepositoryMySQl());
		Factura factura=new Factura();
		factura.setValorAgua(new BigDecimal(23000));
		factura.setConsumoAgua(new BigDecimal(23));
		
		factura.setValorElectricidad(new BigDecimal(44000));
		factura.setConsumoElectricidad(new BigDecimal(44));
		
		factura.setValorGas(new BigDecimal(33000));
		factura.setConsumoGas(new BigDecimal(33));
		
		facturaRechazada.setFactura(factura);
		facturaRechazada.setEstado("Solicitado");
		
		ContadorAgua contadorAgua=new ContadorAgua();
		contadorAgua.setConsumo(new BigDecimal(10));
		
		ContadorElectricidad contadorElectricidad=new ContadorElectricidad();
		contadorElectricidad.setConsumo(new BigDecimal(44));
		
		ContadorGas contadorgas=new ContadorGas();
		contadorgas.setConsumo(new BigDecimal(33));
		
		facturaRechazada.setContadorAgua(contadorAgua);
		facturaRechazada.setContadorElectricidad(contadorElectricidad);
		facturaRechazada.setContadorGas(contadorgas);
    	
    	Factura facturaRegenerada= facturaService.gestionar(facturaRechazada);
        return "Factura regenrada: Nuevo valor: "+ facturaRegenerada.getValorTotal();
    }
    
}