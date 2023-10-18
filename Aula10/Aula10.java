package Aula10;

public class Aula10{

    public static void main(String[] args){

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("João");
        p1.setIdade(35);
        p1.setSexo("Masculino");

        p2.setNome("Zézinho");
        p2.setIdade(18);
        p2.setSexo("Masculino");
        p2.setCurso("Informática");

        p3.setNome("Joana");
        p3.setIdade(25);
        p3.setSexo("Masculino");
        p3.setSalario(2500.75f);

        p4.setNome("Maira");
        p4.setIdade(28);
        p4.setSexo("Feminino");
        p4.setSetor("Secretaria");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}