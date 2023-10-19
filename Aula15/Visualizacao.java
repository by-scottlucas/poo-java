package Aula15;

public class Visualizacao {
    private Usuario espectador;
    private Video video;

    public Visualizacao(Usuario espectador, Video video) {
        this.espectador = espectador;
        this.video = video;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.video.setViews(this.video.getViews() + 1);
    }

    public void avaliar() {
        this.video.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.video.setAvaliacao(nota);
    }

    public void avaliar(float porcentagem) {
        int total = 0;
        if (porcentagem <= 20){
            total = 3;
        } else if (porcentagem <= 50){
            total = 5;
        } else if (porcentagem <= 90){
            total = 8;
        } else {
            total = 10;
        }
        this.video.setAvaliacao(total);
    }

    public Usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Visualizacao [espectador=" + espectador + ", video=" + video + "]";
    }

}
