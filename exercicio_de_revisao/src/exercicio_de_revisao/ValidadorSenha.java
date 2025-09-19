package exercicio_de_revisao;


public class ValidadorSenha {

	private String senha;
	
	public boolean TestaMaiuscula() {
		String maiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i=0; i< senha.length(); i++)
			for (int j=0; j < maiusculas.length();j++) {
				if (this.senha.charAt(i) == maiusculas.charAt(j))
					return true;
				}
	}
	
	public boolean verificarSeguranca() {
			if (this.senha.length() < 8) {
				return false;
			}
			else if (this.senha.equals(this.senha.toLowerCase())) {
				return false;
			}
			else {return true;
			}
	}

	public String getSenha() {		
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}