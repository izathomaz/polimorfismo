package polimorfismo;

public class Jornada extends Funcionario {

	public Jornada(int id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}

	@Override
	public double calcularSalario(double diaTrabalhado, double salarioSemanal) {
		salarioSemanal = diaTrabalhado * 7;
		double desconto = 1000;
		return salarioSemanal - desconto;
	}
}
