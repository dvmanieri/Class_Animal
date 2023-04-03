package Time_08;

public class Class_animais {
	
	//atribuicao das caracteristicas das classes
	
	double altura;
	double velocidade;
	double MordidaForca;
	double peso;
	String nome;
	int tempo;

	// metodo para retornar as caracteristicas
	void caracteristicas() {
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("      " + nome);
		System.out.println("Altura/comprimento: " + altura + "m");
		System.out.println("Velocidade: " + velocidade + "Km");
		System.out.println("Força da mordida: " + MordidaForca + "PSI");
		System.out.println("Peso/massa: " + peso + "Kg");
		System.out.println(" ");
		System.out.println(" ");

	}

	// metodo para calcular a forca total do animal
	double forcaTotal() {

		return (altura + velocidade + MordidaForca + peso) / 4;

	}

	// metodo para retornar o tempo de vida do seu animal
	void vida() {
		System.out.println(" ");
		System.out.println("O tempo de vida do seu animal é: " + tempo + " anos");
		System.out.println(" ");
	}

	// metodo para retornar o tempo percorrido em um determinado espaço
	double Velomedia(double distancia, double velocidade) {

		return 60 * (distancia / velocidade);

	}
}
