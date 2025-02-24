public class Ejercicio02_02b {
	public static void main(String[] args) {
		int numManzanas = Integer.valueOf(args[0]);
		int numPeras = Integer.valueOf(args[1]);
		int numCucharas = Integer.valueOf(args[2]);
		int numTenedores = Integer.valueOf(args[3]);
		int numNiños = Integer.valueOf(args[4]);
		int numAdultos = Integer.valueOf(args[5]);
		
		//Guardamos el resultado del calculo en una variable
		int numFrutas = suma(numManzanas, numPeras);
		int numCubiertos = suma (numCucharas, numTenedores);
		int numPersonas = suma (numNiños , numAdultos);
		
		System.out.println("Tenemos " + numFrutas + " piezas de fruta, " + numCubiertos + " cubiertos y " + numPersonas + " personas." );
	}
	
	private static int suma(int a, int b) {
		return a + b;
	}
}