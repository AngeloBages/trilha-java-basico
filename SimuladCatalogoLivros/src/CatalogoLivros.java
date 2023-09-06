import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	List<Livro> catalogo = new ArrayList<>();
	
	public void adicionarLivro(Livro livro) {
		catalogo.add(livro);
	}
	public List<Livro> pesquisarPorAutor(String autor){

		
		List<Livro> listaAutor = catalogo.stream()
				                 .filter(s -> s.autor.equals(autor))
				                 .toList();
		
		/*for(Livro livro : catalogo) {
			if(livro.autor.equalsIgnoreCase(autor)) {
				listaAutor.add(livro);
			}
		}*/
		return listaAutor;
	}
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		
		List<Livro> listaAno = catalogo.stream()
				               .filter(s -> s.ano >= anoInicial && s.ano <= anoFinal)
				               .toList();
				
		/*for(Livro livro : catalogo) {
			if(livro.ano >= anoInicial && livro.ano <= anoFinal) {
				listaAno.add(livro);
			}
		}*/
		return listaAno;
	}
	public List<Livro> pesquisarPorTitulo(String titulo) {
		
		List<Livro> listaTitulo = catalogo.stream()
				                  .filter(s -> s.titulo.equals(titulo))
				                  .toList();
		
		/*for(Livro livro : catalogo) {
			if(livro.titulo.equalsIgnoreCase(titulo)) {
				listaTitulo.add(livro);
			}
		}*/
		return listaTitulo;
	}
}
