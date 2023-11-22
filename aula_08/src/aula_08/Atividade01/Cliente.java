package aula_08.Atividade01;

public class Cliente {

	private int id;
	private String nome;
	private int nascimento;
	private String nomeProduto;
	private int nota;

	public Cliente(int id, String nome, int nascimento, String nomeProduto, int nota) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.nomeProduto = nomeProduto;
		this.nota = nota;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNascimento() {
		return nascimento;
	}

	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public void visualizar() {
	
		System.out.println("\nOlá!");
		System.out.println("Id: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Nascimento: " + this.nascimento);
		System.out.println("Nome do Produto: " + this.nomeProduto);
		System.out.println("Nota do Produto: " + this.nota);
		
	}

}
