package co.com.valtica.energizados.controller;

import co.com.valtica.energizados.domain.IDescuentosRepository;

public class DescuentosRepository implements IDescuentosRepository{

	@Override
	public void generarDescuento(double descuento) {
		System.out.println("EJECUTANDO EL METODO REAL DEL SERVICIO DE DESCUENTOS");
	}

}
