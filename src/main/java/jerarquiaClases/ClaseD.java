package jerarquiaClases;

public class ClaseD extends ClaseA{

	// Método que se encarga de inicializar entero a 9
	@Override
	public void metodoA() {
		super.setEntero(9);
		System.out.println("El valor del entero ha sido cambiado a " + super.getEntero() + " en la clase D");
	}
}
