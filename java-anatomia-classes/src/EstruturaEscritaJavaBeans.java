//JavaBeans é uma iniciativa do JAVA que sugere formas de escrita universal para a legibilidade do código
//Conveções de escrita universal para classes, atributos, métodos e pacotes

public class EstruturaEscritaJavaBeans {

    public static void main(String[] args) {
        //Variaveis - Sugestões de nomenclatura
            // deve ser clara, sem abreviações ou definições sem sentido
            // é sempre no singular, exceto quando referir a um array ou coleção
            // definir idioma único para todo o projeto

            //Não recomendado
            double salMedio = 1500.23; // abreviada
            String emails = "aluno@teste.com"; // confuso pois dá ideia de varios e-mails
            String myName = "JOSEPH"; // erro se o projeto usa o PT-BR

            // Correções sugeridas
            double salarioMedio = 1500.23;
            String email = "aluno@teste.com";
            String [] emails2 = {"aluno@escola.com","professor@escola.com"};
            String meuNome = "JOSEPH";

        somar(1,2);
    }

        //Metodos
            // devem ser nomeados como verbos. Nome deve ser uma só ação
            // com exceção da primeira letra da segunda palvra composta, todas as demais devem ser minúsculas

    public static int somar(int n1, int n2){
        return n1+n2;
    }
    // Exemplos de métodos correto
    public static void abrirConexao(){}

    public static void concluirProcessamento(){}

    public static void findById(int id){} // por mais que seja idioma PT-BR, há sempre biblioteca que podem trazer métodos em inglês

    // Não recomendado
    public static void calcularImprimir(){} // nome está dúbio, calcula ou imprime? O recomendado é uma só ação   

}