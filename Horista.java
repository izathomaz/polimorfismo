package polimorfismo;

public class Horista extends Funcionario {

	public Horista(int id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}

	@Override
	public double calcularSalario(double salarioHora, double horasTrabalhadas) {
		double salarioBruto = salarioHora * horasTrabalhadas;
		double desconto = 1000;
		return salarioBruto - desconto;
	}

}
