package parte4;

public class Tarefa {
	private String nome;
	private String descricao;
	private boolean concluida;

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
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
