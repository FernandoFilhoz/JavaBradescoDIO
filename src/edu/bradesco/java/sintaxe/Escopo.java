package edu.bradesco.java.sintaxe;

public class Escopo {
    public static void main(String[] args) {
        //escopo, variavel local
        int idade = 18;
        {
            int idade2 = 19;
            System.out.println(idade2);
        }
        System.out.println(idade);
    }

    //Função de controle de fluxo
    public double controleDeFluxo() {
        int idadeLocal = 25; // Variável de escopo local
        System.out.println("Idade local: " + idadeLocal);

        if (idadeLocal > 20) {
            String mensagem = "Maior que 20"; // Variável local dentro do bloco
            System.out.println(mensagem);
        } else {
            String mensagem = "Menor ou igual a 20"; // Variável local dentro do outro bloco
            System.out.println(mensagem);
        }
        return controleDeFluxo();
    }



    //basicamente um escopo é uma variavel local ou seja dentro de um metodo, exemplo:
  //int numeroDeCaminhoes = 50;
  //public void exemploDeEscopo{
    //  int numeroCarros = 10;
    //  }
    // a parte que está dentro do metodo só é acessível dentro do metodo, que é a variavel local,
    // já a parte fora não é o escopo e sim a
    // variavel da classe
    //tambem tem que vir como parametro canalLigado(int canalDesligado){
    // }
}
