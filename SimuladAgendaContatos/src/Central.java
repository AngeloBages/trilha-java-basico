import java.util.Scanner;

public class Central {

    static Scanner ler = new Scanner(System.in);
	
	public static void main(String [] args) {
	    
		AgendaContatos lista = new AgendaContatos();
		
		int opt = 0;
		
		do {
			
			System.out.println("\n\n AGENDA DE CONTATOS");
			System.out.print("\n [1]-Adicionar Contato\n [2]-Exibir Contatos");
			System.out.print("\n [3]-Pesquisar Contato por nome\n [4]-Atualizar n�mero de Contato");
			System.out.print("\n [5]-Sair\n ");
			opt = ler.nextInt();
			
			switch(opt){
				
				case 1:
					System.out.print("\n\n Digite o nome do contato a ser adicionado:\n ");
					String nome = ler.next();
					System.out.print("\n\n Digite o n�mero do contato a ser adicionado:\n ");
					int numeroTelefone = ler.nextInt();
					lista.adicionarContato(nome, numeroTelefone);
					break;
				case 2:
					lista.exibirContatos();
					break;
				case 3:
					System.out.printf("\n\n Digite o nome do Contato a ser pesquisado:\n ");
					System.out.println(lista.pesquisaPorNome(ler.next()));
					break;
				case 4:
					System.out.printf("\n\n Digite o nome do Contato a ser atualizado:\n ");
					String nom = ler.next();
					System.out.printf("\n\n Digite o novo n�mero do Contato a ser atualizado:\n ");
					int numeroTelefon = ler.nextInt();
					lista.atualizarNumeroContato(nom, numeroTelefon);
					break;
			}
		}while(opt != 5);
	}
}
