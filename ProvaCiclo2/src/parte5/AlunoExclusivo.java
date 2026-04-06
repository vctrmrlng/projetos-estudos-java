package parte5;

public class AlunoExclusivo extends Aluno{
	public AlunoExclusivo(String nome, int numeroCadastro) {
        super(nome, numeroCadastro);

	}
	
	@Override
    public void exibirDados() {
        System.out.println("Aluno VIP: Nome = " + super.getNome() + 
                           " ID = " + super.getNumeroCadastro());
        System.out.println("Acesso ilimitado e Personal Trainer exclusivo");
    }

}
