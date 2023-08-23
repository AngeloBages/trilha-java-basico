import java.util.Scanner;

public class Contador {

	static Scanner terminal = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println(" Digite o primeiro parametro:");
		int parametroUm = terminal.nextInt();
		System.out.println(" Digite o segundo parametro:");
		int parametroDois = terminal.nextInt();
		
		try{
			
			contar(parametroUm, parametroDois);
			
		}catch(ParametrosInvalidosException e) {
			
			System.out.println(" ERRO: O primeiro parametro não pode ser maior que o segundo");
		}
	}
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		
		if(parametroUm > parametroDois) {
			
		    throw new ParametrosInvalidosException();
		}else {
			
			int contagem = parametroDois - parametroUm;
			
			for(int i = 0 ; i < contagem ; i++) {
				
				System.out.println(" Imprimindo o parametro " + (i+1));
		    }
	    }
	}
}
