package polimorfismo;

public class Dentista extends ProfissionalSaude {

	private String cro;

	public Dentista(String nome, String especialidade, int valorConsulta) {
		super(nome, especialidade, valorConsulta);
	}

	public String getCro() {
		return cro;
	}

	public void setCro(String cro) {
		this.cro = cro;
	}

	@Override
	public void agendarConsulta() {
		System.out.println("Sua consulta com o/a " + getNome() + " — " + getEspecialidade() + " (CRO: " + getCro()
				+ ") foi agendada, e seu valor é: R$ " + getValorConsulta());
	}
}
