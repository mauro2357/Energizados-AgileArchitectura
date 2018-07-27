package co.com.valtica.energizados.facturacion.domain.entities;

import java.math.BigDecimal;

public class Factura {
	private BigDecimal valorAgua;
	private BigDecimal consumoAgua;
	private BigDecimal valorElectricidad;
	private BigDecimal consumoElectricidad;
	private BigDecimal valorGas;
	private BigDecimal consumoGas;
	
	public BigDecimal getValorAgua() {
		return valorAgua;
	}
	public void setValorAgua(BigDecimal valorAgua) {
		this.valorAgua = valorAgua;
	}
	public BigDecimal getConsumoAgua() {
		return consumoAgua;
	}
	public void setConsumoAgua(BigDecimal consumoAgua) {
		this.consumoAgua = consumoAgua;
	}
	public BigDecimal getValorElectricidad() {
		return valorElectricidad;
	}
	public void setValorElectricidad(BigDecimal valorElectricidad) {
		this.valorElectricidad = valorElectricidad;
	}
	public BigDecimal getConsumoElectricidad() {
		return consumoElectricidad;
	}
	public void setConsumoElectricidad(BigDecimal consumoElectricidad) {
		this.consumoElectricidad = consumoElectricidad;
	}
	public BigDecimal getValorGas() {
		return valorGas;
	}
	public void setValorGas(BigDecimal valorGas) {
		this.valorGas = valorGas;
	}
	public BigDecimal getConsumoGas() {
		return consumoGas;
	}
	public void setConsumoGas(BigDecimal consumoGas) {
		this.consumoGas = consumoGas;
	}
	public BigDecimal getValorTotal() {
		return valorAgua.add(valorElectricidad).add(valorGas);
	}
	
	
}
