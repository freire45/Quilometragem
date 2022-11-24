package br.com.erickfreire.quilometragem;

import java.util.Scanner;

public class Quilometragem {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int quilometrosDirigidos;
		int quantidadeLitros;
		int opcao = 0;
		int totalQuilometros = 0;
		int totalLitros = 0;
		int totalViagens = 0;
		double mediaLitros;
		double mediaQuilometros;
		
		System.out.println("Programa que calcula a quilometragem feita em viagens de carro!\n\n");
		
		System.out.printf("Escolha uma opção: %n%n"
		        + "1 - Inserir uma nova viagem%n"
		        + "9 - Sair%n%n");	

		System.out.print("Digite uma opção: ");
		opcao = entrada.nextInt();
		
		while(opcao != 9) {			
			
			System.out.print("Informe a quantidade de quilometros dirigidos: ");
			quilometrosDirigidos = entrada.nextInt();
			
			System.out.print("Informe a quantidade de litros de gasolina gastos: ");
			quantidadeLitros = entrada.nextInt();
			
			totalQuilometros = totalQuilometros + quilometrosDirigidos;
			totalLitros = totalLitros + quantidadeLitros;
			totalViagens++;		
			
			System.out.printf("Escolha uma opção: %n%n"
			        + "1 - Inserir uma nova viagem%n"
			        + "9 - Sair%n%n");	
	
			System.out.print("Digite uma opção: ");
			opcao = entrada.nextInt();	
			
			
		}
		
		if(totalViagens > 0) {

		
		mediaQuilometros = totalQuilometros / totalViagens;
		mediaLitros = totalLitros / totalViagens;
		
		System.out.printf("%nTotal de viagens feitas: %d%n"
				        + "Total de Quilometros Dirigidos: %d%n"
				        + "Total de Litros de Gasolina consumidos: %d%n"
				        + "Media de Quilometros Dirigidos: %.2f%n"
				        + "Media de Litros Gastos por viagem: %.2f%n",totalViagens,totalQuilometros, totalLitros,mediaQuilometros, mediaLitros);
		
		} else {
			System.out.println("\nNenhum registro foi inserido!");
		}
		
		

	}

}
