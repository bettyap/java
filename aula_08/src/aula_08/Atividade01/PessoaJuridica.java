package aula_08.Atividade01;

public class PessoaJuridica extends Cliente {
	
	private String cnpj;

	public PessoaJuridica(int id, String nome, int nascimento, String nomeProduto, int nota, String cnpj) {
		super(id, nome, nascimento, nomeProduto, nota);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + this.cnpj);
	}
	
	

}
