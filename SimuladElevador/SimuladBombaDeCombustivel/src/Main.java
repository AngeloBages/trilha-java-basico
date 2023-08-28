package Ex03;

import java.util.Scanner;

public class Main {

	public static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		BombaCombustivel bomba = new BombaCombustivel("Diesel", 12, 5000);
		
		do {
			
			System.out.println("\n ***** Bomba de Combustível *****");
			System.out.print("\n [1] - Abastecer por Valor \n [2] - Abastecer por Litro");
			System.out.print("\n [3] - Alterar valor do Combustível \n [4] - Alterar tipo de Combustível");
			System.out.println("\n [5] - Alterar quantidade de Combustível");
			
			int opt = ler.nextInt();
			
			System.out.println(System.lineSeparator().repeat(12));
			
			switch(opt) {
			
			case 1:
				System.out.print("\n Digiter o Valor a ser pago: ");
				double litro1 = bomba.abastecerPorValor(ler.nextInt());
				System.out.println("\n Você reabasteceu " + litro1 + "L");
				bomba.quantidade -= litro1;
				break;
				
			case 2:
				System.out.print("\n Digite a quantidade (Litros) a ser abastecida: ");
				int litro2 = ler.nextInt();
				double valor = bomba.abastecerPorLitro(litro2);
				System.out.println("\n Custo de reabastecimento: R$" + valor);
				bomba.quantidade -= litro2;
				break;
				
			case 3:
				System.out.println("\n Informe o novo valor do Combustível: ");
				bomba.alterarValor(ler.nextInt());
				break;
				
			case 4:
				System.out.println("\n Informe o novo tipo de Combustível: ");
				bomba.alterarTipoCombustivel(ler.nextLine());
				break;
				
			case 5:
				System.out.println("\n Informe a nova quantidade de Combustível: ");
				bomba.alterarQuantidade(ler.nextInt());
			}
			
		}while(bomba.quantidade > 0);
		
		System.out.println("\n A quantidade de Combustível acabou");
	}
}
