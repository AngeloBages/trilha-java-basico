import java.util.Scanner;

public class Central {

    static Scanner ler = new Scanner(System.in);
	
	public static void main(String [] args) {
	    
		CatalogoLivros catalogo = new CatalogoLivros();
		
		int opt = 0;
		int i = 0;
		
		do {
			
			System.out.println("\n\n CATALOGO DE LIVROS");
			System.out.print("\n [1]-Adicionar Livro\n [2]-Pesquisar por autor");
			System.out.print("\n [3]-Pesquisar por intervalo de anos\n [4]-Pesquisar por t�tulo");
			System.out.print("\n [5]-Sair\n ");
			opt = ler.nextInt();
			
			switch(opt){
				
				case 1:
					System.out.print("\n\n Digite o T�tulo do livro a ser adicionado:\n ");
					String titulo = ler.next();
					System.out.print("\n\n Digite o Ano do livro a ser adicionado:\n ");
					int ano = ler.nextInt();
					System.out.print("\n\n Digite o nome do autor do livro a ser adicionado:\n ");
					String autor = ler.next();
					catalogo.adicionarLivro(new Livro(titulo,ano,autor));
					break;
				case 2:
					i = 1;
					System.out.print("\n\n Digite o nome do autor a ser pesquisado: \n ");
					for(Livro livro : catalogo.pesquisarPorAutor(ler.next())) {
						System.out.printf("\n\n Livro %s: %s",i,livro);
						i++;
					}
					break;
				case 3:
					i = 1;
					System.out.print("\n\n Digite o intervalo de anos a ser pesquisado: \n ");
					System.out.print(" Ano Incial: ");
					int anoInicial = ler.nextInt();
					System.out.print(" Ano Final: ");
					int anoFinal = ler.nextInt();
					for(Livro livro : catalogo.pesquisarPorIntervaloAnos(anoInicial,anoFinal)) {
						System.out.printf("\n\n Livro %s: %s",i,livro);
						i++;
					}
					break;
				case 4:
					i = 1;
					System.out.print("\n\n Digite o nome do titulo a ser pesquisado: \n ");
					for(Livro livro : catalogo.pesquisarPorTitulo(ler.next())) {
						System.out.printf("\n\n Livro %s: %s",i,livro);
						i++;
					}
					break;
			}
		}while(opt != 5);
	}
}
