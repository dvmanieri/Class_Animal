package Aula_19;

import java.io.InputStream;
import java.util.Scanner;

public class TesteAnimais {

	public static void main(String[] args) {
		
		//Objetos
		
		Class_animais jacare = new Class_animais();
		Class_animais onca = new Class_animais();
		Class_animais urso = new Class_animais();
		Class_animais tubarao = new Class_animais();
		Class_animais humano = new Class_animais();
		Scanner scan = new Scanner(System.in);
		
		//variaveis:
		int navegador;
		int controlador = 1;
		int navegador2 = 0;
		double x;
		
		while(controlador != 0) {
			
		System.out.println(" ");
		System.out.println("::ANIMAIS::");
		System.out.println("caracteristicas animais - 1");
		System.out.println("Qual a força total?- 2");
		System.out.println("Descubra o tempo de vida do seu animal - 3");
		System.out.println(" ");
			
		navegador2 = scan.nextInt();
		
			jacare.altura = 3;
			jacare.MordidaForca = 2125;
			jacare.peso = 300;
			jacare.velocidade = 48;
			jacare.nome = "jacare";
			jacare.tempo = 50;
			
			onca.altura = 1.5;
			onca.MordidaForca = 2000;
			onca.peso = 96;
			onca.velocidade = 80;
			onca.nome = "onça";
			onca.tempo = 15;
			
			urso.altura = 2;
			urso.MordidaForca = 1200;
			urso.peso = 540;
			urso.velocidade = 56;
			urso.nome = "Urso";
			urso.tempo = 20;
			
			tubarao.altura = 4;
			tubarao.MordidaForca = 4000;
			tubarao.peso = 1100;
			tubarao.velocidade = 56;
			tubarao.nome = "Tubarao";
			tubarao.tempo = 70;
			
			humano.altura = 1.7;
			humano.MordidaForca = 162;
			humano.peso = 80;
			humano.velocidade = 13;
			humano.nome = "Humano";
			humano.tempo = 75;
			
			if(navegador2==1) {
				System.out.println(" ");
				System.out.println("jacare -1 ");
				System.out.println("onça -2 ");
				System.out.println("urso -3 ");
				System.out.println("tubarão -4 ");
				System.out.println("humano -5 ");
				System.out.println("sair -6 ");
				
				navegador = scan.nextInt();
				
				
				switch(navegador) {
				case 1 :
					jacare.caracteristicas();
					break;
					
				case 2 :
					onca.caracteristicas();
					break;
				case 3 :
					urso.caracteristicas();
					break;
				case 4 :
					tubarao.caracteristicas();
					break;
				case 5 :
					humano.caracteristicas();
					break;
				case 6 :
					controlador--;
					break;
				
				}
				
				
			}
			
			if(navegador2==2) {
				System.out.println(" ");
				System.out.println("jacare -1 ");
				System.out.println("onça -2 ");
				System.out.println("urso -3 ");
				System.out.println("tubarão -4 ");
				System.out.println("humano -5 ");
				System.out.println("sair -6 ");
				
				navegador = scan.nextInt();
				
				switch(navegador) {
				case 1 :
					System.out.println(jacare.forcaTotal()); 
					break;
					
				case 2 :
					System.out.println( onca.forcaTotal()); 
					break;
				case 3 :
					System.out.println( urso.forcaTotal());
					break;
				case 4 :
					System.out.println( tubarao.forcaTotal());
					break;
				case 5 :
					System.out.println( humano.forcaTotal());
					break;
				case 6 :
					controlador--;
					break;
				
				}
				
				
			}
			if(navegador2==3) {
				System.out.println(" ");
				System.out.println("jacare -1 ");
				System.out.println("onça -2 ");
				System.out.println("urso -3 ");
				System.out.println("tubarão -4 ");
				System.out.println("humano -5 ");
				System.out.println("sair -6 ");
				
				navegador = scan.nextInt();
				
				
				switch(navegador) {
				case 1 :
					jacare.vida();
					break;
					
				case 2 :
					onca.vida();
					break;
				case 3 :
					urso.vida();
					break;
				case 4 :
					tubarao.vida();
					break;
				case 5 :
					humano.vida();
					break;
				case 6 :
					controlador--;
					break;
				
				}
				
				
			
			}
		}
	}


}
