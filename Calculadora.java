public class Calculadora {
	
	public static void main(String[] args) {
		
		static Scanner teclado = new Scanner(System.in);
	        static int a, b;
	        static int resultado = 0;
	        static int opcion = 0;
		
		do{
			mostrarMenu();
			opcion = teclado.nextInt();
			
			switch(opcion){
				case 1:// Suma
				sumar();
				break;
				
				case 2:// Resta
				restar();
				break;
				
				case 3:// Multiplicación
				multiplicar();
				break;
				
				case 4:// División
				dividir();
				break;
				
				case 0:// Salir
				System.out.println("Saliste del programa...el programa finalizó.");
				break;
				
				default:
				System.out.println("Opción inválida!");
				break;
			}
			
		} while(opcion != 0);
		}
		
		public static void mostrarMenu(){
			System.out.println("Ingrese el número de su operación: /n 1 sumar /n 2 restar /n 3 multiplicar /n 4 dividir /n 0 salir");
		}
		
		
}
