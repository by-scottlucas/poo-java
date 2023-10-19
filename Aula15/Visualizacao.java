package Aula15;

public class Visualizacao {
    private Usuario espectador;
    private Video filme;

    public Visualizacao(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
    }


    public Usuario getEspectador() {
        return espectador;
    }
    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }


    @Override
    public String toString() {
        return "\nVisualizacao \nEspectador: " + espectador + "\nFilme=" + filme + "\n";
    }

    

    
    
}
