import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class AgendaContatos {

	Set<Contato> contatos = new HashSet<>();
	
	public void adicionarContato(String nome, int numeroTelefone) {
		contatos.add(new Contato(nome,numeroTelefone));
	}
	public void exibirContatos() {
		System.out.println(contatos+"\n");
	}
	public Set<Contato> pesquisaPorNome(String nome) {
		return contatos.stream().filter(s -> s.nome.equals(nome)).collect(Collectors.toSet());
				
		/*for(Contato contato : contatos) {
			if(contato.nome.equalsIgnoreCase(nome)) {
				return contato;
			}
		}*/
	}
	public void atualizarNumeroContato(String nome, int novoNumero) {
		pesquisaPorNome(nome).toArray()[0] = novoNumero;
	}
}
