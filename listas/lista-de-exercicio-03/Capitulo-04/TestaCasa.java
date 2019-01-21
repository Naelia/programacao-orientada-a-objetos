class TestaCasa{
	
	public static void main(String[] args) {
		
		Casa casa1 = new Casa();

		casa1.cor = "Branca";
		casa1.porta1= casa1.fecha(casa1.porta1);
		casa1.porta2= casa1.fecha(casa1.porta2);
		casa1.porta3= casa1.abre(casa1.porta3);
		casa1.pinta("Amarela");

		casa1.quantasPortasEstaoAbertas();
	}
}