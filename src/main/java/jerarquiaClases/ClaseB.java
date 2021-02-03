package jerarquiaClases;

public class ClaseB extends ClaseA {
	
	private boolean cambiadoEnB;

	public ClaseB() {
		super();
		this.cambiadoEnB = false;
	}

	// Método que se encarga de inicializar entero a 7
	@Override
	public void metodoA() {
		super.setEntero(7);
		System.out.println("El valor del entero ha sido cambiado a " + super.getEntero() + " en la clase B");
	}
	
	//Comprueba si se ha ejecutado el metodo A en la clase B
	public void metodoACambiado() {
		if(super.getEntero() == 7) {
			cambiadoEnB = true;
		}else {
			cambiadoEnB = false;
		}

		System.out.println("¿Ha habido cambios en los valores del entero de la clase A? " + cambiadoEnB);
	}
	
	// Método que devuelve el valor del int entero en Integer
	public Integer metdoB2() {
		return super.getEntero();
	}

	@Override
	public String toString() {
		return super.toString() + "ClaseB [cambiadoEnB=" + cambiadoEnB + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (cambiadoEnB ? 1231 : 1237);
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
		ClaseB other = (ClaseB) obj;
		if (cambiadoEnB != other.cambiadoEnB)
			return false;
		return true;
	}
	
	
}
