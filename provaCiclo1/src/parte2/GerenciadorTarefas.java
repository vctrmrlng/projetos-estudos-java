package parte2;

import java.util.Scanner; 

public class GerenciadorTarefas { 
		private String tarefa = "";
		
		public void exibeMenu() {
			System.out.println("Escolha uma opção:\n1. Adicionar Tarefa\n2. Listar Tarefas\n3. Sair\n"); 
		}
		
		public void adicionaTarefa(Scanner sc) {
			System.out.println("Digite o nome da tarefa"); 
			String textoDigitado = sc.nextLine(); 
			String tarefaTemp; 
			tarefaTemp = textoDigitado; 
			if (tarefaTemp.trim().isEmpty()) { 
				System.out.println("A tarefa não pode estar em branco!");
				System.out.println();
				} 
			else {
				tarefa=tarefaTemp; 
				System.out.println("Tarefa '" + tarefa + "' adicionada com sucesso!");
				System.out.println();
				} 
		}

		public void listaTarefa() {
			if (tarefa.isEmpty()) {
				System.out.println("Nenhuma tarefa cadastrada.\n");
				System.out.println();
				}
			else {System.out.println("Tarefa '" + tarefa + "\n");}
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