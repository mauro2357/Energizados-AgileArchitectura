package co.com.valtica.energizados.facturacion.domain.entities;

import org.springframework.beans.factory.annotation.Autowired;

import co.com.valtica.energizados.facturacion.domain.repositories.ConsumoAguaRepository;

public class FacturaAgua extends FacturaBase{
	
	private final int VALOR_AGUA_X_METROCUBICO=3;

	
	@Autowired
	private ConsumoAguaRepository aguaRepository;


	public FacturaAgua(Cliente cliente) {
		super(cliente);
	}

	
	public void setAguaRepository(ConsumoAguaRepository aguaRepository) {
		this.aguaRepository=aguaRepository;
	}

	@Override
	protected double calcularTarifaBase() {
		tarifa=aguaRepository.getAguaConsumida(cliente)*VALOR_AGUA_X_METROCUBICO;
		return tarifa;
	}

	
	
}
