class Casa{

	String cor;
	int porta1;
	int porta2;
	int porta3;

	void pinta(String variada){
		this.cor = variada;
		System.out.println(cor);
	}

	int abre(int x){
		return 1;
	}

	int fecha(int y){
		return 0;
	}

	void quantasPortasEstaoAbertas(){

		int resultado = porta1+porta2+porta3;
		
		if (resultado >= 1) {
			System.out.println("Total de portas abertas: " + resultado);
		}
		else{
			System.out.println("As portas estao todas fechadas!");
		}
	}

}