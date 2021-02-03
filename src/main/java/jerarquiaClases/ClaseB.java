package jerarquiaClases;

public class ClaseB extends ClaseA {
	
	private boolean cambiadoEnB;

	// Método que se encarga de inicializar entero a 7
	@Override
	public void metodoA() {
		super.setEntero(7);
		System.out.println("El valor del entero ha sido cambiado a " + super.getEntero() + " en la clase B");
	}
	
	public void metodoACambiado() {
		if(super.getEntero() == 7) {
			cambiadoEnB = true;
		}else {
			cambiadoEnB = false;
		}
	}
}
