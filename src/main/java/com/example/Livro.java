package com.example;

class Livro {
    private String titulo; // Variável de instância
    private String autor;  // Variável de instância
    private int ano;       // Variável de instância

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }
    
    public String infoLivro() {
        StringBuilder il = new StringBuilder();
        il.append("Título: " + this.getTitulo() + ", ");
        il.append("Autor: " + this.getAutor() + ", ");
        il.append("Ano: " + this.getAno() + ".\n");
        return il.toString();
    }
}
