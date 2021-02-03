package jerarquiaClases;

public class ClaseA {
	
	private int entero;
	
	

	public ClaseA() {
		super();
		this.metodoA();
	}

	//Método que se encarga de inicializar entero a 5
	public void metodoA() {
		this.entero = 5;
		System.out.println("El valor del entero ha sido cambiado a " + this.entero);
	}

	public void setEntero(int entero2) {
		this.entero = entero2;
	}

	public int getEntero() {
		return entero;
	}

	@Override
	public String toString() {
		return "ClaseA [entero=" + entero + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + entero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClaseA other = (ClaseA) obj;
		if (entero != other.entero)
			return false;
		return true;
	}
	
	
}
