package Aula15;

import Aula14.Usuario;
import Aula14.Video;

public class Aula15 {

    public static void main(String[] args){

        // Criando usuário
        Usuario u[] = new Usuario[2];
        u[0] = new Usuario("João", 18, "Masculino", "John");
        u[1] = new Usuario("Maria", 25, "Feminino", "Mariazinha");

        // Criando vídeo
        Video v[] = new Video[2];
        v[0] = new Video("Aprenda Java em 7 Dias");
        v[1] = new Video("Aprenda React em 7 Dias");
        

        System.out.println(u[1].toString());
        System.out.println(v[1].toString());
    }
    
}
