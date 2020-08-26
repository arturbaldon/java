/*
 * PROBLEMA: "mais_velho"
 * VER ARQUIVO "06-vetores-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Mais_velho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		String[] vetNome = new String[n];
		int[] vetIdade = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			vetNome[i] = sc.next();
			System.out.print("Idade: ");
			vetIdade[i] = sc.nextInt();
		}
		
		int maiorIdade = vetIdade[0];
		int posicao = 0;
		for (int i = 1; i < n; i++) {
			if (vetIdade[i] > maiorIdade) {
				maiorIdade = vetIdade[i];
				posicao = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + vetNome[posicao]);
		
		// fecha scanner
		sc.close();

	}

}
