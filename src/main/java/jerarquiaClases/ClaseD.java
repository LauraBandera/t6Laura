package jerarquiaClases;

public class ClaseD extends ClaseA{

	private char caracter;
	
	// Método que se encarga de inicializar entero a 9
	@Override
	public void metodoA() {
		super.setEntero(9);
		System.out.println("El valor del entero ha sido cambiado a " + super.getEntero() + " en la clase D");
	}
	
	public void metodoALetra() {
		caracter = (char) super.getEntero();
		System.out.println("El valor del entero actual corresponde con el caracter " + caracter);
	}

	@Override
	public String toString() {
		return super.toString() + "ClaseD [caracter=" + caracter + "]";
	}
	
	
}
