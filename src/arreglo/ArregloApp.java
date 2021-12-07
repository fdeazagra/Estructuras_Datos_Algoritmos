package arreglo;

public class ArregloApp {

	public static void main(String[] args) {
		
		long[] arr;
		arr = new long[20];
		int numElems;
		int j;							// índice del arreglo
		long buscarItem;				// item a buscar en el arreglo
		
		// insertamos 10 items en el arreglo
		
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
		
		// Buscamos item con valor x en el arreglo
		
		buscarItem = 12;
		for(j=0; j<numElems; j++) {
			if(arr[j] == buscarItem) {		// item encontrado
				break;
			}
		}
		
		if(j==numElems) {
			System.out.println("No se encuentra el número " + buscarItem);
		} else {
			System.out.println("Número encontrado " + buscarItem);
		}

	}

}
