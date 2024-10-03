
/*
 * En este código se corrigio lo siguiente.
 * -se agregro el metod main para proporcionar las lineas de codigo sobre éste.
 * -se creo la variable integer
 * - ala variable incremental i se agrego otro signo de suma ya que para incrementar necesita de doble ++
 * - a sistem de impresion se agrego .out para definir que es un dato de salida
 * - sl sistem.out se le agrego la "n" al final ya que se imprimira con un salto de linea
 * - En la linea 24 no se puede invocar un parseInt para   en un array de tipo int asi que se sustituyo por
 * la longitud del array
 * */
public class Codigo6 {

	public static void main(String[] args) {
		int[][] Integer;
		int[] n = Integer[20];

	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = Integer.length;

	    int multiplo = (opcion == 1) : 5 ? 7;

	    foreach (char e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	       else {
	        System.in.print(e + " ");
	      }
	    }
	  
	}
	}
		  
	    

