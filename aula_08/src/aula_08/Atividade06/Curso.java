package aula_08.Atividade06;

public class Curso {
	
	private int id;
	private int area;
	private String nomeAluno;
	private String endereco;
	private int nascimento;
	
	public Curso(int id, int area, String nomeAluno, String endereco, int nascimento) {
		super();
		this.id = id;
		this.area = area;
		this.nomeAluno = nomeAluno;
		this.endereco = endereco;
		this.nascimento = nascimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNascimento() {
		return nascimento;
	}

	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}
	
	public void visualizar() {
		String areaDev ="";

		switch (this.area) {
		case 1:
			areaDev = "Back-End";
			break;
		case 2:
			areaDev = "Front-End";
			break;
		case 3:
			areaDev = "Full-Stack";
			break;
		}

		System.out.println("Id: " + this.id);
		System.out.println("Área: " + areaDev);
		System.out.println("Nome: " + this.nomeAluno);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Ano Nascimento: " + this.nascimento);
	}

}
