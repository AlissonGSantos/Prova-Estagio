import java.util.Scanner;

public class FibonacciChecker {

    public static void main(String[] args) {
        // Cria um objeto Scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir um número
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número pertence à sequência de Fibonacci
        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        // Fecha o scanner
        scanner.close();
    }

    // Metodo para verificar se um número pertence à sequência de Fibonacci
    public static boolean pertenceFibonacci(int numero) {


        int a = 0;
        int b = 1;

        // Gera a sequência de Fibonacci até que o número seja encontrado ou ultrapassado
        while (a < numero) {
            int temp = a;
            a = b;
            b = temp + b;
        }

        // Se o número for igual a 'a', ele pertence à sequência
        return a == numero;
    }
}
