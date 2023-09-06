import java.util.Objects;

public class Contato {
	
	String nome;
	int numeroTelefone;
	
	public Contato(String nome, int numeroTelefone) {
		this.nome = nome;
		this.numeroTelefone = numeroTelefone;
	}
	
	public String toString() {
		return "\n\n Contato: nome: "+nome+
				"\n\t   N�mero de Telefone: "+numeroTelefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroTelefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome) || numeroTelefone == other.numeroTelefone;
	}
	
}
