package com.example;

public class Main {
    public static void main(String[] args) {
        // Criar os 3 livros que queremos adicionar
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("Duna", "Frank Herbert", 1965);
        Livro livro3 = new Livro("1984", "George Orwell", 1949);
        
        // Criar a biblioteca
        Biblioteca bibliotecaLoures = new Biblioteca();
        
        // Adicionar os livros a biblioteca
        bibliotecaLoures.adicionarLivro(livro1);
        bibliotecaLoures.adicionarLivro(livro2);
        bibliotecaLoures.adicionarLivro(livro3);
        
        // Listar os livros
        bibliotecaLoures.listarLivros();
        
        // Remover um dos livros
        bibliotecaLoures.removerLivro(livro3.getTitulo());
        
        // Verificar se o livro foi removido
        bibliotecaLoures.listarLivros();
        
        // Tentar a dicionar um livro com o titulo igual ao outro
        bibliotecaLoures.adicionarLivro(livro1);
        
        // Veirificar que não ha dois livros com o titulo igual
        bibliotecaLoures.listarLivros();
        
        
        
    }
}
