class TestaPorta{

	public static void main(String[] args) {

		Porta porta1 = new Porta();
		
		porta1.cor="Preto";
        porta1.dimensaox=1.63;
        porta1.dimensaoy=0.63;
        porta1.dimensaoz=0.63;

		porta1.aberta(true);
		porta1.pinta("Branco");
		porta1.imprime();
	}
}