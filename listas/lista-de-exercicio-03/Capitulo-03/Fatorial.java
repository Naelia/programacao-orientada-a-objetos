class Fatorial{
	public static void main(String[] args) {
        
        int num,fatorial=1;
        
        for(num=1 ; num<=10 ; num++){
            fatorial = fatorial * num;
            System.out.println("O fatorial de "+ num + " eh (" +(num-1)+"!) * "+num+" = "+fatorial);            
        }
        
    }
}