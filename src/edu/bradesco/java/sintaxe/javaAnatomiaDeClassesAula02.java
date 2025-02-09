package edu.bradesco.java.sintaxe;

public class javaAnatomiaDeClassesAula02 {
    public static void main(String[] args) {
        String primeiroNome = "Fernando";
        String segundoNome = "Filho";
        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
       return primeiroNome.concat(" ").concat(segundoNome);
    }
}
