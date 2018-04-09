package functional.unit.co.com.valtica.energizados;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import co.com.valtica.energizados.domain.ContadorAgua;
import co.com.valtica.energizados.domain.ContadorElectricidad;
import co.com.valtica.energizados.domain.ContadorGas;
import co.com.valtica.energizados.domain.Factura;
import co.com.valtica.energizados.domain.FacturaRechazada;

public class GestionFacturaRechazada {
	
	@Test
	public void Regenerar_factura_por_consumo_incorrecto_Agua_ante_factura_con_inconformidad(){
		//Arrange
		FacturaRechazada facturaRechazada=new FacturaRechazada();
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
		
		//Act
		Factura facturaRegenerada= facturaRechazada.gestionar();
		
		//Assert
		Assert.assertEquals(new BigDecimal(87000), facturaRegenerada.getValorTotal());
		Assert.assertEquals(0.5, facturaRechazada.getDescuentoProgramado(),0);
		Assert.assertEquals("Regenerada", facturaRechazada.getEstado());
	}

}
