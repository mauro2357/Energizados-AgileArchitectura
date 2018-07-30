package co.com.valtica.energizados.facturacion.domain.entities;

import org.springframework.beans.factory.annotation.Autowired;

import co.com.valtica.energizados.facturacion.domain.repositories.ConsumoLuzRepository;

public class FacturaLuz extends FacturaBase{
	
	private final int VALOR_LUZ_X_KILOWAT=4;
	private final int VALOR_LUZ_X_KILOWAT_ADICIONAL=3;
	private final int LIMITE_CONSUMO=100;

	
	@Autowired
	private ConsumoLuzRepository consumoLuzRepository;

	public FacturaLuz(Cliente cliente) {
		super(cliente);
	}

	public void setConsumoLuzRepository(ConsumoLuzRepository consumoLuzRepository) {
		this.consumoLuzRepository = consumoLuzRepository;
	}

	private double obtenerValorFacturaExcedenteLimiteConsumo(double consumo) {
		double valorFacturaKilowatAdicional=0;
		if(consumo>LIMITE_CONSUMO) {
			valorFacturaKilowatAdicional=(consumo-LIMITE_CONSUMO)*VALOR_LUZ_X_KILOWAT_ADICIONAL;
		}
		return valorFacturaKilowatAdicional;
	}
	

	@Override
	protected double calcularTarifaBase() {
		double consumo=consumoLuzRepository.getLuzConsumida(cliente);
		double valorFacturaBase=consumo*VALOR_LUZ_X_KILOWAT;
		double valorFacturaKilowatAdicional = obtenerValorFacturaExcedenteLimiteConsumo(consumo);
		double valorSinIva=valorFacturaBase+ valorFacturaKilowatAdicional;
		return valorSinIva;
	}
	
	
	
	

}
