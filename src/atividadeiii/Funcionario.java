package atividadeiii;

public class Funcionario {

	private String nome;
	private long cpf;
	private long rg;
	private int matricula;
	private String dataContratacao;
	private float salarioBase;
	private float horasTrabalhadas;

	private static int geraMatricula = 0;

	public Funcionario(String nome, float salarioBase, float horasTrabalhadas, String dataContratacao) {

		this.nome = nome;
		this.salarioBase = salarioBase;
		this.horasTrabalhadas = horasTrabalhadas;
		this.dataContratacao = dataContratacao;
		this.matricula = ++geraMatricula;

	}

	public void calculaSalario() {
		Calculo calculo = new Calculo();

		calculo.calculaSalario(salarioBase, horasTrabalhadas);

	}

	public void imprimirDados() {
		System.out.println("O nome " + nome + " cpf " + cpf + " matricula " + matricula);

	}

}
