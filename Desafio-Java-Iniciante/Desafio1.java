import java.io.IOException;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	System.out.println("Digite quantos minutos faltam: ");
    	int N = leitor.nextInt();
    	System.out.println("Tempo fabricar presente 1: ");
    	int A = leitor.nextInt();
    	System.out.println("Tempo fabricar presente 2: ");
    	A += leitor.nextInt();
    	if ( A > N )
    		System.out.println("Deixa para amanhã!");
    	else
    		System.out.println("Farei hoje!");
    }
	
}
