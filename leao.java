package polimorfismo;

public class leao extends animal {

	public leao(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void emitirSom() {
		System.out.println("O Leão está rugindo!");
	}
}
