package Aula14;

public class Aula14 {

    public static void main(String[] args){

        // Criando usuário
        Usuario user1 = new Usuario("Jhonas",24,"Masculino", "MrJhonas");

        // Criando vídeo

        Video vid1 = new Video("Aprendendo Java");

        System.out.println(user1.toString());
        System.out.println(vid1.toString());
    }
    
}
