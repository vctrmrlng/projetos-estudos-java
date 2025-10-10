package parte3;

public class Tarefa {
	private String nome;
	private String descricao;
	private boolean concluida;

	public Tarefa (String nome) {
		this.nome = nome;
		this.descricao = "";
		this.concluida = false;
	}
		
	public String exibirDetalhes() {
		String status = concluida ? "Concluída" : "Pendente";
		return ("Nome:" + nome +  "| Descrição: " + descricao + " | Status:" + status );
	}
	}
