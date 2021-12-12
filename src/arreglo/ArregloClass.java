package arreglo;

public class ArregloClass {
	
	private long[] arr;					// arreglo con elementos tipo long
	private int numElems;				// número de elementos del arreglo
	
	
	// constructor con parámetro del tamaño del arreglo
	
	public ArregloClass(int tam) {
		
		arr = new long[tam];			// crear arreglo
		numElems = 0;					// iniciar el arreglo con 0 elementos
	}

	//-------------------------------------------------------------------------------------------------------------
	
	// método de búsqueda de un valor específico que pasamos como parámetro
	
	public boolean buscar(long dato) {
	
		int j;
		for(j=0; j<numElems; j++) {			// bucle para recorrer el arreglo
				
			if(arr[j] == dato) {		// item encontrado
				break;						
				}
			}
			
			if(j==numElems) {					// se llega al final del arreglo
				
				return false;					// no se ha encontrado
				
			} else {
				
				return true;					// elemento encontrado
			}
	}
	
	//-------------------------------------------------------------------------------------------------------------
	
	// método que inserta un valor específico que pasamos como parámetro
	
	public void insertar(long dato) {
		
		arr[numElems] = dato;					// insertar el valor al final del arreglo
		numElems++;								// incrementamos en 1 el tamaño del arreglo
	}
}
