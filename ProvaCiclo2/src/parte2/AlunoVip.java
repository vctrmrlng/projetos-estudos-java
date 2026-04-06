package parte2;

public class AlunoVip extends Aluno{
	public AlunoVip(String nome, int numeroCadastro) {
        super(nome, numeroCadastro);
        
    }
	@Override
    public void exibirDados() {
        System.out.println("Aluno VIP: Nome = " + super.getNome() + 
                           " ID = " + super.getNumeroCadastro());
        System.out.println("Acesso a todas as aulas VIP");
    }
	
	
}

