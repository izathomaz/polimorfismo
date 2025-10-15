package polimorfismo;

public class Medico extends ProfissionalSaude {

	private String crm;

	public Medico(String nome, String especialidade, int valorConsulta) {
		super(nome, especialidade, valorConsulta);
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	@Override
	public void agendarConsulta() {
		System.out.println("Sua consulta com o/a " + getNome() + " — " + getEspecialidade() + " (CRM: " + getCrm()
				+ ") foi agendada, e seu valor é: R$ " + getValorConsulta());
	}
}
