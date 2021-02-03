package jerarquiaClases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ClaseC extends ClaseA{

	LocalDate fecha;
	
	// Método que se encarga de inicializar entero a 20
	@Override
	public void metodoA() {
		super.setEntero(20);
		System.out.println("El valor del entero ha sido cambiado a " + super.getEntero() + " en la clase C");
		fecha = LocalDate.now();
	}
	
	public void fechaActual() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd MM yyyy");
		System.out.println("La fecha en la que se realizó el cambio del entero fue " + fecha.format(formato));
	}

	@Override
	public String toString() {
		return super.toString() + "ClaseC [fecha=" + fecha + "]";
	}
	
	
}
