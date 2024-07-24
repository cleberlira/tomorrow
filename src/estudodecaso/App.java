package estudodecaso;

import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a voltagem");
		
		int voltagem = teclado.nextInt();
		
		System.out.println("Informe o tamanho de tela");
		
		float tamanhoTela = teclado.nextFloat();
		
		System.out.println("Informe o volume");
		
		int volume = teclado.nextInt();
		
		
		ControleRemoto controleremoto = new ControleRemoto();
		
		controleremoto.setTamanhoTela(tamanhoTela);
		
		controleremoto.setVoltagem(voltagem);
		
		controleremoto.ligar();
		
		controleremoto.setVolume(volume);
		
		controleremoto.aumentarVolume();
		
		teclado.close();
		
		
		// TODO Auto-generated method stub

	}

}
