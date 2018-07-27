package co.com.valtica.energizados.facturacion.domain.entities;

import java.math.BigDecimal;

import co.com.valtica.energizados.facturacion.domain.repositories.DescuentosRepository;

public class FacturaRechazada {
	private DescuentosRepository descuentosRepository;
	private Factura  factura;
	private String estado;
	private ContadorAgua contadorAgua;
	private ContadorElectricidad contadorElectricidad;
	private ContadorGas contadorGas;
	private double descuentoProgramado;

	public FacturaRechazada(DescuentosRepository descuentosRepository) {
		this.descuentosRepository=descuentosRepository;
	}
	
	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public ContadorAgua getContadorAgua() {
		return contadorAgua;
	}

	public void setContadorAgua(ContadorAgua contadorAgua) {
		this.contadorAgua = contadorAgua;
	}

	public ContadorElectricidad getContadorElectricidad() {
		return contadorElectricidad;
	}

	public void setContadorElectricidad(ContadorElectricidad contadorElectricidad) {
		this.contadorElectricidad = contadorElectricidad;
	}

	public ContadorGas getContadorGas() {
		return contadorGas;
	}

	public void setContadorGas(ContadorGas contadorGas) {
		this.contadorGas = contadorGas;
	}

	public double getDescuentoProgramado() {
		return descuentoProgramado;
	}

	public void setDescuentoProgramado(double descuentoProgramado) {
		this.descuentoProgramado = descuentoProgramado;
	}

	public Factura gestionar() {
		
		boolean consistente=true;
		if(factura.getConsumoAgua()!=contadorAgua.getConsumo()) {
			consistente=false;
		}
		if(factura.getConsumoElectricidad()!=contadorElectricidad.getConsumo()) {
			consistente=false;
		}
		if(factura.getConsumoGas()!=contadorGas.getConsumo()) {
			consistente=false;
		}
		if(!consistente) {
			descuentoProgramado=0.5;
			descuentosRepository.generarDescuento(descuentoProgramado);
			estado="Regenerada";
			return regenerarFactura();
		}else {
			return null;
		}
	}
	
	private Factura regenerarFactura() {
		factura.setConsumoAgua(contadorAgua.getConsumo());
		factura.setConsumoElectricidad(contadorElectricidad.getConsumo());
		factura.setConsumoGas(contadorGas.getConsumo());
		factura.setValorAgua(factura.getConsumoAgua().multiply(new BigDecimal(1000)));
		factura.setValorElectricidad(factura.getConsumoElectricidad().multiply(new BigDecimal(1000)));
		factura.setValorGas(factura.getConsumoGas().multiply(new BigDecimal(1000)));
		//Aqui se colocan los nuevos valores de factura
		return factura;
	}
	
	
	
	
	
	
}
