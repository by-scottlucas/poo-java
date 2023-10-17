package Aula09;

public class Aula09 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("João", 22, "Masculino");
        p[1] = new Pessoa("Maria", 25, "Feminino");

        l[0] = new Livro("Introdução ao Java", "Casa do Código", 320, p[0]);
        l[1] = new Livro("Introdução ao Python", "Casa do Código", 350, p[1]);
        l[2] = new Livro("Introdução ao JavaScript", "Casa do Código", 380, p[1]);

        System.out.println(l[0].detalhes());

    }

}
