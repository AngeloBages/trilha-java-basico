
import java.util.Scanner;

public class BancoTerminal {
	
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero;
		String agencia, nomeCliente;
		double saldo;
		
		System.out.println("Por favor, digite o n�mero da Ag�ncia ! ");
		agencia = ler.next();
		System.out.println("Por favor, digite o n�mero da Conta ! ");
		numero = ler.nextInt();
        System.out.println("Por favor, digite o seu Nome ! " );
        nomeCliente = ler.next();
        System.out.println("Por favor, digite o valor do seu saldo ! ");
        saldo = ler.nextDouble();
        
        System.out.printf("\n Ol� %s, obrigado por criar uma conta em nosso banco, ", nomeCliente);
        System.out.printf("sua ag�ncia � %s, conta %s e seu saldo %s j� est� dispon�vel para saque", agencia, numero, saldo);
	}
}
