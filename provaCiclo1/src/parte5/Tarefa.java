package parte5;

public class Tarefa {
	private String nome;
	private String descricao;
	private boolean concluida;

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Tarefa (String nome) {
		this.nome = nome;
		this.descricao = "";
		this.concluida = false;
	}
	
	public Tarefa(String nome, String descricao) {
	    this.nome = nome;
	    this.descricao = descricao;
	    this.concluida = false;
	}
		
	public String exibirDetalhes() {
		String status = concluida ? "Concluída" : "Pendente";
		return ("Nome:" + nome +  "| Descrição: " + descricao + " | Status:" + status );
	}
	
	public void marcarComoConcluida() {
		setConcluida(true);
		System.out.println("Tarefa '" + nome + "' marcada como concluída!");
		
	}
	public void marcarComoPendente() {
		setConcluida(false);
		System.out.println("Tarefa '" + nome + "' marcada como pendente!");
		
	}

}
