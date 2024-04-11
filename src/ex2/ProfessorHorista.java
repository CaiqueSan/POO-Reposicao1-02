package ex2;

public class ProfessorHorista extends Professor {
	
	int horasAula;
	double valorHora;
	
	public int getHorasAula() {
		return horasAula;
	}
	public void setHorasAula(int horasAula) {
		this.horasAula = horasAula;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double calcSalario() {
		return super.calcSalario(horasAula, valorHora);
	}
	
}
