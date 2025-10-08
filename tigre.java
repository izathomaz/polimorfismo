package polimorfismo;

public class tigre extends animal {

	public tigre(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void emitirSom() {
		System.out.println("O Tigre está roncando!");
	}

}
