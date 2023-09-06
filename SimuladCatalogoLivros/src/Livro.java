public class Livro {

	String titulo, autor;
	int ano;
	
	public Livro(String titulo, int ano, String autor) {
		this.titulo = titulo;
		this.ano = ano;
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		
		return " Titulo: "+titulo+"\n"+
				"\t   Autor: "+autor+"\n"+
				"\t   Ano de publica��o: "+ano;
	}
}
