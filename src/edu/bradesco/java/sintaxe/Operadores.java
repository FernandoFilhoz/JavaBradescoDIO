package edu.bradesco.java.sintaxe;

public class Operadores {
    public static void main(String[] args) {
        int numero = 10;
        int numero2 = 20;
        int soma = numero + numero2;
        int subtracao = numero - numero2;
        int multiplicacao = numero * numero2;
        int divisao = numero / numero2;
        int resto = numero % numero2;
        System.out.println(soma);
        System.out.println(subtracao);

        //Classe de operadores JAVA

        //CONCATENAÇÃO
        String nome = "Fernando";
        String sobrenome = "Filho";
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        int numeroPositivoNegativo  = 5;
        numeroPositivoNegativo =  + 1;
        numeroPositivoNegativo =  - 1;
        // Para o numero negativo ficar positivo tem que fazer multiplicação
        numeroPositivoNegativo =  - 1 * numeroPositivoNegativo;
        System.out.println(numeroPositivoNegativo);

        //Operador Ternario, <expressao condicional> ? <expressao que seja true> : <expressao que seja false>
        int numeroA = 10;
        int numeroB = 20;
        int maiorValor = numeroA > numeroB ? numeroA : numeroB;
        System.out.println(maiorValor);

        //Operadores Relacionais, == != >= <= > <
        int numeroC = 10;
        int numeroD = 10;
        boolean igual = numeroC == numeroD;
        System.out.println(igual);

        //Operadores Lógicos && ||
        boolean condicao = true && false || true;
        System.out.println(condicao);
    }
}
