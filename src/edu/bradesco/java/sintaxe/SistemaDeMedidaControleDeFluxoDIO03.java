package edu.bradesco.java.sintaxe;

public class SistemaDeMedidaControleDeFluxoDIO03 {
    public static void main(String[] args) {
//        String sigla = "A";
//
//        switch (sigla) {
//            case "P": {
//                System.out.println("Pequeno");
//                break;
//            }
//            case "M": {
//                System.out.println("Médio");
//                break;
//            }
//            case "G": {
//                System.out.println("Grande");
//                break;
//            } default: {
//                System.out.println("INDEFINIDO");
//            }
//        }

        String plano = "M";

        if(plano == "B"){
            System.out.println("100 minutos de ligação");
        }else if (plano == "M"){
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
        }else if(plano == "T"){
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e instagram grátis");
            System.out.println("5GB de YouTube");
        }
    }
}
