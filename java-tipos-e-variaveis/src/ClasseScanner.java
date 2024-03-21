//Primeiro, precisamos dizer ao Java que queremos usar o Scanner
import java.util.Scanner;

public class ClasseScanner{
    public static void main(String[] args) {
        
        //Imagine que a classe Scanner é como um ouvido mágico 
        //que escuta o que você digita no teclado. Ela pode pegar 
        //números, palavras e outras coisas que você escrever.

        Scanner scanner = new Scanner(System.in);
   
        //Agora, vamos pedir para o usuário digitar um número.
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        //nextInt() é como um comando mágico que pega o número 
        //que a pessoa digita e guarda na variável numero para 
        //que possamos usar depois.


        //Quando terminarmos de usar o Scanner
        scanner.close();
    
    }



}