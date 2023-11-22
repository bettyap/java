package aula_08.Atividade06;

public class Especializacao extends Curso {
	
	private int modalidade;

	public Especializacao(int id, int area, String nomeAluno, String endereco, int nascimento, int modalidade) {
		super(id, area, nomeAluno, endereco, nascimento);
		this.modalidade = modalidade;
	}

	public int getModalidade() {
		return modalidade;
	}

	public void setModalidade(int modalidade) {
		this.modalidade = modalidade;
	}
	
	public void visualizar() {
		
		String modalidadeCurso ="";

		switch (this.modalidade) {
		case 1:
			modalidadeCurso = "Presencial";
			break;
		case 2:
			modalidadeCurso = "Hibrido";
			break;
		case 3:
			modalidadeCurso = "Online";
			break;
		}
		
		
		super.visualizar();
		System.out.println("O curso é: " + modalidadeCurso);
	}
}
