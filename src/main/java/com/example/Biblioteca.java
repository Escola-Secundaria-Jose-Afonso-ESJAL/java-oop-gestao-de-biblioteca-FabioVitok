package  com.example;

import java.util.ArrayList;

public class Biblioteca {
    private static final int MAX_LIVROS = 100; // Variável de classe
    private ArrayList<Livro> livros; // Variável de instância

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public boolean adicionarLivro(Livro livro) {
        if(livros.size() < 100 && !verificarLivro(livro.getTitulo())) {
            this.livros.add(livro);
            return true;
        }
        return false;
    }

    public boolean removerLivro(String titulo) {
        int i = 0;
        while(i < livros.size()){
            if(titulo == livros.get(i).getTitulo()) {
                livros.remove(i);
                return true;
            }
            i++;
            }
        return false;
        }

    public void listarLivros() {
        int i = 0;
        while(i < livros.size())
        {
            System.out.println(livros.get(i).infoLivro());
            i++;
        }
    }
    
    // Metodo para verificar se um livro já existe pelo titulo
    public boolean verificarLivro(String titulo) {
        int i = 0;
        while(i < livros.size()){
            if(titulo == livros.get(i).getTitulo()) {
                return true;
            }
            i++;
            }
        return false;
    }
}
