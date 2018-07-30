package co.com.valtica.energizados.facturacion.infrastructure.repositories;

import co.com.valtica.energizados.facturacion.domain.entities.Cliente;
import co.com.valtica.energizados.facturacion.domain.repositories.ConsumoAguaRepository;

public class ConsumoFacturaAguaEPMRrepository implements ConsumoAguaRepository{

	@Override
	public double getAguaConsumida(Cliente cliente) {
		// TODO AAqui haga el llamado al servicio web de EPM
		return 0;
	}

}
