
public class SomaWhile {
    public static void main(String[] args) {
        int INDICE = 12, SOMA = 0, K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        // O resultado da soma é 77.
        System.out.println("A soma dos " + INDICE + " primeiros números inteiros é: " + SOMA);
    }
}
