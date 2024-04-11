package ex2;

public class Professor {
	
	String nome;
	String matricula;
	int idade;

	public double calcSalario(double salario, int anos) {
		salario = salario + (salario * (anos * 0.05));
		return salario;
	}
	
	public double calcSalario(int horasAula, double valorHora) {
		double salario = horasAula * valorHora;
		return salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
