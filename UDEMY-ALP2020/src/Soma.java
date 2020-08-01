/*
 * PROBLEMA: "soma"
 * VER ARQUIVO "03-estrutura-sequencial-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);
		
		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
		int x = sc.nextInt();
		System.out.print("Digite o valor de Y: ");
		int y = sc.nextInt();
		
		int soma = x + y;
		System.out.println("SOMA = " + soma);
		
		// fecha scanner
		sc.close();

	}

}
