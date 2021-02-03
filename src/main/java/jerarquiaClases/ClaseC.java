package jerarquiaClases;

public class ClaseC extends ClaseA{

	// Método que se encarga de inicializar entero a 20
	@Override
	public void metodoA() {
		super.setEntero(20);
		System.out.println("El valor del entero ha sido cambiado a " + super.getEntero() + " en la clase C");
	}
}
