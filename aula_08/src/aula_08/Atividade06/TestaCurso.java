package aula_08.Atividade06;

public class TestaCurso {

	public static void main(String[] args) {

		Curso c1 = new Curso(1, 2, "Julia", "Alguma rua", 2001);
		c1.visualizar();
		
		Especializacao c2 = new Especializacao(1, 2, "Mel", "Logo ali", 2010, 2);
		c1.visualizar();

	}

}
