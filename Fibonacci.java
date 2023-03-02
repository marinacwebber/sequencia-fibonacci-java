import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = 1;
		int n2 = 0;
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		int fim = 0;
		while (fim <= numero) {
			fim = n1 + n2;
			if (numero == fim) {
				System.out.println("O número informado pertence à sequência Fibonacci");
				return;
			}
			n2 = n1;
			n1 = fim;
	
		}
		System.out.println("O número NÃO PERTENCE à sequencia Fibonacci");

	}

}
