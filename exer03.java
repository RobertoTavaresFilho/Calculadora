package aula34.labs;

import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		do {
			System.out.println("Entre com um numero positivo.");
			num = scan.nextInt();
			if (num < 0) {
				System.out.println("Numero invalido,Entre novamente");
			}
				
				
			
		}while(num <0);
		
		System.out.println(Calculadora.fatorial(num));

	}

}
