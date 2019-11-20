package secao8;

public class Empregado {

	String nome;
	double salario;
	double imposto;
	
	public double salarioLiquido() {
		return salario - imposto;
	}
	public double aumentoSalario(double porcentagem) {
		salario = salario*(1+porcentagem/100);
		return salario;
	}
	
	public String toString() {
		return "Nome: "
				+ nome
				+", salario Líquido: "
				+ String.format("%.2f", salarioLiquido());
	}
	
}
