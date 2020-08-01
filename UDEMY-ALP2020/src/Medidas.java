/*
 * PROBLEMA: "medidas"
 * VER ARQUIVO "03-estrutura-sequencial-exercicios"
 * */
import java.awt.geom.Arc2D.Double;
import java.util.Locale;
import java.util.Scanner;

public class Medidas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);
		
		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a medida A: ");
		double a = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		double b = sc.nextDouble();
		System.out.print("Digite a medida C: ");
		double c = sc.nextDouble();
		
		double areaQuadrado = Math.pow(a, 2);
		System.out.println("AREA DO QUADRADO =  " + String.format("%.4f", areaQuadrado));
		
		double areaTriangulo = (a * b) / 2.0;
		System.out.println("AREA DO TRIANGULO =  " + String.format("%.4f", areaTriangulo));
		
		double areaTrapezio = ((a + b) / 2.0) * c;
		System.out.println("AREA DO TRAPEZIO =  " + String.format("%.4f", areaTrapezio));
		
		// fecha scanner
		sc.close();

	}

}
