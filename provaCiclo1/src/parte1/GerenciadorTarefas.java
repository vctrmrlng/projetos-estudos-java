package parte1;

import java.util.Scanner; 

public class GerenciadorTarefas { 
	public static void main(String[] args) { 
		String tarefa = ""; 
		Scanner sc = new Scanner(System.in); 
		int digito = 0; 
		while (digito!=3) { 
			System.out.println("Escolha uma opção:\n1. Adicionar Tarefa\n2. Listar Tarefas\n3. Sair\n"); 
			int entrada = sc.nextInt(); 
			sc.nextLine(); 
			digito = entrada; 
			if (digito != 1 && digito != 2 && digito != 3) { 
				System.out.println("Opção inválida. Tente novamente."); 
				} 
			else if (digito==1) { 
				System.out.println("Digite o nome da tarefa"); 
				String textoDigitado = sc.nextLine(); 
				String tarefaTemp; 
				tarefaTemp = textoDigitado; 
				if (tarefaTemp.trim().isEmpty()) { 
					System.out.println("A tarefa não pode estar em branco!"); 
					} 
				else {
					tarefa=tarefaTemp; 
					System.out.println("Tarefa " + tarefa + " adicionada com sucesso!"); 
					} 
				} 
			else if (digito==2) {
				if (tarefa.isEmpty()) { 
					System.out.println("Nenhuma tarefa cadastrada.\n"); 
					} 
				else System.out.println("Tarefa " + tarefa + "\n"); 
				} 
			else {System.out.println("Saindo do programa. Até logo!");
			} 
			} 
		sc.close(); 
		} 
	}