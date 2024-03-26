public class InvertendoValores {
    public static void main(String[] args) {
        boolean variavel = true;
        //declarando que minha variável é positiva

        //mas se eu quiser que em algum momento essa váriavel passe a ser falsa
        //utilizando o operador !

        System.out.println(!variavel);
        //imprimo o valor da variavel informando que quero que seja invertido

        variavel = !variavel;
        //aqui estou dizendo que quero transformar o valor da variavel para falso de forma definitiva.

        System.out.println(variavel);
        //imprimo o valor mesmo sem o sinal, pois ela ja está definida a partir de agora como falsa.
    }
}
