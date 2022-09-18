package ExercicoTemperatura;

import java.util.Scanner;



public class ConversorDeTemperatura {


	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
		System.out.println("Bem vindo ao conversor de Celcius para Fahrenheit.");
		System.out.println("Digite 1 para iniciar o conversor, 0 para finalizar o programa.");
		
		int escolha = entrada.nextInt();
		
		if ( escolha == 1) {
			System.out.println("Digite a temperatura em Celcius: ");
			float temp1 = entrada.nextFloat();
			float temp2 = ((temp1 *9/5)+32);
			System.out.println(temp1 + " Celcius é = " + temp2 + " em Fahrenheit");
			
		} else System.out.println("programa finalizado");
			
		
	}

}
