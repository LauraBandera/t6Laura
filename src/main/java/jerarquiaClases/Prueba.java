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
		
		ArrayList <ClaseA> listaElementos = new ArrayList<>();

		listaElementos.add(cA);
		listaElementos.add(cA2);
		listaElementos.add(cB);
		listaElementos.add(cB2);
		listaElementos.add(cC);
		listaElementos.add(cC2);
		listaElementos.add(cD);
		listaElementos.add(cD2);
	}

}
