public class TiposDeDados {
    public static void main(String[] args) {
        
        byte idade = 123;
        short ano = 2024;
        int cep = 21071234; //se começar com 0, talvez precise mudar o tipo
        long telefone = 9876543210L; //se começar com 0, talvez precise mudar o tipo e precisa terminar com L
        float pi = 3.14F; //tipo float precisa terminar com um F no final
        double salario = 1275.33;

        System.out.println(idade);
        System.out.println(ano);
        System.out.println(cep);
        System.out.println(telefone);
        System.out.println(pi);
        System.out.println(salario);
    }
    
}