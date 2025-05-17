package main.java.model;

import main.java.interfaces.Publicacao;

public class Revista extends ItemBiblioteca implements Publicacao{
    private int edicao;
    private String mes;

    public Revista(String titulo, int anoPublicao, int edicao, String mes) {
        super(titulo, anoPublicao);
        this.edicao = edicao;
        this.mes = mes;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Revista: " + getInformacoesBasicas());
        System.out.println(String.format("Edição: %d, Mês: %s",edicao, mes));
        System.out.println();
    }
}
