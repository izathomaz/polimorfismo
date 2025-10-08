package polimorfismo;

public class cachorro extends animal {

	public cachorro(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void emitirSom() {
		System.out.println("O Cachorro está latindo!");
	}

}
