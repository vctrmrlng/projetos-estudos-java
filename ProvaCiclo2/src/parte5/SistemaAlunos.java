package parte5;

import java.util.ArrayList;

public class SistemaAlunos {

	public static void main(String[] args) {
		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		
		Aluno aluno001 = new Aluno("Carlos", 101);
		Aluno aluno002 = new AlunoVip("João", 202);
		Aluno aluno003 = new AlunoExclusivo("Felipe", 303);
		
		listaAlunos.add(aluno001);
		listaAlunos.add(aluno002);
		listaAlunos.add(aluno003);
		
		for (Aluno a : listaAlunos) {
            a.exibirDados();
            if (a instanceof AlunoExclusivo) {
            	a.efetuarPagamento(199.90 , "Cartão de crédito");
            	System.out.println();
            	}
            else if (a instanceof AlunoVip) {
            	a.efetuarPagamento(149.90);
            	System.out.println();
            	}
            else {
            	a.efetuarPagamento();
            	System.out.println();
            	}
		
		}           
		
	}
}