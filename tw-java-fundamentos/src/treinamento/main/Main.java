package treinamento.main;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int numero1 = scanner.nextInt();
		
		
	System.out.print("Digite a operacao: ");	
	
		char operacao = scanner.next().charAt(0);
		

	System.out.print("Digite o segundo numero: ");	
		int numero2 = scanner.nextInt();
	
		
	System.out.println(String.format("Voce quer fazer operaaoo %d %c %d", numero1, operacao, numero2 ));
		int resultado = 0;
	
	
		if(operacao == '+' ) {
			
			resultado = numero1 + numero2;
			
		} else if (operacao == '-') {
			
			resultado = numero1 - numero2;
			
		} else if (operacao == '*') {
			
			resultado = numero1 * numero2;
			
		} else if (operacao == '/') {
			
			resultado = numero1 / numero2;
			
		} else {
			
			System.out.println ("Operacao invalida");
		}
		
		
		System.out.println(String.format("%d %c %d = %d",numero1, operacao, numero2, resultado));		
		
	
	scanner.close();
		
		
		

	}

}
