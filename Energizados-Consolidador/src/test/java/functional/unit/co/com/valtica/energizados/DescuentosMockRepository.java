package functional.unit.co.com.valtica.energizados;

import co.com.valtica.energizados.facturacion.domain.repositories.DescuentosRepository;

public class DescuentosMockRepository implements DescuentosRepository{

	@Override
	public void generarDescuento(double descuento) {
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Aqui accedio al sistema de descuentos");
	}

}
