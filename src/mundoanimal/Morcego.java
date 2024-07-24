package mundoanimal;

public class Morcego extends Mamifero {
	
	
	private int tamanhoPresa;
	
	
	
	public Morcego(String nome) {
	  super(nome);	
		
	}
	
	public void voar() {
		
		System.out.println("Morcego voando");
	}

	@Override
	public void mamar() {
		super.mamar();
		
		System.out.println("Morcego mamando também do jeito dele");
		
		
	}
}
