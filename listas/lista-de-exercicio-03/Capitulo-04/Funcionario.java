class Funcionario{
	//questao 1

	String nomeFuncionario;
	String nomeDoDepartamento;
	double salario;
	String entradaBanco;
	String rg;
	double ganhoAnual;

	void recebeAumento (double aumento){
		this.salario = this.salario + aumento;

	}

	double ganhoAnual(){
		ganhoAnual = salario * 12;

		return ganhoAnual;
	}
}

