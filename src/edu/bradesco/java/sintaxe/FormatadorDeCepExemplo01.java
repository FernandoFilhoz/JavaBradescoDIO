package edu.bradesco.java.sintaxe;

public class FormatadorDeCepExemplo01 {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
        } catch (CepInvalidoException01 e) {
            System.out.println("O cep não corresponde com as regras de negócio");;
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException01{
        if(cep.length() != 8){
            throw new CepInvalidoException01();
        }
        return "23.765-064";
    }
}
