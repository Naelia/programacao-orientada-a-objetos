class Pessoa{
	
	String nome;
	int idade;
	

	void aniversario(int valor){
		this.idade = idade + valor;
	}

	void imprime(){
		System.out.println(nome);
		System.out.println(idade);
	}
}