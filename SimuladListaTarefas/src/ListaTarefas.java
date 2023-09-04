import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaTarefas {

	List<Tarefa> listaTarefas = new ArrayList<>();
	List<String> listaDescricoes = new ArrayList<>();
	
	public void adicionarTarefa(String descricao) {
		listaTarefas.add(new Tarefa(descricao));
		listaDescricoes.add(descricao);
	}
	public void removerTarefa(String descricao) {
	
		// new ArrayList<>();
		
		List<Tarefa> remover = listaTarefas.stream().
		filter(s -> s.getDescricao().equals(descricao)).
		collect(Collectors.toList());
		listaTarefas.removeAll(remover);
		listaDescricoes.remove(remover.get(0).getDescricao());
		
		/*for(Tarefa tarefa : listaTarefas) {
			String des = tarefa.getDescricao();
			if(des.equalsIgnoreCase(descricao)) {
				listaTarefas.remove(tarefa);
				listaDescricoes.remove(descricao);
				break;
			}
		}*/
	}
	public int obterTotal() {
		return listaTarefas.size();
	}
	public List<String> obterDescricoes() {
		return listaDescricoes;
	}
}
