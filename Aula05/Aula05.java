package Aula05;

public class Aula05 {

    public static void main(String[] args){
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Zacarias");
        p1.abrirConta("CC");

        p1.depositar(100);

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Jucinéia");
        p2.abrirConta("CP");

        p2.depositar(500);
        p2.sacar(150);

        p1.estadoAtual();
        p2.estadoAtual();

    }
    
}