public class OperadorTernario {

    public static void main(String[] args) {
    
        int a,b;
        //aqui estou declarando duas variáveis de tipo inteiro de uma vez
        a = 4;
        b = 6;
        //aqui dei valor a essas variáveis de tipo inteiro

        String resultado = a==b ? "verdadeiro" : "falso";
        //aqui já declaro a variavel resultado tipo String e estou dizendo que quero verificar se a variável a é igual a variável b.
        //se A for igual a B, o "?" verificará que sim.
        //se nao for igual a B, o ":" verificará que nao.

        System.out.println(resultado);
    }
}