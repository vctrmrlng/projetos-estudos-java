package parte5;

import java.util.Scanner; 

public class GerenciadorTarefas { 
		private Tarefa tarefa;
		
		public void exibeMenu() {
			System.out.println("Escolha uma opção:\n1. Adicionar Tarefa\n2. Listar Tarefas\n3. Marcar a tarefa como Pendente ou Concluida\n4. Sair"); 
		}
		
		public void adicionaTarefa(Scanner sc) {
			System.out.println("Digite o nome da tarefa"); 
			String nomeDigitado = sc.nextLine(); 
			if (nomeDigitado.trim().isEmpty()) { 
				System.out.println("A tarefa não pode estar em branco!\n");
				} 
			else {
				System.out.println("Digite a descrição da tarefa (opcional):");
		        String descricaoDigitada = sc.nextLine();
		        
				tarefa=new Tarefa (nomeDigitado);
				tarefa.setDescricao(descricaoDigitada);
				System.out.println("Tarefa '" + nomeDigitado + "' adicionada com sucesso!");
				System.out.println();
				} 
		}

		public void listaTarefa() {
			if (tarefa==null) {
				System.out.println("Nenhuma tarefa cadastrada.\n");
				}
			else {System.out.println(tarefa.exibirDetalhes() + "\n");}
			}
		
		
		public static void main(String[] args) {
			GerenciadorTarefas gt = new GerenciadorTarefas();
			Scanner sc = new Scanner(System.in);
			int digito = 0;
			while (digito!=4) {
			gt.exibeMenu();
			digito = sc.nextInt();
			sc.nextLine();
			if (digito==1) {
				gt.adicionaTarefa(sc);
				System.out.println("");
				}
			else if (digito==2) {
				gt.listaTarefa();
				}
			else if (digito==3) {
				if (gt.tarefa == null) {
					System.out.println("Nenhuma tarefa cadastrada ainda.\n");	    
			} else {
				int novoStatus;
				System.out.println("Digite 1 para marcar como concluida\n Digite 2 para marcar como pendente\n");
				novoStatus = sc.nextInt();
				sc.nextLine();
				if (novoStatus==1) {gt.tarefa.marcarComoConcluida();}
				else if (novoStatus==2) {gt.tarefa.marcarComoPendente();}
				else {System.out.println("Opção inválida!\n");}
			}}
			else if (digito==4) {System.out.println("Saindo do programa. Até logo!");}
			else {System.out.println("Opção inválida. Tente novamente.\n");}
			}
			sc.close();
		}
		}