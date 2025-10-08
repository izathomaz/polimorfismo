package polimorfismo;

public class principal {

	public static void main(String[] args) {

		lobo lobo = new lobo("Thor", "M", "Qualquer");
		lobo.emitirSom();

		leao leao = new leao("Alex", "M", "Qualquer");
		leao.emitirSom();

		tigre tigre = new tigre("Tigrinho", "M", "Qualquer");
		tigre.emitirSom();

		cachorro cachorro = new cachorro("Amora", "F", "Shitzu");
		cachorro.emitirSom();

		gato gato = new gato("Mingau", "F", "Qualquer");
		gato.emitirSom();
	}

}
