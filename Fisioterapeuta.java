package polimorfismo;

public class Fisioterapeuta extends ProfissionalSaude {

	private String crefito;

	public Fisioterapeuta(String nome, String especialidade, int valorConsulta) {
		super(nome, especialidade, valorConsulta);
	}

	public String getCrefito() {
		return crefito;
	}

	public void setCrefito(String crefito) {
		this.crefito = crefito;
	}

	@Override
	public void agendarConsulta() {
		System.out.println("Sua consulta com o/a " + getNome() + " — " + getEspecialidade() + " (CREFITO: " + getCrefito()
				+ ") foi agendada, e seu valor é: R$ " + getValorConsulta());
	}
}
