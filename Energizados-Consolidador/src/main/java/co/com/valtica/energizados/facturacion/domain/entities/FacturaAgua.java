package co.com.valtica.energizados.facturacion.domain.entities;

import org.springframework.beans.factory.annotation.Autowired;

import co.com.valtica.energizados.facturacion.domain.repositories.ConsumoAguaRepository;

public class FacturaAgua {
	
	private Cliente cliente;
	private double tarifa;
	
	private final int VALOR_AGUA_X_METROCUBICO=3;

	private final double VALOR_IVA=0.03;
	
	@Autowired
	private ConsumoAguaRepository aguaRepository;


	public FacturaAgua(Cliente cliente) {
		this.cliente=cliente;
	}

	public void calculartarifa() {
		tarifa=aguaRepository.getAguaConsumida(cliente)*VALOR_AGUA_X_METROCUBICO;
		tarifa=tarifa+tarifa*VALOR_IVA;
		
	}

	public double getTarifa() {
		return tarifa;
	}
	
	public void setAguaRepository(ConsumoAguaRepository aguaRepository) {
		this.aguaRepository=aguaRepository;
	}

	
	
}
