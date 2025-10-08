package polimorfismo;

public class PrincipalFunc {

	public static void main(String[] args) {
		Horista horista = new Horista(1, "Izabele", "(15)998555296", 12345, "Rua dos bobos");
		System.out.println("Salário do horista é: R$" + horista.calcularSalario(50, 40));
		System.out.println("         ");

		Jornada jornada = new Jornada(2, "Mavy", "(15)998555297", 23456, "Rua dos bobos");
		System.out.println("Salário do CLT é: R$" +jornada.calcularSalario(1000, 0));
		System.out.println("         ");

		ConsultorPj consultorPj = new ConsultorPj(3, "Beatriz", "(15)998555298", 34567, "Rua dos bobos");
		System.out.println("Salário do PJ é: R$" +consultorPj.calcularSalario(14000, 1500));
	}

}
