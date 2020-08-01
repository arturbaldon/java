/*
 * PROBLEMA: "retangulo"
 * VER ARQUIVO "03-estrutura-sequencial-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);
		
		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Base do retangulo: ");
		double baseRetangulo = sc.nextDouble();
		System.out.print("Altura do retangulo: ");
		double alturaRetangulo = sc.nextDouble();
		
		double area = baseRetangulo * alturaRetangulo;
		System.out.println("AREA = " + String.format("%.4f", area));
		
		double perimetro = 2.0 * (baseRetangulo + alturaRetangulo);
		System.out.println("PERIMETRO = " + String.format("%.4f", perimetro));
		
		double diagonal = Math.sqrt(Math.pow(baseRetangulo, 2) + Math.pow(alturaRetangulo, 2));
		System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));
		
		// fecha scanner
		sc.close();

	}

}
