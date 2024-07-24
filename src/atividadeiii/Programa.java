package atividadeiii;

public class Programa {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Zé", 1000, 44, "20/07/2024");

		f1.calculaSalario();
		f1.imprimirDados();

		Funcionario f2 = new Funcionario("Maria", 2500, 40, "20/07/2024");

		f2.imprimirDados();
	}
}
