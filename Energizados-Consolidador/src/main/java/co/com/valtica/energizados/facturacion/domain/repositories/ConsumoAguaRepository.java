package co.com.valtica.energizados.facturacion.domain.repositories;

import co.com.valtica.energizados.facturacion.domain.entities.Cliente;

public interface ConsumoAguaRepository {
	
	public double getAguaConsumida(Cliente cliente);

}
