package atividadeii;

public class Carro {

	private int codigo;
	private String cor;
	private String modelo;
	private String marca;
	private int ano;
	private int numeroPorta;
	private String tipoCombustivel;
	private float qtdDisponivel;
	private float preco;
	private String tipoCarro;

	public void cadastrar(int codigo, String modelo, String cor, int ano, int numeroPorta, String tipoCombustivel,
			float qtdDisponivel, float preco, String tipoCarro, String marca) {

		this.codigo = codigo;
		this.cor = cor;
		this.modelo = modelo;
		this.ano = ano;
		this.numeroPorta = numeroPorta;
		this.tipoCombustivel = tipoCombustivel;
		this.preco = preco;
		this.tipoCarro = tipoCarro;
		this.marca = marca;

	}

	public void alterar(int codigo, String modelo, String cor, int ano, int numeroPorta, String tipoCombustivel,
			float qtdDisponivel, float preco, String tipoCarro, String marca) {

		this.codigo = codigo;
		this.cor = cor;
		this.modelo = modelo;
		this.ano = ano;
		this.numeroPorta = numeroPorta;
		this.tipoCombustivel = tipoCombustivel;
		this.preco = preco;
		this.tipoCarro = tipoCarro;
		this.marca = marca;

	}

	public void listar() {

		System.out.println("codigo " + codigo + " cor" + " modelo " + modelo + "ano " + ano);

	}

}
