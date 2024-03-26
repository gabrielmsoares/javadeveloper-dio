public class OperadoresLogicos {
    public static void main(String[] args) {
        
        boolean cond1 = true;
        boolean cond2 = false;
        //Aqui estou definindo duas variaveis booleanas. Uma verdadeira e a outra falsa

        if (cond1 && cond2){
            //Aqui estou dizendo que, se as duas condicoes forem verdadeiras...
            System.out.println("A expressão é verdadeira");
            //...para me imprimir essa mensagem informando.
        }else {
            //Aqui estou dizendo que, senao, se as duas condicoes forem falsas...
            System.out.println("A expressão é falsa");
            //...para me imprimir essa mensagem informando.
        }

        if (cond1 || cond2) {
            //Aqui estou dizendo que, se uma das duas condicoes forem verdadeiras...
            System.out.println("Uma das operacoes sao verdadeiras");
            //...para me imprimir essa mensagem informando.
        }else{
            //Aqui estou dizendo que, senao, se uma das duas condicoes forem falsas...
            System.out.println("Uma das operacoes sao falsas");
            //...para me imprimir essa mensagem informando.
        }

        System.out.println("Fim do programa");
        //Encerro o programa para garantir que deu tudo certo

    }
}