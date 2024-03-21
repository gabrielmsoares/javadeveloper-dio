public class Constante {
    
    public static void main(String[] args) {
        
        int dinheiro = 10;
        dinheiro = 20;

        System.out.println("Minha quantia é de " + dinheiro + " reais");
        
        final int MOEDAS = 100;
        //MOEDAS = 50; erro pois nao consigo alterar uma constante
        System.out.println("Eu tenho " + MOEDAS + " moedas");

    }
}
