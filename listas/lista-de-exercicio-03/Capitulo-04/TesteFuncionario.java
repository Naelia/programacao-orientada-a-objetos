class TesteFuncionario{
	//questão2
	public static void main(String[] args) {
		Funcionario funcionarioUm = new Funcionario();


		funcionarioUm.nomeFuncionario = "naelia";
		funcionarioUm.entradaBanco = "10/10/2017";
		funcionarioUm.salario = 3500.0;
		funcionarioUm.rg = "201600852-1";
		funcionarioUm.nomeDoDepartamento = "administrativo";
		funcionarioUm.ganhoAnual();
		funcionarioUm.recebeAumento(200.0);

		System.out.println(" Nome do Funcionario: " + funcionarioUm.nomeFuncionario);
		System.out.println(" salario: " + funcionarioUm.salario);
		System.out.println(" Cargo na empresa: " + funcionarioUm.nomeDoDepartamento );

		System.out.println(" Registro Geral do Funcionario: " + funcionarioUm.rg);
		System.out.println(" Ganho anual do funcionario: " + funcionarioUm.ganhoAnual());
			
	}
		
}
