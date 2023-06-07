public class VariaveisEMetodos {
    // Declaração de variáveis em Java
    // Estrutura:
        //Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)
        //int idade = 34;
        //double altura = 1.82;
        //Dog spike; Aqui Dog representa uma classe

    public static void main(String[] args) {
        //variáveis
        //int anoFabricação = 2022;

        //boolean verdadeira = true;

        //anoFabricação = 2018;

        String primeiroNome = "Wesley";
        String segundoNome = "Saraiva";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    // Declarando Métodos (equivalente a funções)
    //Estrutura
        //TipoRetorno NomeObjetivoInfinitivo Parametro(s)
        //int somar (int primeiroNumero, int segundoNumero)
        //String fomatarCep (long cep)

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }


}
