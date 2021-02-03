package jerarquiaClases;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClaseA cA = new ClaseA();
		ClaseB cB = new ClaseB();
		ClaseC cC = new ClaseC();
		ClaseD cD = new ClaseD();

		ClaseA cA2 = new ClaseA();
		ClaseB cB2 = new ClaseB();
		ClaseC cC2 = new ClaseC();
		ClaseD cD2 = new ClaseD();

		ArrayList<ClaseA> listaElementos = new ArrayList<>();

		listaElementos.add(cA);
		listaElementos.add(cA2);
		listaElementos.add(cB);
		listaElementos.add(cB2);
		listaElementos.add(cC);
		listaElementos.add(cC2);
		listaElementos.add(cD);
		listaElementos.add(cD2);

		System.out.println("----------- Llamada dentro de cada clase al metodo propio de cada una -------------");
		for (ClaseA aux : listaElementos) {
			System.out.println(aux);
			aux.metodoA();
			// Conversiones explícitas
			if (aux instanceof ClaseB) {
				((ClaseB) aux).metodoACambiado();
			}
			if (aux instanceof ClaseC) {
				((ClaseC) aux).fechaModificacion();
			}
			if (aux instanceof ClaseD) {
				((ClaseD) aux).metodoALetra();
				;
			}
		}
		
		System.out.println("----------- Llamada dentro de cada clase al metodoA de todos los objetos -------------");
		
		for (ClaseA aux : listaElementos) {
			System.out.println(aux);
			aux.metodoA();
			// Conversiones explícitas
			if (aux instanceof ClaseB) {
				((ClaseB) aux).metodoA();
			}
			if (aux instanceof ClaseC) {
				((ClaseC) aux).metodoA();
			}
			if (aux instanceof ClaseD) {
				((ClaseD) aux).metodoA();
				;
			}
		}
		
		System.out.println("----------- Uso de los métodos indexof, contains y remove -------------");
		
		System.out.println("La posición del elemento cC2 es " + listaElementos.indexOf(cC2));

		System.out.println("¿Se encuentra el elemento cD?" + listaElementos.contains(cD));
		
		listaElementos.remove(listaElementos.indexOf(cD));

		System.out.println("¿Se encuentra el elemento cD, después de ser borrado?" + listaElementos.contains(cD));
	}

}
