package secao8;

public class Aluno {

	String nome;
	
	double nota1;
	double nota2;
	double nota3;
	double notaf = 0;
	
	public void notafinal() {
		notaf =  nota1+nota2+nota3;
	}
	
	
	
	public String toString() {
		
		if (notaf>=60) {
			return "Nota Final: "
					+ String.format("%.2f", notaf)
					+"\n passou";
		}
		else {
			
			double faltou = 60-notaf;
			
			return "Nota Final: "
					+ String.format("%.2f", notaf)
					+"\n falhou"
					+"\n"
					+"faltou "
					+String.format("%.2f", faltou)
					+" pontos";
		}
	}
	
}
