package edu.bradesco.java.sintaxe;

public class ResultadoEscolarControleDeFluxoDIO02 {
    public static void main(String[] args) {
//        int nota = 6;
//
//        if(nota >= 7) {
//            System.out.println("Aprovado");
//        }else if(nota >= 5 && nota < 7){
//            System.out.println("Prova de recuperação");
//
//    }else {
//            System.out.println("Reprovado");
//        }

        //Ternário

        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}
