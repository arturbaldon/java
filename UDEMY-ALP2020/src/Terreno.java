/*
 * PROBLEMA: "terreno"
 * VER ARQUIVO "03-estrutura-sequencial-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);
		
		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura do terreno: ");
		double largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		double valorMetroQuadrado = sc.nextDouble();
		
		double areaTerreno = largura * comprimento;
		System.out.println("Área do terreno = " + String.format("%.2f", areaTerreno));
		
		double precoTerreno = valorMetroQuadrado * areaTerreno;
		System.out.println("Preço do terreno = " + String.format("%.2f", precoTerreno));
		
		// fecha scanner
		sc.close();

	}

}
