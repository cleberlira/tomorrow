package estudodecaso;

public class ControleRemoto {

	
	private float tamanhoTela;
	public float getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(float tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		
		if ((voltagem == 110) || (voltagem == 220)) {
			this.voltagem = voltagem;
			
		}else {
			System.out.println("Voltagem inválida");
		}
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}


	private int volume;
	private String marca;
	private int voltagem;
	private int canal;

	public ControleRemoto() {
		
		this.volume = 5;
		
	}

	public void ligar() {
		System.out.println("O consumo da TV é " + this.getConsumo());
		
	}
	
	
	public void desligar() {
		
		System.out.println("Desligando a TV");
	}
	
	public void aumentarVolume() {
		
		if ((volume >=1) && (volume < 10)) {
			volume = volume + 1;
			System.out.println("O volume é " + volume);
		}else {
			System.out.println("Não é possível aumentar o volume");
		}
		
	}
	
    public void diminuirVolume() {
		
	}
    
    public void subirCanal() {
    	
    }
    
    public void descerCanal() {
    	
    }
	
	
    public float getConsumo() {
    	
    	float consumo = this.voltagem * this.tamanhoTela;
    	
    	return consumo;
    }
	

	


}







