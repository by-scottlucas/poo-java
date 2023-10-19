package Aula15;

public class Aula15 {

    public static void main(String[] args) {

        // Criando usuário
        Usuario u[] = new Usuario[2];
        u[0] = new Usuario("João", 18, "Masculino", "John");
        u[1] = new Usuario("Maria", 25, "Feminino", "Mariazinha");

        // Criando vídeo
        Video v[] = new Video[2];
        v[0] = new Video("Aprenda Java em 7 Dias");
        v[1] = new Video("Aprenda React em 7 Dias");

        // Criando visualização
        Visualizacao vis[] = new Visualizacao[2];
        vis[0] = new Visualizacao(u[0],v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(u[1], v[1]);
        vis[1].avaliar();
        System.out.println(35.0f);
        System.out.println(vis[1].toString());

        System.out.println(vis.toString());
        // System.out.println(u[1].toString());
        // System.out.println(v[1].toString());
    }

}
