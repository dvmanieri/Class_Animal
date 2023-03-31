package Aula_19;

public class Class_animais {
	double altura;
	double velocidade;
	double MordidaForca;
	double peso;
	String nome;
	int tempo;
	String curiosidade;

	void caracteristicas() {

		System.out.println("      " + nome);
		System.out.println("altura/comprimento: " + altura + "m");
		System.out.println("velocidade: " + velocidade + "Km");
		System.out.println("Força da mordida: " + MordidaForca + "PSI");
		System.out.println("peso/massa: " + peso + "Kg");

	}

	double forcaTotal() {
		return (altura + velocidade + MordidaForca + peso) / 4;
	}

	void vida() {
		System.out.println("O tempo de vida do seu animal é: " + tempo + " anos");
	}
}
