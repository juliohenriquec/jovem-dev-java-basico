package aula6.outros;

public class Exercicio3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.printf("Operações com a = %s e b = %s %n", a, b);

        for (Calculadora2Enum operacao : Calculadora2Enum.values()) {
            System.out.println(operacao.getNomeAmigavel() + ": " + operacao.calcula(a, b));
        }
    }
}

