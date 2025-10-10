package parte4;

import java.util.Scanner; 

public class GerenciadorTarefas { 
		private Tarefa tarefa;
		
		public void exibeMenu() {
			System.out.println("Escolha uma opção:\n1. Adicionar Tarefa\n2. Listar Tarefas\n3. Sair\n"); 
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
			while (digito!=3) {
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
			else if (digito==3) {System.out.println("Saindo do programa. Até logo!");}
			else {System.out.println("Opção inválida. Tente novamente.\n");}
			}
			sc.close();
		}
		}