package polimorfismo;

public class ConsultorPj extends Funcionario {

	public ConsultorPj(int id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}

	@Override
	public double calcularSalario(double valorContrato, double desconto) {
		desconto = 1500;
		return valorContrato - desconto;
	}
}
