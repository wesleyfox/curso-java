import java.sql.Date;

public class Operadores {
    public static void main(String[] args) {
        //Operadores
            // Cada tipo de dado há uma forma de declarar/atribuir valor
            String nome = "Wesley";
            int idade = 22;
            double peso = 68.5; //Necessário ponto para valor decimal
            char sexo = 'M'; // Aspas simples
            boolean doadorOrgao = false;
            //Date dataNacimento = new Date(); // Novo objeto

        //Aritmético
            double soma = 10.5 + 15.7;
            int subtracao = 113 - 25;
            int multiplicacao = 20*7;

        //Concatenação em valores tipo strings
            String nomeCompleto = "LÍNGUAGEM"+"_JAVA";
            System.out.println(nomeCompleto);

            String concatenacao = 1+1+1+"1"; // Após um concatenação, todos os "+" será entendido como concatenação.
            System.out.println(concatenacao);

            concatenacao = 1+"1"+1+1;
            System.out.println(concatenacao);

            concatenacao = "1"+(1+1+1); // Precedência permite que a operação aritimética seja realizada primeiramente.
            System.out.println(concatenacao);

        // Operadores unários
            //Aplicados juntamente com operadores aritiméticos. Modificam comportamento.
                //(+) unário positivo: numeros são positivos sem esse opera. explícito
                int numero = -5;
                numero = + numero;
                System.out.println(numero); // Não tornou positivo pois o operador é aritiméticos

                //(-) un. negativo: nega um número ou expressão
                numero = 5;
                System.out.println(- numero); // Printa valor negativo, mas não há alteração na var.
                System.out.println(numero);
                numero = - numero;
                System.out.println(numero);
                //(++)un. incremento: +1 incremental. Não é uma operação aritimética mas sim incremento no valor

                int numeroIncrementado = 0;
                numeroIncrementado++;
                System.out.println(++numeroIncrementado);


                //(--)un. decremento: -1 incremental
                numeroIncrementado--;
                System.out.println(numeroIncrementado);

                //(!)un. negação: iverte valores booleanos
                boolean numeroBooleano = true;
                numeroBooleano = !numeroBooleano;
                System.out.println(numeroBooleano);

        //Operador ternário (?)
            // forma/estrutura redúzida para adquirir um das expressões
            // <Expressão booleana> ? <Condição true> : <Condição false>
                //Saída <Condição seja>

            // Código IF convencional
            int a,b;
            a = 5;
            b = 6;
            String resultado;
            if(a == b){
                resultado = "verdadeiro";
            }else{
                resultado = "falso";
            }

            System.out.println(resultado);

            // Código operador ternário 
            String resultado2 =  a == b ? "verdadeiro" : "falso";

            System.out.println(resultado2);

        //Operadores relacionais. Resultado será valor booleano. Realizarão fluxos.
            //==, >=, <=, !=

        //Operadores lógicos. Resultado será valor booleano. Realizarão fluxos
            // &&, ||



    }
}
