package main.java.model;

public abstract class ItemBiblioteca {
    private String titulo;
    private int anoPublicao;

    public ItemBiblioteca(String titulo, int anoPublicao){
        this.titulo = titulo;
        this.anoPublicao = anoPublicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicao() {
        return anoPublicao;
    }

    public String getInformacoesBasicas(){
        return String.format("%s, %d",this.titulo, this.anoPublicao);
    };
}
