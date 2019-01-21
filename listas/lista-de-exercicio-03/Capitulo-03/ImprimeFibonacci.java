class ImprimeFibonacci{

	public static void main(String[] args) {

		int resultado=0,num=0,num1=1;

		while(resultado<=101) {
			
			System.out.println(resultado);
			resultado=num+num1;
			num=num1;
			num1=resultado;
		}
	}
}