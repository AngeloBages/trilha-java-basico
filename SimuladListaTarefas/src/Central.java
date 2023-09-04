package t03;

import java.util.Scanner;

public class Central {
	
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String [] args) {
	    
		ListaTarefas lista = new ListaTarefas();
		
		int opt = 0;
		
		do {
			
			System.out.println("\n\n LISTA DE TAREFAS");
			System.out.print("\n [1]-Adicionar Tarefa\n [2]-Remover Tarefa");
			System.out.print("\n [3]-Obter Total de Tarefas\n [4]-Obter Descrições");
			System.out.print("\n [5]-Sair\n ");
			opt = ler.nextInt();
			
			switch(opt){
				
				case 1:
					System.out.print("\n\n Digite a descrição da tarefa a ser adicionada:\n ");
					lista.adicionarTarefa(ler.next());
					break;
				case 2:
					System.out.print("\n\n Digite a descrição da tarefa a ser removida: \n ");
					lista.removerTarefa(ler.next());
					break;
				case 3:
					System.out.print("\n\n Total de tarefas: " + lista.obterTotal());
					break;
				case 4:
					System.out.print("\n\n Descrições:");
					int i = 1;
					for(String descricoes: lista.listaDescricoes) {
						System.out.printf("\n Tarefa %s: %s",i,descricoes);
						i++;
					}
					break;
			}
		}while(opt != 5);
	}
}
