package aula_08.Atividade01;

public class TestaCliente {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(1, "Julia", 2000, "Base", 5);
		c1.visualizar();
		
		PessoaJuridica pj = new PessoaJuridica(1, "Julia", 2000, "Base", 5, "12.345.678/0001-00");
		pj.visualizar();
		
		PessoaFisica pf = new PessoaFisica(1, "Amanda", 2000, "Base", 5, "123.456.789-09");
		pf.visualizar();

	}

}
