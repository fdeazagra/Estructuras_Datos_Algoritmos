package arreglo;

public class PruebasArregloClass {

	public static void main(String[] args) {
		// 1. Creamos un arreglo con 30 elementos
		
			int sizeArreglo = 30;
			ArregloClass arr; 
			arr = new ArregloClass(sizeArreglo);				// crea una instancia de la clase ArregloClass
															// con el constructor de la clase
		
	
		// 2. Insertamos 10 elementos en el arreglo
			
			arr.insertar(18);
			arr.insertar(85);
			arr.insertar(42);
			arr.insertar(61);
			arr.insertar(29);
			arr.insertar(12);
			arr.insertar(33);
			arr.insertar(1);
			arr.insertar(54);
			arr.insertar(77);
			
		// 3. Imprimimos los valores del arreglo en consola
		
			arr.mostrarElementos();
			
		// 4. Buscamos elemento en el arreglo
			
			int valorBuscar = 22;
			if(arr.buscar(valorBuscar)) {
				
				System.out.println("Valor encontrado: "  + valorBuscar);
				
			} else {
				
				System.out.println("Valor no encontrado: "  + valorBuscar);
			}
		
		// 5. Borramos 3 elementos en el arreglo
			
			arr.eliminar(61);
			arr.eliminar(1);
			arr.eliminar(33);
		
		// 6. Imprimimos de nuevo los valores del arreglo
		
			arr.mostrarElementos();

	}

}
