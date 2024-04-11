package ex2;

public class Principal {

	public static void main(String[] args) {
		ProfessorTitular professorTit = new ProfessorTitular();
		ProfessorHorista professorHor = new ProfessorHorista();
		
		professorTit.setNome("Lucas");
		professorTit.setIdade(48);
		professorTit.setAnosInstituicao(2);
		professorTit.setMatricula("001");
		professorTit.setSalario(5000);
		
		
		professorHor.setNome("Maria");
		professorHor.setIdade(32);
		professorHor.setMatricula("002");
		professorHor.setHorasAula(50);
		professorHor.setValorHora(60);
		System.out.println("Salario Horista: " + professorHor.calcSalario());
		System.out.println("Salario Titular: " + professorTit.calcSalario());
	}

}
