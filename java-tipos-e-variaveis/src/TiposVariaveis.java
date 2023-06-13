public class TiposVariaveis {
    public static void main(String[] args) {
        
        // Tipos primitivos
            //int, byte, short, long, float, double, boolean e char
            
            // Partes fracionadas:
                //float, double

        // Declaração de variável 
            // <Tipo> <nomeSobre> = <Valor>;
            double salarioMinimo = 2.500; // 2.500 (dois vírgula quientos) != 2500 (dois mil e quientos)
            int cep = 01073333; // Se começar com zero o Java considerará o número 1 como primeiro caracter
            short ano = 2021;
            String cep2 = "0123070923"; // Aqui  o "0" será considerado
            float pi = 3.14F; // Encerrar com F, no tipo float
            long cpf = 98765432109L; // Encerrar com L, tipo long

        
        // Limite de por recurso por escopo de tipo na memória
            short numeroCurto = 1;
            int numeroNormal1 = numeroCurto;
            short numeroCurto2 = (short) numeroNormal1; // usando cast há uma conversão para po tipo shot

        // 'final' palavra reservada para constantes

            final double VALOR_DE_PI = 3.14;
            
            VALOR_DE_PI = 10.75; // Aqui um será mostrado como erro pois VALOR_DE_PI foi assinada como 'final'
            
            System.out.println(VALOR_DE_PI);

    }
}
