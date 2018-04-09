package co.com.valtica.energizados.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.valtica.energizados.domain.ContadorAgua;
import co.com.valtica.energizados.domain.ContadorElectricidad;
import co.com.valtica.energizados.domain.ContadorGas;
import co.com.valtica.energizados.domain.Factura;
import co.com.valtica.energizados.domain.FacturaRechazada;
import co.com.valtica.energizados.service.GestionRechazoFacturaService;

@RestController
public class GestionRechazoFacturaController {
    
    @RequestMapping("/regenerarFactura")
    public String index() {
    	GestionRechazoFacturaService facturaService=new GestionRechazoFacturaService();
    	
    	FacturaRechazada facturaRechazada=new FacturaRechazada(new DescuentosRepository());
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