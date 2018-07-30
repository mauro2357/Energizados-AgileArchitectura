package co.com.valtica.energizados.facturacion.domain.repositories;

import co.com.valtica.energizados.facturacion.domain.entities.Cliente;

public interface ConsumoLuzRepository {

	double getLuzConsumida(Cliente cliente);

}
