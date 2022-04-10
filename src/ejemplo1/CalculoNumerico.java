package ejemplo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CalculoNumerico {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Por favor ingrese el primer numero: ");
		Integer numero1 = cargarNumero();
		
		System.out.println("Por favor ingrese el segundo numero: ");
		Integer numero2 = cargarNumero();
		
		System.out.println("Por favor ingrese el tercer numero: ");
		Integer numero3 = cargarNumero();
		
		CalcularNumeroMayor(numero1, numero2, numero3);
		CalcularNumeroMenor(numero1, numero2, numero3);	
		
		crearArchivoCsv();
		generarContenidoArchivoCSV();
	}
	
	private static Integer cargarNumero() throws IOException {
		InputStreamReader capturarTeclado = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(capturarTeclado);
		String strNumero = buffer.readLine();
		Integer numero = Integer.parseInt(strNumero);
		return numero;
		
	}
	
	private static void CalcularNumeroMayor(Integer numero1, Integer numero2, Integer numero3) {
		Integer numeroMayor = numero1;
	
		if (numero2 > numeroMayor) {
			numeroMayor = numero2;
		}
		
		if (numero3 > numeroMayor) {
			numeroMayor = numero3;
		}
		
		System.out.println("El numero mayor es: " + numeroMayor);
	
	}
	
	private static void CalcularNumeroMenor(Integer numero1, Integer numero2, Integer numero3) {
		Integer numeroMenor = numero1;
		
		if (numero2 < numeroMenor) {
			numeroMenor = numero2;
		}
		
		if (numero3 < numeroMenor) {
			numeroMenor = numero3;
		}
		
		System.out.println("El numero menor es: " + numeroMenor);
	
	}
	
	private static void crearArchivoCsv() {
		String nombreArchivo           = "reporte-20220410.csv";
		String contenidoArchivoReporte = generarContenidoArchivoCSV();
		
		try {
			FileWriter writer = new FileWriter ( nombreArchivo);
			writer.write( contenidoArchivoReporte );
			writer.close();
		} catch (IOException ioe) {
			System.out.println("Hubo un problema al escribir el reporte.");
			System.out.println("Contacte con el administrador.");
		}
	}
	
	private static String generarContenidoArchivoCSV() {
		
		String cabeceraCSV      = "n1,n2,n3";
		String contenidoArchivo = cabeceraCSV + "\n";
		contenidoArchivo += "";
		contenidoArchivo += "";
		
		return contenidoArchivo;
	}
	
}

