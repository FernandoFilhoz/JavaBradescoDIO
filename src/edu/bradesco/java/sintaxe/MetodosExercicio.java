package edu.bradesco.java.sintaxe;

public class MetodosExercicio {
    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV();
        System.out.println("Tv está ligada? " + smartTv.ligada);
        System.out.println("A tv está em qual canal? " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status: " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);

        //RESUMO

        //ALGUNS METODOS PODEM TER PARAMETROS E PODEM MUDAR AS CARECTERISTICAS DAS VARIAVES COMO OS EXEMPLOS ACIMA
        //DO MUDAR CANAL, EU DEFINI NO PARENTESES QUE QUERIA O CANAL 13, E IMPRIMI ANTES DE DEFINIR PARA SABER
        //QUE O CANAL ATUAL ERA 1, E PASSOU A SER 13 DEPOIS DA DEFINIÇÃO
    }
}