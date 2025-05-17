package main.java.model;

import main.java.interfaces.Publicacao;

public class Livro extends ItemBiblioteca implements Publicacao{
    private String autor;
    private int paginas;

    public Livro(String titulo, int anoPublicao, String autor, int paginas) {
        super(titulo, anoPublicao);
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + getInformacoesBasicas());
        System.out.println(String.format("Autor: %s, Paginas: %d",this.autor, this.paginas));
        System.out.println();
    }
}
