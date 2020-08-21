/*
 * PROBLEMA: "dardo"
 * VER ARQUIVO "04-estrutura-condicional-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Dardo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as três distâncias:");
		double dis1 = sc.nextDouble();
		double dis2 = sc.nextDouble();
		double dis3 = sc.nextDouble();
		
		double disMaior;
		
		if (dis1 > dis2 && dis1 > dis3) {
			disMaior = dis1;
		} else {
			if (dis2 > dis3) {
				disMaior = dis2;
			} else {
				disMaior = dis3;
			}
		}
		
		System.out.println("MAIOR DISTÂNCIA = " + String.format("%.2f", disMaior));
		
		// fecha scanner
		sc.close();

	}

}
