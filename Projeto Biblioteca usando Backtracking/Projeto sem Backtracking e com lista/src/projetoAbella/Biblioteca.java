package projetoAbella;

import java.util.List;

public class Biblioteca {
    
    private ArvoreBinaria livros;

    public Biblioteca() {
        livros = new ArvoreBinaria();
    }

    public void addLivro(Livro livro) {
        livros.adicionar(livro);
    }

    public void listarLivros() {
        livros.listarEmOrdem();
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        Livro livro = livros.buscarPorTitulo(titulo);
        if (livro != null) {
            System.out.println(livro);
            return livro;
        } else {
            System.out.println("Livro não encontrado.");
            return null;
        }
    }

    public List<Livro> recomendarLivrosPorAutor(String autor) {
        Recomendacao recomendacao = new Recomendacao();
        return recomendacao.recomendarPorAutor(livros, autor);
    }
}