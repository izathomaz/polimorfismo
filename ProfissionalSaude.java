package polimorfismo;

public class ProfissionalSaude {

	private String nome;
	private String especialidade;
	private int valorConsulta;

	public ProfissionalSaude(String nome, String especialidade, int valorConsulta) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.valorConsulta = valorConsulta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(int valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

	public void agendarConsulta() {
		System.out
				.println("Sua consulta com o/a " + getEspecialidade()+ "foi agendada, e seu valor é: R$ " + valorConsulta);
		;
	}
}
