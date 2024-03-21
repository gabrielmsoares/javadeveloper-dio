//inicio um código informnando o nome da minha classe, sempre por 
//letras maiusculas.
public class MeuMetodo2 {
    
    
    //se minha classe for executável, precisa seguir com o método 'main'
        public static void main(String[] args){
            //aqui dentro fica todo o código a ser executado
            
            //Declarando as variáveis
            String primeiroNome = "Gabriel";
            String segundoNome = "Soares";
            
            //variável            //método
            String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
            
            //retornando
            System.out.println(nomeCompleto);
            
       }
       //Definindo o método para retornar
       public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
        //ou
        //return primeiroNome+" "+(segundoNome);
    }
        
}
    
    