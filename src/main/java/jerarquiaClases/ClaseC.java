package jerarquiaClases;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ClaseC extends ClaseA {

	private LocalDate fecha;

	public ClaseC() {
		super();
		fecha = LocalDate.of(2020, Month.FEBRUARY, 3);
	}

	// Método que se encarga de inicializar entero a 20
	@Override
	public void metodoA() {
		super.setEntero(20);
		System.out.println("El valor del entero ha sido cambiado a " + super.getEntero() + " en la clase C");
		fecha = LocalDate.now();
	}

	// Muestra la fecha en la que se hizo el cambio del métodoA y en su
	// defecto te muestra la fecha en la que se creó este proyecto
	public void fechaModificacion() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd MM yyyy");
		System.out.println("La fecha en la que se realizó el cambio del entero fue " + fecha.format(formato));
	}

	// Método que devuelve el valor del int entero en Integer restandole 3
	public Integer metdoB2() {
		return (super.getEntero() - 3);
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return super.toString() + "ClaseC [fecha=" + fecha + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClaseC other = (ClaseC) obj;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		return true;
	}

}
