package co.com.valtica.energizados.facturacion.infrastructure.repositories;

import co.com.valtica.energizados.facturacion.domain.entities.Cliente;
import co.com.valtica.energizados.facturacion.domain.repositories.ConsumoLuzRepository;

public class ConsumoFacturaLuzEPMRrepository implements ConsumoLuzRepository{

	@Override
	public double getLuzConsumida(Cliente cliente) {
		// TODO Vaya a EPM
		return 0;
	}

}
