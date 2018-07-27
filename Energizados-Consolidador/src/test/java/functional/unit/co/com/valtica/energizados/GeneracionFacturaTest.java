package functional.unit.co.com.valtica.energizados;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import co.com.valtica.energizados.facturacion.domain.entities.Cliente;
import co.com.valtica.energizados.facturacion.domain.entities.FacturaAgua;
import co.com.valtica.energizados.facturacion.domain.repositories.ConsumoAguaRepository;

public class GeneracionFacturaTest {
	

	@Test
	public void deberia_calcular_correctamente_el_consumo_agua() {
		ConsumoAguaRepository consumoAguaRepository= Mockito.mock(ConsumoAguaRepository.class);
		Cliente cliente= new Cliente("CC","1017130782");
		Mockito.when(consumoAguaRepository.getAguaConsumida(cliente)).thenReturn(1000.0);
		FacturaAgua facturaAgua=new FacturaAgua(cliente);
		facturaAgua.setAguaRepository(consumoAguaRepository);
		facturaAgua.calculartarifa();
		Assert.assertEquals("El valor de la tarifa no escorrecto para el cliente",facturaAgua.getTarifa(), 3090,0);
	}

}
