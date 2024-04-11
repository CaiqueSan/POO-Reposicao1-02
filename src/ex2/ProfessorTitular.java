package ex2;

public class ProfessorTitular extends Professor {
	
	int anosInstituicao;
	double salario;
	
	public int getAnosInstituicao() {
		return anosInstituicao;
	}
	public void setAnosInstituicao(int anosInstituicao) {
		this.anosInstituicao = anosInstituicao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcSalario() {
		return super.calcSalario(salario, anosInstituicao);
	}
}
