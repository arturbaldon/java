/*
 * PROBLEMA: "aprovados"
 * VER ARQUIVO "06-vetores-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		String[] vetNome = new String[n];
		double[] vetNota1 = new double[n];
		double[] vetNota2 = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o nome, primeira e segunda nota do " + (i+1) + "o aluno:");
			sc.nextLine();
			vetNome[i] = sc.nextLine();
			vetNota1[i] = sc.nextDouble();
			vetNota2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		double media;
		for (int i = 0; i < n; i++) {
			media = (vetNota1[i] + vetNota2[i]) / 2.0;
			if (media >= 6.0) {
				System.out.println(vetNome[i]);
			}
		}
		
		// fecha scanner
		sc.close();

	}

}
