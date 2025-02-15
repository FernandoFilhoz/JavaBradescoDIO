package edu.bradesco.java.sintaxe;

public class Metodos {
    public static void main(String[] args) {
        //Metodos Java, function
        //Caso o metodo não retorne nenhum valor, ele será representado pela palavra-chave void
    }
public class MyClass {
    public int somar(int n1, int n2) {
        n1 = 20;
        n2 = 40;
        return n1 + n2;
       }
    public double dividir(double n1, double n2) throws Exception {
        return n1 / n2;
     }
    public void imprimir (String texto) {
        System.out.println(texto);
     }
     private void imprimirPrivado (String texto) {
         System.out.println(texto);
     }
     public void validar(){
    //este metodo deve retornar algum valor true or false
     }
     public void calcularEnviar(){

     }
     public void gravarCliente (String nome, String sobrenome, int cpf){

     }
    }
}
