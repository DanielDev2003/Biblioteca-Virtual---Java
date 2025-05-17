package main.java;

import java.util.ArrayList;
import java.util.List;

import main.java.interfaces.Publicacao;
import main.java.model.Livro;
import main.java.model.Revista;

public class BibliotecaApp {
    public static void main(String[] args) {
        List<Publicacao> publicacoes = new ArrayList<>();

        publicacoes.add(new Livro("Java Básico", 2020, "João Silva", 320));
        publicacoes.add(new Revista("Ciência Hoje", 2023, 187, "Março"));
        publicacoes.add(new Livro("POO com Java", 2021, "Maria Souza", 450));
        publicacoes.add(new Revista("Tecnologia em Foco", 2022, 34, "Outubro"));

        System.out.println("Lista de Publicações:\n");
        for (Publicacao pub : publicacoes) {
            pub.exibirDetalhes();
        }
    }
}
