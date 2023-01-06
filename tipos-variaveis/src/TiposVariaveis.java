public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Tipos primitivos em Java: int, byte, short, long, float, double, boolean e char

        // Long precisa ter um L no final do valor
        long cpf = 25812185321L;
        // Float precisa ter um F no final do valor
        float pi = 3.14F;

        // Variáveis e Constantes
        int numero = 5;
        numero = 10;

        final double VALOR_DE_PI = 3.14;

        System.out.println(VALOR_DE_PI);

        // Quando detecta a concatenação, o programa não realiza expressões matemáticas, a menos que esteja em evidência
        String concatenacao = "";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1); // expressao matematica em evidencia
        System.out.println(concatenacao);

        // Operadores unários
        // (+), (-), (++), (--), (!)
        int valor = 7;
        valor = - valor;
        System.out.println(- valor);
        valor = valor * -1;
        System.out.println(valor);

        valor++;
        System.out.println(valor);
        System.out.println(++valor);
        System.out.println(--valor);

        boolean variavel = true;
        System.out.println(!variavel);
        variavel = !variavel;
        System.out.println(variavel);

        // Operadores ternários
        int a, b;
        a = 5;
        b = 6;
        String resultado;
        // Forma não abreviada:
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        // Forma abreviada (operador ternário):
        resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        int nota1 = 7;
        int nota2 = 10;
        double notaFinal = (nota1+nota2)/2;
        resultado = notaFinal>=6 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);

        /* Operadores relacionais
         * ==
         * !=
         * >
         * <
         * >=
         * <=
         * .equals() // Para texto
         */

        // Operadores Lógicos
        // &&   ||

        /*
         * Métodos
         * Todas as ações das aplicações são consideradas métodos. Correspondem a funções ou sub-rotinas
         * - Deve ser nomeado como verbo
         * - camelCase
         * 
         * Indica que o método poderá gerar uma exceção
         * public double dividir(int dividendo, int divisor) throws Exception{}
         * 
         * Private não pode ser visto por outras classes
         * 
         * Um método deve representar uma única responsabilidade. Não pode haver por exemplo "calcularEnviar()".
         */
        
    }
}
