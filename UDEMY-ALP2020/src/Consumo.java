/*
 * PROBLEMA: "consumo"
 * VER ARQUIVO "03-estrutura-sequencial-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);
		
		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Distancia percorrida: ");
		int distanciaPercorrida = sc.nextInt();
		System.out.print("Combustível gasto: ");
		double combustivelGasto = sc.nextDouble();
		
		double consumoMedio = (double)distanciaPercorrida / combustivelGasto;
		System.out.println("Consumo medio = " + String.format("%.3f", consumoMedio));
		
		// fecha scanner
		sc.close();

	}

}
