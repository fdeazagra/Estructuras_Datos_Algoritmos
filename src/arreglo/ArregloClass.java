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
		
		arr[numElems] = dato;					// inserta el valor al final del arreglo
		numElems++;								// incrementamos en 1 el tamaño del arreglo
	}
	
	//-------------------------------------------------------------------------------------------------------------
	
	// método que borra un elemento del arreglo que sea igual al valor del argumento "dato" desplazando los valores 
	// del arreglo una celda hacia abajo
	
	public boolean eliminar(long dato) {
		
		int j;
		
		for(j=0; j<numElems; j++) {				// busca el elemento en el arreglo
			
			if(arr[j] == dato) {				// item encontrado
				break;						
				}
			}
		
		if(j==numElems) {						// se llega al final del arreglo, no se encuentra el valor
			
			return false;					
			
		} else {
			
			for (int k=j; k<numElems-1; k++) {	// elemento encontrado
				
				arr[k] = arr[k+1];				//	desplazamos los elementos superiores al índice 
												//	sobreescribiéndolos con su inmediatamente superior			
			}
			
			numElems--;
			return true;					
		}
	}
	
	//-------------------------------------------------------------------------------------------------------------
	
	// método que muestra todos los elementos del arreglo
	
	public void mostrarElementos() {
		
		for(int j=0; j<numElems; j++) {				// recorremos todos los elementos del arreglo
			
			System.out.print(arr[j] + ""); 			// imprime cada elemento del arreglo en consola
		}
		
		System.out.println("");						// dejamos una linea en blanco
	}
	
	//-------------------------------------------------------------------------------------------------------------
	
	// método que muestra el valor del elemento en la posición "i" del arreglo
	
	public long valorElemento(int i) {
		
		return arr[i];								// retorna el valor del elemento en la posición i del arreglo
		
	}
	
	//-------------------------------------------------------------------------------------------------------------
	
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////