package Aula09;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPages;
    private int atualPage;
    private boolean aberto;
    private Pessoa leitor;

    // Métodos Públicos

    public String detalhes() {
        return "Detalhes do Livro \n\nTitulo: " + titulo + "\nAutor: " + autor + "\nPáginas: " + totalPages + "\nPáginas lidas: "
                + atualPage + "\nAberto: " + aberto + "\nLeitor: " + leitor.getNome();
    }

    public Livro(String titulo, String autor, int totalPages, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPages = totalPages;
        this.aberto = false;
        this.atualPage = 0;
        this.leitor = leitor;
    }

    // Métodos Especiais

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getAtualPage() {
        return atualPage;
    }

    public void setAtualPage(int atualPage) {
        this.atualPage = atualPage;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {

        if (p > this.totalPages){
            this.atualPage = 0;
        }
        else {
            this.atualPage = p;
        }
    }   

    @Override
    public void avançarPage() {
        this.atualPage++;
    }

    @Override
    public void voltarPage() {
        this.atualPage--;
    }

}
