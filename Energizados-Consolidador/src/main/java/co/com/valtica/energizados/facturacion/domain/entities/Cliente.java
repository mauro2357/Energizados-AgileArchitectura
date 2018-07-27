package co.com.valtica.energizados.facturacion.domain.entities;

public class Cliente {
	
	private String tipoDocumento;
	private String numeroDocumento;

	public Cliente(String tipoDocumento, String numeroDocumento) {
		this.tipoDocumento=tipoDocumento;
		this.numeroDocumento=numeroDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	
	

}
