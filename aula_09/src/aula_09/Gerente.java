package aula_09;

public class Gerente extends Funcionario implements CalcularSalario{
	
	private float bonus;

	public Gerente(String nome, int cargo, float salario, float bonus) {
		super(nome, cargo, salario);
		this.bonus = bonus;
	}
	
	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Bônus: " + this.bonus);
	}

	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return this.getSalario() + bonus;
	}
	
}
