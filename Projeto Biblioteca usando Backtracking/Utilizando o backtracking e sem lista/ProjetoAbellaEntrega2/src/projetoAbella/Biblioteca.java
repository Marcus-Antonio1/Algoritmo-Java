package projetoAbella;

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

    public void recomendarLivrosPorAutor(String autor) {
        Recomendacao recomendacao = new Recomendacao();
        recomendacao.recomendarPorAutor(livros, autor);
    }

    public void recomendacaoMelhor(String autor) {  // Backtracking
        Recomendacao recomendacao = new Recomendacao();
        recomendacao.recomendacaoMelhor(livros, autor);
    }
    
}