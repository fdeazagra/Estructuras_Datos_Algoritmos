package arreglo;

public class ArregloMain {

	public static void main(String[] args) {
		
		long[] arr;
		arr = new long[20];
		int numElems;					// número de elementos del arreglo
		int j;							// índice del arreglo
		long buscarItem;				// item a buscar en el arreglo
		
		// insertamos 10 items de ejemplo en el arreglo
		
		arr[0] = 77;
		arr[1] = 22;
		arr[2] = 34;
		arr[3] = 78;
		arr[4] = 90;
		arr[5] = 53;
		arr[6] = 66;
		arr[7] = 12;
		arr[8] = 33;
		arr[9] = 66;
		numElems = 10;
		
		for(j=0; j<numElems; j++) {
			
			System.out.print(arr[j] + " ");
		}
		System.out.println("");
		
		// ALGORITMO DE BÚSQUEDA LINEAL
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// BUSCAR ITEM ejemplo con valor 12
		
		buscarItem = 12;
		
		for(j=0; j<numElems; j++) {			// bucle para recorrer el arreglo
			
			if(arr[j] == buscarItem) {		// item encontrado
				break;						// salir del bucle for porque se ha encontrado el item
			}
		}
		
		if(j==numElems) {					// imprimir resultado
			
			System.out.println("No se encuentra el número " + buscarItem);
			
		} else {
			
			System.out.println("Número encontrado " + buscarItem);
		}
		
		//--------------------------------------------------------------------------------------------------------
		
		// BORRAR ITEM ejemplo con valor 53

		buscarItem = 53;
		
		for(j=0; j<numElems; j++) {			// bucle para recorrer el arreglo
			
			if(arr[j] == buscarItem) {		// item encontrado
				break;						// salir del bucle for porque se ha encontrado el item
			}
		}
		
		for(int k=j; k<numElems; k++) {		// mover items superiores al item encontrado hacia abajo
			
			arr[k] = arr[k+1];				// sobreescribir cada item con su posterior
		}
		
		numElems--;							// reducir en uno el tamaño del arreglo
		
		for(j=0;j<numElems;j++) {			// bucle para recorrer el arreglo e imprimir resultado
			
			System.out.print(arr[j] + " ");
		}
		
		//--------------------------------------------------------------------------------------------------------
	}

}
