package aula_08.Atividade01;

public class PessoaFisica extends Cliente {

	private String cpf;

	public PessoaFisica(int id, String nome, int nascimento, String nomeProduto, int nota, String cpf) {
		super(id, nome, nascimento, nomeProduto, nota);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	} 
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: " + this.cpf);
	}

}
