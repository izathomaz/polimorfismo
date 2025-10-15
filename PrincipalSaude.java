package polimorfismo;

public class PrincipalSaude {

	public static void main(String[] Args) {

		Medico medico = new Medico("Dr. Cristina Yang ", "Cardiologista", 700);
		medico.setCrm("CRM/SP 123456");
		medico.agendarConsulta();
		System.out.println("-------------");

		Dentista dentista = new Dentista("Dr. Alex Karev ", "OdontoPediatra", 580);
		dentista.setCro("CRO-SP-12345");
		dentista.agendarConsulta();
		System.out.println("-------------");

		Fisioterapeuta fisioterapeuta = new Fisioterapeuta("Dr. Kalliope Torres ", "Traumato-Ortopédica", 800);
		fisioterapeuta.setCrefito("123456-F");
		fisioterapeuta.agendarConsulta();
		System.out.println("-------------");
	}
}