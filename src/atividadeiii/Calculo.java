package atividadeiii;

public class Calculo {

	
	private float totalSalario;
	
	
	public void calculaSalario(float salarioBase, float horasTrabalhadas) {
		
		totalSalario = salarioBase * horasTrabalhadas;
	}
	
	public float getTotalSalario() {
		
		return totalSalario;
	}
	
}
