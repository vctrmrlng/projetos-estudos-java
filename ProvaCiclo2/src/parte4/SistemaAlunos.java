package parte4;

import java.util.ArrayList;

public class SistemaAlunos {

	public static void main(String[] args) {
		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		
		Aluno aluno001 = new Aluno("Carlos", 101);
		Aluno aluno002 = new AlunoVip("João", 202);
		
		listaAlunos.add(aluno001);
		listaAlunos.add(aluno002);
		
		for (Aluno a : listaAlunos) {
            a.exibirDados();
        }
	}

}
