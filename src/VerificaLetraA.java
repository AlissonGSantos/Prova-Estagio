import java.util.Scanner;

public class VerificaLetraA {

    public static void main(String[] args) {
        // Cria um objeto Scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir uma string
        System.out.print("Informe uma string: ");
        String entrada = scanner.nextLine();

        // Chama o metodo para contar a ocorrência da letra 'a'
        int quantidade = contaLetraA(entrada);

        // Verifica se a letra 'a' foi encontrada
        if (quantidade > 0) {
            System.out.println("A letra 'a' aparece " + quantidade + " vezes.");
        } else {
            System.out.println("A letra 'a' não foi encontrada.");
        }

        // Fecha o scanner
        scanner.close();
    }

    // Metodo para contar quantas vezes a letra 'a' aparece (maiúscula ou minúscula)
    public static int contaLetraA(String texto) {
        int contador = 0;

        // Itera sobre cada caractere da string
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            // Verifica se o caractere é 'a' ou 'A'
            if (caractere == 'a' || caractere == 'A') {
                contador++;
            }
        }

        return contador;
    }
}
