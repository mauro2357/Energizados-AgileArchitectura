package co.com.valtica.energizados.facturacion.domain.entities;

public abstract class FacturaBase {
	
	protected Cliente cliente;
	protected double tarifa;
	
	private final double VALOR_IVA=0.03;
	
	public FacturaBase(Cliente cliente) {
		this.cliente=cliente;
	}
	
	
	protected abstract double calcularTarifaBase();
	
	public void calcularTarifa() {
		 tarifa=calcularTarifaBase()+calcularTarifaBase()*VALOR_IVA;
	}

	public double getTarifa() {
		return tarifa;
	}
	
}
