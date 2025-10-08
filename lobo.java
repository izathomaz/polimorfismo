package polimorfismo;

public class lobo extends animal {

	public lobo(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void emitirSom() {
		System.out.println("O Lobo está uivando!");
	}
}
