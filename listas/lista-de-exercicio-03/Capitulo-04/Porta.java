class Porta{
	
	boolean aberta;
	String cor;
	double dimensaox;
	double dimensaoy;
	double dimensaoz;

	
	void pinta(String variada ){
		this.cor = variada ;
	}

	boolean aberta(boolean verifica){
		if (verifica == true) {
			System.out.println("A porta esta aberta!");
			return true;
		}
		else{
			System.out.println("A Porta esta fechada!");
			return false;
		}

	}

	void imprime(){
		System.out.println(cor);
		System.out.println(dimensaox);
		System.out.println(dimensaoy);
		System.out.println(dimensaoz);
	}
}