package entidade;

public class Empregado {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	public Empregado(int id, String nome, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}	
	
	public Empregado(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}
	
	public void aumentaSalario(double porcentagem) {
		salario += salario * porcentagem / 100.0;
	}
	
	public String toString() {
		return id + ", " + nome + ", " + String.format("R$ %.2f", salario);
	}
}
