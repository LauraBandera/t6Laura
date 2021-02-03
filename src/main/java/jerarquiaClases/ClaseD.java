package jerarquiaClases;

public class ClaseD extends ClaseA {

	private char caracter;

	public ClaseD() {
		super.setEntero(5);
	}

	// Método que se encarga de inicializar entero a 9
	@Override
	public void metodoA() {
		super.setEntero(9);
		System.out.println("El valor del entero ha sido cambiado a " + super.getEntero() + " en la clase D");
	}

	// Método que te muestra el caracter al que hace referencia el entero de la
	// clase A
	// ya sea modificado o no en otra clase
	public void metodoALetra() {
		caracter = (char) super.getEntero();
		System.out.println(
				"El valor del entero actual (" + super.getEntero() + ") corresponde con el caracter " + caracter);
	}

	// Método que devuelve el valor del int entero en Integer restandole 8
	public Integer metdoB2() {
		return (super.getEntero() - 8);
	}

	@Override
	public String toString() {
		return super.toString() + "ClaseD [caracter=" + caracter + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + caracter;
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
		ClaseD other = (ClaseD) obj;
		if (caracter != other.caracter)
			return false;
		return true;
	}

}
