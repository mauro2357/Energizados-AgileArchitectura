package co.com.valtica.energizados.facturacion.infrastructure.repositories;

import co.com.valtica.energizados.facturacion.domain.repositories.DescuentosRepository;

public class DescuentosRepositoryMySQl implements DescuentosRepository{

	@Override
	public void generarDescuento(double descuento) {
		System.out.println("EJECUTANDO EL METODO REAL DEL SERVICIO DE DESCUENTOS");
	}

}
