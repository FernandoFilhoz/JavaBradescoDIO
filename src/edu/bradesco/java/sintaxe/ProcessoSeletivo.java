package edu.bradesco.java.sintaxe;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args){

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;

        do{
            //elas precisarão sofrer alterações
            atendeu = atender();
            continuaTentando = !atendeu;
            if(continuaTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso");
            }
        }while ( continuaTentando && tentativasRealizadas < 3);
        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas);
        } else{
            System.out.println("Não conseguimos contato com " + candidato + " número máximo de tentativas " + tentativasRealizadas);
        }
    }

    static void imprimirSelecionado(){
        String [] candidatos = {"Muzy", "Zancanelli", "Balestrin", "Mauricio", "Bruna"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº" + (indice+1) + " é o " +candidatos[indice]);
        }
        System.out.println("Forma abreviada do for each");

        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Muzy", "Zancanelli", "Balestrin", "Mauricio", "Bruna", "Giovana", "Juliana", "Luan", "Larissa", "Melissa"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados ++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2000);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra-proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
