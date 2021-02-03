package jerarquiaClases;

public class ClaseA {
	
	private int entero;

	//Método que se encarga de inicializar entero a 5
	public void metodoA() {
		this.entero = 5;
		System.out.println("El valor del entero ha sido cambiado a " + this.entero);
	}

	public void setEntero(int entero2) {
		this.entero = entero;
	}

	public int getEntero() {
		return entero;
	}
}
