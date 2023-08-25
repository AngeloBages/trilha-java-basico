package Ex04;

import java.util.Scanner;

public class Main {

	public static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Elevador elevador = new Elevador();
		
		System.out.println("\n ***** Elevador *****");
		System.out.println("\n\n O Prédio possui " + Elevador.QUANTIDADE_ANDAR + " andares");
		
		System.out.print("\n Defina a capacidade máxima de pessoas no elevador: ");
		int capacidade = ler.nextInt();
		System.out.print("\n Defina o andar onde o elevador está: ");
		int andar = ler.nextInt();
		elevador.Inicializar(capacidade, andar);
		
		do {
			
			System.out.println("\n [1] - Entrar pessoa no elevador \n [2] - Sair pessoa do elevador");
			System.out.print("\n [3] - Subir Andar \n [4] - Descer Andar");
			System.out.println(System.lineSeparator().repeat(5));
			int opt = ler.nextInt();
			
			System.out.println(System.lineSeparator().repeat(12));
			
			switch(opt) {
			
			case 1:
				elevador.Entra();
				break;
				
			case 2:
				elevador.Sai();
				break;
				
			case 3:
				elevador.Subir();
				break;
				
			case 4:
				elevador.Descer();
				break;
			}
			
		}while(elevador.ocupacaoAtual != 0  ||  elevador.andarAtual != 0);
	}
}
